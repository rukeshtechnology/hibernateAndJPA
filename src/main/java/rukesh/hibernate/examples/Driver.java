package rukesh.hibernate.examples;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {
	
	public static void main(String[] args) {
		//Session session = HibernateUtil.getSessionFactory().openSession();
		//session.beginTransaction();

		ApplicationUsers appUsers = new ApplicationUsers();
		appUsers.setUserId("1003");
		appUsers.setFirstName("Savannah");
		appUsers.setLastName("Tamrakar");
		appUsers.setStreet("Earlsfor");
		appUsers.setCity("Chantilly");
		appUsers.setState("VA");
		appUsers.setZip("20152");

		/*session.save(appUsers);    

		session.getTransaction().commit();
		session.close();
*/		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(appUsers);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}
}