package Inter;

public class TV implements iTV{

	int state;
	int channel;
	int volume;
	
	public TV() {
		state=1;
		channel=1;
		volume=3;
	}
	
	
	public void on() {
		state =1;
		System.out.println("TV started");
	}
	public void off() {
		state =0;
		System.out.println("TV switched OFF");
	}
	public void volumeUp() {
		volume++;
	}
	public void volumeDown(){
		volume--;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
	public void display() {
		if(state == 1) {
			System.out.println("Tv is ON");
			System.out.println("Volume "+volume);
			System.out.println("Channel "+channel);
		}
		else {
			System.out.println("Tv is OFF");
		}
		
	}
	
}
