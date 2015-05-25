import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client {
private static Session session;
private static Transaction trans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object for configuration file
		Configuration config=new Configuration();
		//Configure() method reads the configuration file
		config.configure();
		//Build session factory.After using this configuration object is removed from the memory.
		SessionFactory factory=config.buildSessionFactory();
		//Open new session.By default sessions starts wit a transaction.
		session=factory.openSession();
		trans=session.beginTransaction();
		Employee em=new Employee();
		em.setEname("Raju");
		em.setDept("ECE");
		Integer eno1=(Integer)session.save(em);
		trans.commit();
		trans=session.beginTransaction();
		Object obj = session.get(Employee.class, new Integer(1));
		Employee emp = (Employee) obj;
		trans.commit();
		
		
		//Deletion
		
		trans = session.beginTransaction();
		session.delete(emp);
		trans.commit();
	
		
		//Update
		trans = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEno(2);
		employee.setEname("Manoj");
		session.update(employee);
		trans.commit();
		
		
}
}
