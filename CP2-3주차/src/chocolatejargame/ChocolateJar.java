package chocolatejargame;

public class ChocolateJar implements Jar {

	private int chocolate;
	private int chilli;
	String status;

	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}

	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		chilli = 1;
	}

	public int getItem() {
		return chocolate + chilli;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getChilli() {
		return chilli;
	}

	public void takeItem(int hand) {
		if(chocolate < 1) {
			chilli--;
		}
		else
			chocolate = chocolate - hand;
	}

	public String status() {
		String chil = "", cho = "";
		for (int j = 0; j < chilli; j++) {
			chil += "бс ";
		}
		for (int j = 0; j < chocolate; j++) {
			cho += "бр ";
		}
		return "[ "+chil+cho+"]";
	}

	public boolean isEmpty() {
		if (chilli == 1) {
			return true;
		} else
			return false;
	}
}
