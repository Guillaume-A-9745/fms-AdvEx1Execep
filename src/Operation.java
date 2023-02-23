import java.util.Scanner;

/**
 *  
 * @author AnselmeG
 * Exercice 6.1
 */
public class Operation {

	public static double add(double a,double b) {
		return a + b;
	}
	public static double sub(double a,double b) {
		return a - b;
	}
	public static double mul(double a,double b) {
		return a * b;
	}
	public static double div(double a,double b) throws Exception {
		if(b == 0 ) {
			throw new Exception("Zéro ne peux pas étre un diviseur");
		}
		return a / b;
	}

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(add(5,2));
			System.out.println(sub(5,2));
			System.out.println(div(3,0));
			System.out.println(sub(5,2));
		} catch (Exception e) {
			e.printStackTrace();
		}

		int value = 0;
		String choice = "oui";
		Scanner scan = new Scanner(System.in);
		while(choice.equals("oui")) {
			System.out.println("Indiquez un chiffre");
			try {
				value = scan.nextInt();	
				System.out.println(add(value,2));
				System.out.println(sub(value,2));
				System.out.println(mul(value,2));
				System.out.println(div(value,2));
			} catch ( java.util.InputMismatchException e) {
				System.out.println("Vous avez saisi une valeur inattendue ici.");
				scan.next();
			}	
			System.out.println("Voulez vous indiquez un autre nombre ?     oui/non");
			choice = scan.next();
		}
		scan.close();
	}
}
