package Phase1Project;
public class Project1Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Company Lockers Pvt. Ltd.");
		System.out.println("Designed by Avinash Kumar");
		System.out.println();
		System.out.println("________________________________________________________________________________________");
		System.out.println();
		System.out.println("This application can be used to : ");
		System.out.println("* Retrive any file from Lockers");
		System.out.println("* Add, Delete or Search in Lockers");
		System.out.println("");
		System.out.println("");
		Options o= new Options();
		Menu m= new Menu();
		o.display();
		m.process(o.input());
	}

}
