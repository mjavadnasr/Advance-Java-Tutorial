package hibernate;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(1,"javad" , "nasrolla");
//        Student student1 = new Student(2,"ali" , "alavi");
//
        UserDao dao = new UserDao();
//
//        dao.save(student);
//        dao.save(student1);

//        dao.deleteStudentByID(1);
        dao.getAllStudents();
    }
}