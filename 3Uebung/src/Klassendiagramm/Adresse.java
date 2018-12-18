package Klassendiagramm;
import java.io.*;

public class Adresse {
	String ort;
	String strasse;
	int hausnummer;
	int plz;
	
	String getOrt(){
		return ort;
	}
	String getStrasse(){
		return strasse;
	}
	int getHausnummer(){
		return hausnummer;
	}
	int getPlz(){
		return plz;
	}
	void printAdresse(){
		System.out.println(strasse + " " + hausnummer);
		System.out.println(plz + " " + ort);
	}
}
