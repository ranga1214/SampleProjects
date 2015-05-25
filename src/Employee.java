
/**
 * @author Bobby1214
 *
 */
public class Employee {
	
	private int eno;
	private String ename;
	private String dept;
	public Employee(){
	}
	
	public Employee(String ename,String dept)
	{
		this.ename=ename;
		this.dept=dept;
	}
	
	public int getEno() {
		return eno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getDept() {
		return dept;
	}

	public void setEno(int eno) {
		// TODO Auto-generated method stub
		this.eno=eno;
	}

	public void setEname(String ename) {
		// TODO Auto-generated method stub
		this.ename=ename;
	}

	public void setDept(String dept) {
		// TODO Auto-generated method stub
		this.dept=dept;
	}
	
	
	

}
