package Customer;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		retailCustomer rc = new retailCustomer(100,"Permanent","NYC",250000);
		
		rc.contact();
		rc.discount(12, 120000, "Permanent");
		
		onlineCustomer oc = new onlineCustomer(101,"Contract",150000);
		oc.contact();
		oc.discount(12, 1200000, "Contract");
		
		
		

	}

}
