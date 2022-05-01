import java.sql.*;

public class Appl {
static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/Students";

static final String USER = "root";
static final String PASS = "dbpass";

public static Connection conn = null;
public static Statement stmt = null;
public static PreparedStatement pstmt = null;

    public static void connectToDB() throws ClassNotFoundException, SQLException {
// Register JDBC driver
        Class.forName(JDBC_DRIVER);
// Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Students "
                + "(id INTEGER NOT NULL AUTO_INCREMENT, "
                + " name VARCHAR(255), " + " rate DOUBLE, " + " PRIMARY KEY (id))";
        stmt.executeUpdate(sql);
    }

    public static void addStudent(String name, double rate) throws SQLException {
        String sql = "INSERT INTO Students(name, rate) VALUES(?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setDouble(2, rate);
        pstmt.executeUpdate();
    }

    public static void getAllStudents() throws SQLException {
        stmt = conn.createStatement();
        String sql = "SELECT id, name, rate FROM Students";
        ResultSet rs = stmt.executeQuery(sql);
        printResultSet(rs);
    }
    public static void findByRate(double rate) throws SQLException {
        String sql = "SELECT id, name, rate FROM Students where rate > ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setDouble(1, rate);
        ResultSet rs = pstmt.executeQuery();
        printResultSet(rs);
    }

    private static void printResultSet(ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double r = rs.getDouble("rate");
            System.out.println("ID: " + id + ", name: " + name + ", rate: " + r);
        } }


    public static void main(String[] args) {
        try {
            connectToDB();
            stmt = conn.createStatement();
            createTable();
            addStudent("Vasyl", 4.8);
            addStudent("Olga", 4.3);
            addStudent("Petro", 5);
            getAllStudents();
            findByRate(4.5);
        } catch (Exception se ) {
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {  } } } }

