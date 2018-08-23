package kingdom;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		King k = new King("John","M","Christian","His royal highness","Baratheon");
		k.voice();
		k.walk();
		k.showKing();
		Queen q = new Queen("Nymera","F","Pagan","Her royal highness","Baratheon");
		q.voice();
		q.walk();
		q.showQueen();
		
		Knight kg = new Knight("Nitin","M","Sanatan","Sword","Arabian black horse");
		kg.voice();
		kg.walk();
		kg.action();
		kg.showKnight();
		
		

	}

}
