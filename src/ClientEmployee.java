

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object for configuration file
		Configuration config=new Configuration();
		//Configure() method reads the configuration file
		config.configure();
		//Build session factory.After using this configuration object is removed from the memory.
		SessionFactory factory=config.buildSessionFactory();
		//Open new session.By default sessions starts wit a transaction.
		System.out.println("Factory created");
		Employee emp=new Employee();
		emp.setEno(16);
		emp.setEname("Ranga");
		emp.setDept("CSE");
		
		Employee emp1=new Employee();
		   emp1.setEno(17);
		   emp1.setEname("sanjay");
		   emp1.setDept("IT");
		   
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		//Object is create for the employee class.We use the object to set values for the properties.
		
		//Perform persistence operations.A single row operation is performed over here.
	  session.saveOrUpdate(emp);  
	   
	   session.save(emp1);
	   Employee emp2=(Employee)session.get(Employee.class,new Integer(17));
	   
	   emp2.setEname("ranga");
	   session.update(emp2);
	   Employee emp3=(Employee)session.get(Employee.class,new Integer(16));
	   session.delete(emp3);
	 
		//Commit() method is used to execute the transaction.
		trans.commit();
		session.close();
		

	}

}
