
package hibernate.associations.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.firstexample.util.HibernateUtil;

public class HibernateAssociationsClient {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();

			Guide guide = new Guide("2000MO10789", "Mike Lawson", 1000);
			Student student = new Student("2014JT50123", "John Smith", guide);

			session.save(guide);
			session.save(student);

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
