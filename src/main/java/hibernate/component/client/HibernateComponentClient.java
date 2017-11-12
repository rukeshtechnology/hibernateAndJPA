package hibernate.component.client;

import org.hibernate.Session;

import hibernate.component.entity.Address;
import hibernate.component.entity.Person;
import hibernate.firstexample.util.HibernateUtil;

public class HibernateComponentClient {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		HibernateComponentClient client = new HibernateComponentClient();
		client.savePerson(session);
		//client.readPerson(session);
		//client.updatePerson(session);
		//client.deletePerson(session);
	}

	// CRUD operations
	public void savePerson(Session session) {
		session.beginTransaction();
		Person person = new Person();
		person.setName("Rukesh Tamrakar");
		Address address = new Address();
		address.setStreet("24913 Earlsford Dr");
		address.setCity("Chantilly");
		address.setZipcode("20152");
		person.setAddress(address);
		
		session.save(person);
		session.getTransaction().commit();
		session.close();
	}

	/*public void readMessage(Session session) {
		session.beginTransaction();
		Message message = (Message) session.get(Message.class, 3L);
		session.getTransaction().commit();
		printMessage(message);
		session.close();
	}

	public void updateMessage(Session session) {
		session.beginTransaction();
		Message message = (Message) session.get(Message.class, 1L);
		message.setText("Hello World with Hibernate & JPA Annotations 21");
		session.getTransaction().commit();
		printMessage(message);
		session.close();
	}

	public void deleteMessage(Session session) {
		session.beginTransaction();
		Message message = (Message) session.get(Message.class, 3L);
		session.delete(message);
		session.getTransaction().commit();
		printMessage(message);
		session.close();
	}*/

	public void printMessage(Person person) {
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAddress().getStreet());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getZipcode());
	}
}
