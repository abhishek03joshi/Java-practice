package software;
import java.util.Scanner;

public class Software {
	
	Scanner sc= new Scanner(System.in);
	
	String plat;
	String OS;
	String fmwk;
	String type;
	String server;
	int i=0;
	
	public Software(){
		System.out.println("Default constructor");
		plat="JAVA";
		OS="All with JVM";
		fmwk="JVM";
		type="Web-Application";
		server="Apache Tomcat";
		
	}
	
	public Software(String plat, String OS, String fmwk, String type, String server) {
		System.out.println("Parametrized constructor");
		this.plat=plat;
		this.OS=OS;
		this.fmwk=fmwk;
		this.type=type;
		this.server=server;		
	}
	
	public Software(Software s) {
		System.out.println("Object param construcutor");
		this.plat=s.plat;
		this.OS=s.OS;
		this.fmwk=s.fmwk;
		this.type=s.type;
		this.server=s.server;
		
	}
	
	public Software(int i) {
		System.out.println("Input constructor");
		System.out.println("Plese enter the platform name");
		plat=sc.next();
		System.out.println("Please enter the OS name");
		OS=sc.next();
		System.out.println("Please enter the framework name");
		fmwk=sc.next();
		System.out.println("Please enter the application type");
		type=sc.next();
		System.out.println("Please enter the application server name");
		server=sc.next();
		
	}
	
	public void show() {
		System.out.println("Software platform is "+plat);
		System.out.println("Software OS is "+OS);
		System.out.println("Software framework is "+fmwk);
		System.out.println("Software type is "+type);
		System.out.println("Software server is "+server);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Software a = new Software();
		a.show();
		Software b = new Software("Python","ALL","PythonSDK","Django and HTML5/CSS", "Apache");
		b.show();
		Software c = new Software(b);
		c.show();
		Software d = new Software(4);
		d.show();
		

	}

}
