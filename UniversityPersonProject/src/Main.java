import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
  // B1705.010027 ABDULFETTAH SANCAKLI COMPUTER ENGINEERING
public class Main {
	public  static Scanner scan=new Scanner(System.in);
	public static void login() throws IOException{
		try {
			Scanner scan = new Scanner(System.in);
			String logdata="";
			Scanner scanfile = new Scanner(new FileReader("Enter.txt"));
		    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Please enter your username:");
			String username=scan.nextLine();
			System.out.print("Please enter your password:");
			String password=scan.nextLine();
			
			while (scanfile.hasNextLine()) {
	               logdata = scanfile.nextLine();
	               String[] user = logdata.split(",");
	                
	           	if(user[0].equals(username)) {
					if(user[1].equals(password)) {
					    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("You've successfully logged into the system.");
						menu(); } } } }
			
		catch (FileNotFoundException e) {
			e.printStackTrace(); } }
	
	public static void register() {
      
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a new username:");
			String uname=scan.nextLine();
			System.out.print("Enter a new password:");
			String pass=scan.nextLine();
			FileOutputStream fileout=new FileOutputStream("Enter.txt",true);
			String newUser = ""+uname+","
							+pass+"\n";
			byte[] register = newUser.getBytes();
			fileout.write(register);
		    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Your information has been saved.");
			login(); }
			
			catch (IOException e) {
			e.printStackTrace();
			System.out.println("ERROR...\n"); } }
	
	public static void menu() throws IOException {
		Scanner scan = new Scanner (System.in);
		int cho;
	    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("(1) Add UP,(2) Look UP, (3) Exit to From System");
		cho = scan.nextInt();

		switch (cho) {
		
	case 1:
		        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    System.out.println("1-) Add Undergraduate Student");
			    System.out.println("2-) Add Graduate Student");
			    System.out.println("3-) Add Faculty Person");
			    System.out.println("4-) Add Staff Person");
			    System.out.println("5-) Back to the Menu");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

			int personType = scan.nextInt();
				switch(personType) {
	case 1:
				Scanner scanner = new Scanner(System.in);
				System.out.println("PLEASE ENTER THE UNDERGRADUATE STUDENT INFORMATIONS");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("Student name:");
				String name=scanner.nextLine();
				
				System.out.print("\nStudent surname:");
				String surname=scanner.nextLine();
				
				System.out.print("\nStudent id:");
				String id=scanner.nextLine();
				
				System.out.print("\nStudent department:");
				String dept=scanner.nextLine();
				
				System.out.print("\nStudent gpa:");
				String gpa=scanner.nextLine();
				
				System.out.print("\nYearofEntry:");
				String YearofEntry=scanner.nextLine();
				
				UnderGraduate ugrad=new UnderGraduate(name,surname,id,dept,gpa,YearofEntry);
				ugrad.write();
				menu();
					break;
					
	case 2: 
				Scanner sc = new Scanner(System.in);
				System.out.println("PLEASE ENTER THE GRADUATE STUDENT INFORMATIONS");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("Student name:");
				String Name=sc.nextLine();
					
				System.out.print("\nStudent surname:");
				String Surname=sc.nextLine();
					
				System.out.print("\n Student mail:");
				String mail=sc.nextLine();
					
				System.out.print("\nStudent id:");
				String ID=sc.nextLine();
					
				System.out.print("\nStudent department:");
				String department=sc.nextLine();
					
				System.out.print("\n Student GPA:");
				String Gpa=sc.nextLine();
				Graduate graduate =new Graduate(Name,Surname,mail,ID,department,Gpa);
				graduate.write();
				menu();
				break;
    case 3:
				Scanner read= new Scanner(System.in);
				System.out.println("PLEASE ENTER THE FACULTY MEMBER INFORMATIONS");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("Faculty member's name:");
				String fname=read.nextLine();
				
				System.out.print("\nFaculty member's surname:");
				String fsurname=read.nextLine();
				
				System.out.print("\nFaculty member's id:");
				String fid=read.nextLine();
				
				System.out.print("\nFaculty member's office number:");
				String officeno=read.nextLine();
			
				Faculty fac=new Faculty(fname,fsurname,fid,officeno);
				fac.write();
				menu();
				break;
	case 4:
				Scanner Read = new Scanner(System.in);
				System.out.println("PLEASE ENTER THE STAFF INFORMATIONS");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("Please enter staff name:");
				String Sname=Read.nextLine();
					
				System.out.print("\nStaff's surname:");
				String Ssurname=Read.nextLine();
				
				System.out.print("\n Staff id:");
				String Sid=Read.nextLine();
				
				System.out.print("\n Staff mission:");
				String Stask=Read.nextLine();
				
				Staff staff=new Staff(Sname,Ssurname,Sid,Stask);
				staff.write();
				menu();
				break;
	
				
			}
	case 2:
			 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    System.out.println("1-) Look Undergraduate Student in the system");
			    System.out.println("2-) Look Graduate Student in the system");
			    System.out.println("3-) Look Faculty Person in the system");
			    System.out.println("4-) Look Staff Person in the system");
			    System.out.println("5-) Back to the Menu in the system");
			    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

			    int selection=scan.nextInt();
			    switch(selection) {
	case 1:
			    System.out.println("UNDERGRADUATE STUDENTS");
			    UnderGraduate undergrad=new UnderGraduate(null, null, null, null, null, null);
				System.out.println(undergrad.read());
				menu();
				break;
					
	case 2:
			    System.out.println("GRADUATE STUDENTS");
			    Graduate graduate =new Graduate(null, null, null, null, null, null);
				System.out.println(graduate.read());
				menu();
				break;
					
	case 3: 
			    System.out.println("FACULTY PERSONS");
			    Faculty faculty=new Faculty(null, null, null, null);
				System.out.println(faculty.read());
				menu();
				break;
					
	case 4:
			    System.out.println("STAFF PERSONS");
			    Staff staff=new Staff(null, null, null, null);
				System.out.println(staff.read());
				menu();
				break;
				
	case 5:
			    menu();
			    break;
			    }
	case 3:
		        System.out.println("Exit");
		        System.exit(0);
		        break;
			    
			    
		
		}

		}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		  int cho,select;	
		    System.out.println("-------------------------------------------------------------------------------------------------");
		    System.out.println("                        WELCOME TO UNIVERSITY PERSON SYSTEM ");
		    System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println(" 1-REGISTER \n\n 2-LOGIN \n\n 3-EXIT");
		    System.out.println("-------------------------------------------------------------------------------------------------");

			select=scan.nextInt();
			switch(select) {
			
			case 1:
				register();
				break;
									
				
			case 2 :
				login();
				break;
				
			case 3 : 
				System.out.println("Exiting the program..");
				System.exit(0);
				break;
			
}
	}
}
