import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese valor para primer alelo (A o a)");
		String alelo1 = teclado.nextLine();
		System.out.println("Ingrese valor para segundo alelo (A o a)");
		String alelo2=teclado.nextLine();
		
		if (alelo1.equals("A") && alelo2.equals("A")) {
			System.out.println("rasgo 1 Dominante:" +alelo1+alelo2);
		}
		if (alelo1.equals("A") && alelo2.equals("a")) {
			System.out.println("rasgo 1 Dominante heterocigota:" +alelo1+alelo2);
		}
		if (alelo1.equals("a") && alelo2.equals("A")) {
			System.out.println("rasgo 1 Dominante heterocigota:" +alelo1+alelo2);
		}
		if (alelo1.equals("a") && alelo2.equals("a")) {
			System.out.println("rasgo 1 Recesivo:" +alelo1+alelo2);
		}
		System.out.println("Ingrese rasgos primer padre");
		System.out.println("1: Ojos negros");
		System.out.println("2: Ojos verdes");
		int rasgo1=teclado.nextInt();
		switch (rasgo1) {
		case 1: System.out.println("Ojos negros");
			break;
		case 2: System.out.println("Ojos verdes");

		default:
			break;
		}
		System.out.println("Ingrese rasgos segundo padre");
		System.out.println("1: Ojos negros");
		System.out.println("2: Ojos verdes");
		int rasgo2=teclado.nextInt();
		switch (rasgo2) {
		case 1: System.out.println("Ojos negros");
			break;
		case 2: System.out.println("Ojos azules");
		
		

		default:
			break;
		}
		
		if (rasgo1==1 && rasgo2==1) {
			System.out.println("Hereda ojos negros");
		}
		if (rasgo1==1 && rasgo2==2) {
			System.out.println("Hereda ojos negros");
		}
		if (rasgo1==2 && rasgo2==2) {
			System.out.println("Hereda ojos verdes");
		}
		if (rasgo1==2 && rasgo2==1) {
			System.out.println("Hereda ojos negros");
		}


	}

}
