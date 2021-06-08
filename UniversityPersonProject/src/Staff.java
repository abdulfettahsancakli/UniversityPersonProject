import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Staff extends UniversityPerson {
	String task;
	public Staff(String name, String surname, String id,String task) {
		super(name, surname, id);
		this.task=task;
	}
	public String getTask()
	{ return task;}
	
	public void setTask(String task) 
	{ this.task = task; }
	
	@Override
	public String toString() 
	{ return "Staff [task=" + task + ", name=" + name + ", surname=" + surname + ", id=" + id + "]"; }
	
public ArrayList<String> read()throws FileNotFoundException{
		
		ArrayList <String> facultymember = new ArrayList <String>();
		FileInputStream fileinput=null;
		try {
			String read="";
			int data;
			fileinput=new FileInputStream("Staff.txt");

			while ((data =  fileinput.read()) != -1)
			{ read+=(char)data; }
			facultymember.add(read); }
	
			catch(IOException e)
		{e.printStackTrace();}
		
		return facultymember;
	}
	
	
	
	public void write() {
		try {
			@SuppressWarnings("resource")
			FileOutputStream fileout=new FileOutputStream("Staff.txt",true);
			String staff = name+" , "
						   +surname+" , " 
						   +id+" , "
						   +task+" , ";
								
			byte[] infostaff = staff.getBytes();
			fileout.write(infostaff);
			
	
		} catch (IOException e) {
			System.out.println("IOException Hatasý");
		}
		
	}
	

}
