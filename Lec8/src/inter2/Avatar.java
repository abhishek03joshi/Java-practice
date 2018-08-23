package inter2;

public class Avatar implements iAvatar {
	
	int charid;
	String name;
	int x,y;
	Action action;
	
	Avatar(int charid, String name, Action action){
		this.charid=charid;
		this.name=name;
		x=0;
		y=0;
		this.action=action;
		
	}
	
	public void move(int x, int y) {
		if(x==1) {
			if(y==1) {
				System.out.println("Moves up right diagonal");
			}
			else if(y==-1){
				System.out.println("Moves down right diagonal");
			}
			else if(y==0) {
				System.out.println("Moves right");
			}
			else{
				System.out.println("Incorrect y co-ordinate");
			}
		}
		
		else if (x==-1) {
			if(y==1) {
				System.out.println("Moves up left diagonal");
			}
			else if(y==-1){
				System.out.println("Moves down left diagonal");
			}
			else if(y==0) {
				System.out.println("Moves left");
			}
			else{
				System.out.println("Incorrect y co-ordinate");
			}
		}
		else if (x==0) {
			if(y==1) {
				System.out.println("Moves up");
			}
			else if(y==-1){
				System.out.println("Moves down");
			}
			else if(y==0) {
				System.out.println("No motion");
			}
			else{
				System.out.println("Incorrect y co-ordinate");
			}
		}
		else {
			System.out.println("Incorrect x co-ordinate");
		}
		
	}
	
	public void appear() {
		System.out.println("This is the appearance of the avatar");
	}
	
	public void action() {
		switch(action) {
		case walk:
			System.out.println("Character walks");
			break;
		case run:
			System.out.println("Character runs");
			break;
		case stop:
			System.out.println("Character stops");
			break;
		case jump:
			System.out.println("Character jumps");
			break;
		case attack:
			System.out.println("Character attacks");
			break;
		case defend:
			System.out.println("Character defends");
			break;
		default:
			System.out.println("Invalid action");
		
		}
	}
	

}
