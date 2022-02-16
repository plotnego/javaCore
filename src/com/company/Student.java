package com.company;
//Разработайте класс Student с полем int, которое соответствует курсу, который изучает студент.
//        В классе Student создайте конструктор с параметрами для инициализации всех полей в классе и
//        переопределите метод info() (который также добавит информацию о курсе в предыдущую строку)
//        и метод activity() из класса Person.
//        Метод activity() должен возвращать строковое значение,
//        являющееся типом деятельности для соответствующего подтипа Person,
//        например, для студента — это может быть значение «Я учусь в университете».
//        В методе main(...) создайте два экземпляра класса Student
//        и выведите информацию о них, вызвав соответствующие методы info() и activity().
public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age,int course) {
        super(fullName, age);
        this.course=course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        return "Имя: "+fullName.getFirstName()+", Фамилия: "+fullName.getLastName()+", Возраст: "+getAge()+", Курс: "+getCourse();
    }

    @Override
    public String activity() {
        return "Я учусь в университете";
    }
}
