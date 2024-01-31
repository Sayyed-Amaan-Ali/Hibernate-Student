import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void add_data() {
		Scanner sc=new Scanner(System.in);
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Students students=new Students();
		students.setId(sc.nextInt());
		students.setName(sc.next());
		System.out.println("to continue press 1");
		session.save(students);
		transaction.commit();
		session.close();
		sessionFactory.close();
		if(sc.nextInt()==1) {
			add_data();
		}
	}
}
