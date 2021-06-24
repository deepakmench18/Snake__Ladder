public class UC1_Initial_position {
	public static void main(String[] args) {
		System.out.println("Welcome ");
		int P = 0;
                System.out.print("Enter player name: ");
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		System.out.println("Player name is: " + Name);
		System.out.println(P + "Initial position of player is " );
                int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + Dice);
		int number = (int) (Math.floor(Math.random() * 10) % 3);
		switch (number) {
			case 0:
				System.out.println("No play");
				P = P + 0;
				break;
			case 1:
				System.out.println("Ladder");
				P = P + Dice;
				break;
			default:
				System.out.println("Snake");
				P = P - Dice;
				if (P < 0)
					P = 0;
		}
		System.out.println("Player position is: " + P);
}
}
