package hibernate.firstexample.client;

import org.hibernate.Session;

import hibernate.firstexample.util.HibernateUtil;
import hibernate.firstexample.entity.Message;

public class HelloWorldClient {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		HelloWorldClient client = new HelloWorldClient();
		client.saveMessage(session);
		// client.readMessage(session);
		//client.updateMessage(session);
		//client.deleteMessage(session);
	}

	// CRUD operations
	public void saveMessage(Session session) {
		session.beginTransaction();
		Message message = new Message("Hello World with Hibernate & JPA Annotations 23");
		session.save(message);
		session.getTransaction().commit();
		session.close();
	}

	public void readMessage(Session session) {
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
	}

	public void printMessage(Message message) {
		System.out.println(message.getId());
		System.out.println(message.getText());
	}
}