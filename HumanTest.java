import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your first name?");
				String Fname1 = scanner.nextLine();
				
		System.out.println("What is your last name?");
				String Lname1 = scanner.nextLine();
				
		System.out.println("What is your middle initial?");
				String Minitial1 = scanner.nextLine();
				
		System.out.println("What is your career?");
				String Career1 = scanner.nextLine();
				
		System.out.println("What is your age?");
				int age1 = scanner.nextInt();
		
				Human human1 = new Human(Fname1, Lname1, Minitial1, Career1, age1);
				
				System.out.println(human1.Lname);

	}

}
