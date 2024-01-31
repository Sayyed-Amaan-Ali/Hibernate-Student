import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void remove() {
		Scanner sc=new Scanner(System.in);
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println("enter id to delete");
		Students students=session.get(Students.class, sc.nextInt());
		session.delete(students);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}

}
