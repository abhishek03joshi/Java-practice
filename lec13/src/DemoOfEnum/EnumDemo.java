package DemoOfEnum;

public class EnumDemo {

	Day day;
	
	public EnumDemo(Day day) {
		this.day=day;
	}
	
	public void liking() {
		switch(day) {
			case SUNDAY:
				System.out.println("The day is Sunday");
				break;	
			case MONDAY:
				System.out.println("The day is Monday");
				break;
			case TUESDAY:
				System.out.println("The day is Tuesday");
				break;
			case WEDNESDAY:
				System.out.println("The day is Wednesday");
				break;
			case THURSDAY:
				System.out.println("The day is Thursday");
				break;
			case FRIDAY:
				System.out.println("The day is Friday");
				break;
			case SATURDAY:
				System.out.println("The day is Saturday");
				break;
			default:
				System.out.println("No such day");
				break;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDemo sday = new EnumDemo(Day.SUNDAY);
		sday.liking();
		System.out.println(sday.day);
		EnumDemo mday = new EnumDemo(Day.MONDAY);
		mday.liking();
		EnumDemo tday = new EnumDemo(Day.TUESDAY);
		tday.liking();
		EnumDemo wday = new EnumDemo(Day.WEDNESDAY);
		wday.liking();
		EnumDemo thday = new EnumDemo(Day.THURSDAY);
		thday.liking();
		EnumDemo fday = new EnumDemo(Day.FRIDAY);
		fday.liking();
		EnumDemo stday = new EnumDemo(Day.SATURDAY);
		stday.liking();
		
		

	}

}
