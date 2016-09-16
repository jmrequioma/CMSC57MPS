/******************************************************************************
 *  	Compilation:  javac PakGanern.java
 *  	Execution:    java PakGanern times
 *  
 *  	Outputs the game "Pak Ganern" with a given input of how many
 *	times the game will be played until it is over.
 *
 *	% java PakGanern 0
 *	Invalid input.
 *
 *	% java PakGanern 1
 *	pak
 *	pak ganern
 *
 *	% java PakGanern 4
 *	pak
 *	pak ganern
 *	pak pak ganern ganern
 *	pak pak pak ganern ganern ganern
 *	pak pak pak pak ganern ganern ganern ganern
 *
 ******************************************************************************/
public class PakGanern {

	private static void compSimulation(int given) {
		if (given <= 0) {
			System.out.println("Invalid input");
		} else {
			System.out.println("pak");
			int ctr = 1;
			while (ctr <= given) {
				for (int i = 0; i < ctr; i++) {
					System.out.print("pak ");
				}
				for (int i = 0; i < ctr; i++) {
					System.out.print("ganern ");
				}
				System.out.println();
				ctr++;
			}
		}
	}

	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);

		//int given = sc.nextInt();
		int given = Integer.parseInt(args[0]);
		compSimulation(given);
	}
}
