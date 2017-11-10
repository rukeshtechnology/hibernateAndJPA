package hibernate.firstexample.client;

import org.hibernate.Session;

import hibernate.firstexample.util.HibernateUtil;
import hibernate.firstexample.entity.Message;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		session.beginTransaction();
        
        		Message message = new Message( "Hello World with Hibernate & JPA Annotations" );
        
        		session.save(message);    
        
        		session.getTransaction().commit();
        		session.close();
	
	}
}

