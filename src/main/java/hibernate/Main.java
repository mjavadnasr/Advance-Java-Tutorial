package hibernate;

public class Main {
    public static void main(String[] args) {
        users users = new users(1,"javad");
        users users1 = new users(2,"ali");
//
        UserDao dao = new UserDao();
//       dao.save(user);
//        dao.save(user1);

        dao.deleteUserByID(1);
//        dao.getAllStudents();
    }
}