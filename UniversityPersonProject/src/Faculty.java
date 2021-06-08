import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Faculty extends UniversityPerson {
	String officeno;
	public Faculty(String name, String surname, String id,String officeno) 
	{
		super(name, surname, id);
		this.officeno=officeno;
	}

	public String getOfficenum() 
	{ return officeno; }

	public void setOfficenum(String officenum) 
	{ this.officeno = officenum; }

	@Override
	public String toString() {
		return "Faculty [officenum=" + officeno + ", name=" + name + ", surname=" + surname + ", id=" + id + "]";
	}

public ArrayList<String> read()throws FileNotFoundException{
		
		ArrayList <String> facultymember = new ArrayList <String>();
		FileInputStream fileinput=null;
		try {
			String read="";
			int data;
			fileinput=new FileInputStream("Faculty.txt");

			while ((data =  fileinput.read()) != -1)
			{ read+=(char)data; }
			facultymember.add(read); }
	
			catch(IOException e)
		{e.printStackTrace();}
		
		return facultymember;
	}
public void write() throws FileNotFoundException, IOException {
		
		try(FileOutputStream fileout = new FileOutputStream("Faculty.txt",true))
		{
			String infofaculty = name+" , "
					+surname+" , "
					+id+" , "
					+officeno+"\n";
			byte[] info = infofaculty.getBytes();
			fileout.write(info);
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}
