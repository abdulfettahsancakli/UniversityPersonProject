import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Graduate extends Student {
	String gradeYear;
	
	public Graduate(String name, String surname, String id, String dept, String gpa,String gradeYear) {
		super(name, surname, id, dept, gpa);
		this.gradeYear=gradeYear;
	}

	@Override
	public String toString() {
		return "Graduate [gradeYear=" + gradeYear + ", dept=" + dept + ","
				+ " gpa=" + gpa + ", name=" + name + ", surname="
				+ surname + ", id=" + id + "]";
	}
	
	
public ArrayList<String> read()throws FileNotFoundException{
		
		ArrayList <String> graduatestd = new ArrayList <String>();
		FileInputStream fileinput=null;
		try {
			String read="";
			int data;
			fileinput=new FileInputStream("Graduate.txt");
	
			while ((data =  fileinput.read()) != -1)
			{ read+=(char) data; }
			graduatestd.add(read);
		}
			catch(IOException e)
		{e.printStackTrace();}
		
		return graduatestd ;
	}
	public void write() throws FileNotFoundException, IOException {
		
		try(FileOutputStream fileout = new FileOutputStream("Graduate.txt",true))
		{
			String information = name+" , "
					+surname+" , "
					+id+" , "
					+dept+" , "
					+gpa+"\n";
			byte[] graduate = information.getBytes();
			fileout.write(graduate);
		
		}
		
		
		
		
	}
}