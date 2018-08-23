package inter2;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iAvatar hulk = new Avatar(1, "Hulk", Action.run);
		hulk.action();
		hulk.appear();
		hulk.move(1,1);
		
		iAvatar ironman = new Avatar(2,"Iron-Man",Action.defend);
		ironman.action();
		ironman.appear();
		ironman.move(0, 1);

	}

}
