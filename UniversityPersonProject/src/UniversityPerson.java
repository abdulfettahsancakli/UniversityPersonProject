
public abstract class UniversityPerson {
String name;
String surname;
String id;

public UniversityPerson(String name, String surname, String id) {
	super();
	this.name = name;
	this.surname = surname;
	this.id = id;
}


public String getName() 
{ return name; }

public void setName(String name) 
{ this.name = name; }

public String getSurname() 
{return surname; }

public void setSurname(String surname)
{ this.surname = surname; }

public String getId() 
{ return id; }

public void setId(String id)
{ this.id = id; }

public static boolean search(String lastName) 
{ return true; }

//public abstract UniversityPerson read();

//public abstract void write();



public String toString() {
	
	return "\nName: " + name + "\nSurname: " + surname + "\nID: " + id;
}

}
