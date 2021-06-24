public class UC1_Initial_position {
	public static void main(String[] args) {
		System.out.println("Welcome ");
		int P = 0;
		System.out.println(P + "Initial position of player is " );
                int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + Dice);
}
}
