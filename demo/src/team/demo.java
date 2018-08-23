package team;

public class demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		player p= new player();//player 1 object
		contract c1 = new contract();
		player q = new player();//player 2 object
		contract c2 = new contract();
		
		
		p.setBio(p);//set for Lionel Messi
		p.setFinance(c1);
		System.out.println();
		q.setBio(q);//set for Didier Drogba
		q.setFinance(c1);
		System.out.println();
		p.showBio(p);//show for Lionel Messi
		p.showContract(c1);
		q.showBio(q);//show for Didier Drogba
		q.showContract(c2);
	}
	
	

}
