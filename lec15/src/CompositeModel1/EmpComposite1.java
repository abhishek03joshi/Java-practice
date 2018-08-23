package CompositeModel1;
import java.util.ArrayList;
import java.util.List;

public class EmpComposite1 {
	
	private String strName;
	private String strDept;
	private double iSalary;
	private List<EmpComposite1> subordinates;
	
	public EmpComposite1(String strName, String strDept, double iSalary) {
		this.strName=strName;
		this.strDept=strDept;
		this.iSalary=iSalary;
		subordinates = new ArrayList<EmpComposite1>();
	}
	
	public void add(EmpComposite1 e) {
		subordinates.add(e);
	}
	
	public void remove(EmpComposite1 e) {
		subordinates.remove(e);
	}
	
	public List<EmpComposite1> getSubordinates(){
		return subordinates;
	}
	
	//Overwrite toString method to define customized representation of the object
	public String toString() {
		return("EmpCompsite1 :[Name:"+strName+", Dept:"+strDept+", Salary:"+iSalary+"]");
	}	

}
