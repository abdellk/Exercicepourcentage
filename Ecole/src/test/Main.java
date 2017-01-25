package test;

import modele.Adresse;
import modele.Etablissement;
import modele.Etudiant;
import modele.Rectorat;

public class Main {

	public static void main(String[] args) {
		
		Adresse ae = new Adresse (92400, "Boulevard Aristide briand", "Courbevoie");
		
		Rectorat r1 = new Rectorat("Super", ae);
		
		Etablissement e1 = new Etablissement("Super", "College", ae);
		
		Etudiant et1 = new Etudiant("Johnny", "Boy", "M", e1);
		Etudiant et2 = new Etudiant("Aziz", "Boy", "M", e1);
		Etudiant et3 = new Etudiant("Fabrice", "Boy", "M", e1);
		Etudiant et4 = new Etudiant("Oaza", "Boy", "F", e1);
		Etudiant et5 = new Etudiant("Wizz", "Boy", "F", e1);
		Etudiant et6 = new Etudiant("Wouzz", "Boy", "F", e1);
		
		r1.ajoutEtablissement(e1);
		
		
		e1.ajoutEtudiant(et1);
		e1.ajoutEtudiant(et2);
		e1.ajoutEtudiant(et3);
		e1.ajoutEtudiant(et4);
		e1.ajoutEtudiant(et5);
		e1.ajoutEtudiant(et6);
	
		r1.pourcentageparSexe("M");


				
	}

}
