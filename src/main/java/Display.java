import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display {
	@SuppressWarnings("rawtypes")
	public static void show() {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("from Students");
		@SuppressWarnings("unchecked")
		List<Students> list=query.list();
		for(Students e:list)
		{	
			System.out.println(e.getId()+"\t"+e.getName());
		}
		
		sessionFactory.close();
		
	}

}
