import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

//        Настройте соединение из java-проекта с SQL Server.
//        Создайте таблицу Cars с полями id (int), model (String), year_of_production (int)
//        Вставьте в таблицу новые записи о трех разных автомобилях
//        Введите год выпуска из консоли и получите информацию о соответствующих автомобилях
//        Удалить самые старые автомобили
public class Cars_db {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Cars";

    static final String USER = "root";
    static final String PASS = "dbpass";

    public static Connection conn = null;
    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;

    public static void ConnectDB() throws ClassNotFoundException , SQLException{
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    public static void CreateTable() throws SQLException {
        stmt = conn.createStatement();
        String sql ="CREATE TABLE IF NOT EXISTS Cars "
                + "(id INTEGER NOT NULL AUTO_INCREMENT, "
                + " model VARCHAR(255), "
                + " year_of_production INTEGER, "
                + " PRIMARY KEY (id))";
        stmt.executeUpdate(sql);
    }
    public static void addCar(String model,int year_of_production) throws SQLException{
        String sql = "INSERT INTO Cars (model,year_of_production) VALUES (?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,model);
        pstmt.setInt(2,year_of_production);
        pstmt.executeUpdate();
    }

    public static void findByYear(int year) throws SQLException{
        String sql = "SELECT id, model, year_of_production FROM Cars where year_of_production =?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,year);
        ResultSet rs = pstmt.executeQuery();
        printResult(rs);
    }

    public static void printResult(ResultSet rs) throws SQLException{
        while(rs.next()){
            int id = rs.getInt("id");
            String model = rs.getString("model");
            int year = rs.getInt("year_of_production");
            System.out.println("ID: "+id+", Model: "+model+", Year: "+year);
        }
    }
    public static void getAllCars()throws SQLException{
        String sql = "SELECT * FROM Cars";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        printResult(rs);
    }

    public static void deleteOld(int year) throws SQLException{
        String sql = "DELETE FROM Cars where year_of_production < ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,year);
        pstmt.executeUpdate();
    }


    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            ConnectDB();
            CreateTable();
            addCar("Lexus",1986);
            addCar("Volvo",2012);
            addCar("Ford",2005);
            System.out.println("getAllCars");
            getAllCars();
            System.out.println("Введите номер года авто");
            int year = Integer.parseInt(br.readLine());
            System.out.println("findByYear");
            findByYear(year);
            System.out.println("Введите до какого года удалить машины");
            int oldYear = Integer.parseInt(br.readLine());
            System.out.println("deleteOld");
            deleteOld(oldYear);
            System.out.println("getAllCars");
            getAllCars();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(conn!=null) conn.close();
                if(stmt!=null) conn.close();
                if(pstmt!=null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
