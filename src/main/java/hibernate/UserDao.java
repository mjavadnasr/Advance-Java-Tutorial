package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public void save(users users) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(users);
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
        }
    }

    public void updateUser(users users) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(users);

            transaction.commit();


        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
        }
    }

    public void gatUserByID(long id)
    {
        Transaction transaction = null;
        users users = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.get(users.class, id);
            transaction.commit();




        }
        catch (Exception e)
        {
            if (transaction!=null)
                transaction.rollback();
        }
    }

    public List<users> getAllStudents()
    {
        Transaction transaction = null;
        List<users> users = null;
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
            users users = session.get(users.class,id);
            session.delete(users);

            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null)
                transaction.rollback();
        }
    }


}