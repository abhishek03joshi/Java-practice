package CompositeModel;
import java.util.ArrayList;
import java.util.List;

public class EmpComposite {
	
	private String strName;
	private String strDept;
	private int iSalary;
	private List<EmpComposite> subordinates;
	
	public EmpComposite(String Name, String Dept, int Sal) {
		this.strName=Name;
		this.strDept=Dept;
		this.iSalary=Sal;
		subordinates = new ArrayList<EmpComposite>();
	}
	
	public void add(EmpComposite e) {
		subordinates.add(e);
	}
	
	
	public void remove(EmpComposite e) {
		subordinates.remove(e);
	}
	
	public List<EmpComposite> getSubordinates(){
		return subordinates;
	}
	
	public String toString() {
		return ("EmpComposite :[Name: "+strName+",Dept"+strDept+",Salary"+iSalary+"]");
	}
	
	
	

}
