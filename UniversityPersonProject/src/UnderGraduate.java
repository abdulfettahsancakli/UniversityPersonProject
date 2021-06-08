import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class UnderGraduate extends Student{
	String YearofEntry;
	public UnderGraduate(String name, String surname, String id, String dept, String gpa,String YearofEntry) {
		super(name, surname, id, dept, gpa);
		this.YearofEntry=YearofEntry;
	}
	@Override
	public String toString() {
		return "UnderGraduate [YearofEntry=" + YearofEntry + ", dept=" + dept + ", gpa=" + gpa + ", name=" + name
				+ ", surname=" + surname + ", id=" + id + "]";
	}

public ArrayList<String> read()throws FileNotFoundException{
		
		ArrayList <String> ugraduatestd = new ArrayList <String>();
		FileInputStream fileinput=null;
		try {
			String read="";
			int data;
			fileinput=new FileInputStream("Undergraduate.txt");
	
			while ((data =  fileinput.read()) != -1)
			{ read+=(char)data; }
			ugraduatestd.add(read);
		}
			catch(IOException e)
		{e.printStackTrace();}
		
		return ugraduatestd;
	}
	
	
public void write() throws FileNotFoundException, IOException {
		
		try(FileOutputStream fileout = new FileOutputStream("Undergraduate.txt",true))
		{
			String information = name+" , "
					+surname+" , "
					+id+" , "
					+dept+" , "
					+gpa+","
					+YearofEntry+"\n";
			byte[] undergraduate = information.getBytes();
			fileout.write(undergraduate);
		}
		catch(IOException e) {
			System.out.println("IOException Error");
		}
	}
	
}
