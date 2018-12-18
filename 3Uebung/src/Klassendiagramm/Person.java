package Klassendiagramm;
import java.util.Date;

public class Person {
	long svnr;
	String vorname;
	String nachname;
	Date geburtsdatum;
	String email;
	
	long getSvnr(){
		return svnr;
	}
	String getVorname(){
		return vorname;
	}
	String getNachname(){
		return nachname;
	}
	Date getGeburtsdatum(){
		return geburtsdatum;
	}
	String getEmail(){
		return email;
	}
}
