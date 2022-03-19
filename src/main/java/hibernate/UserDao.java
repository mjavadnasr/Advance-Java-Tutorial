package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public void save(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
        }
    }

    public void updateUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);

            transaction.commit();


        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
        }
    }

    public void gatUserByID(long id)
    {
        Transaction transaction = null;
        User user = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.get(User.class, id);
            transaction.commit();




        }
        catch (Exception e)
        {
            if (transaction!=null)
                transaction.rollback();
        }
    }

    public List<User> getAllStudents()
    {
        Transaction transaction = null;
        List<User> users = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            users = session.createQuery("from users").list();
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction!=null)
                transaction.rollback();
        }
        return users;
    }


    public void deleteUserByID(long id){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            User user = session.get(User.class,id);
            session.delete(user);

            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null)
                transaction.rollback();
        }
    }


}