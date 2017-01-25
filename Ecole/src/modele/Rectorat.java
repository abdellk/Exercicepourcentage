package modele;

import java.util.ArrayList;
import java.util.List;

public class Rectorat {

	private String nom;
	private List<Etablissement> etablissements = new ArrayList<>();
	private Adresse adresse;
	
	public void ajoutEtablissement(Etablissement etablissement) {
		etablissements.add(etablissement);
		etablissement.setRectorat(this);
	}
	
	
	public double pourcentageparSexe (String Sexe){
		if (!Sexe.equals("M") && !Sexe.equals("F")) return 0;
		double pourcent = 0;
		int maxpersonne = 0;
		int nbpersonne = 0;
		
		for (Etablissement e : etablissements){
			for (Etudiant etu : e.getEtudiants()){
				if (Sexe == etu.getSexe())
					nbpersonne ++;
			}
			
			maxpersonne += e.getEtudiants().size();
		}
		pourcent = nbpersonne + 100 / maxpersonne;
		
		System.out.println("Le pourcentage est de :" + pourcent);
		
		return pourcent;
	}
	
	public Rectorat() {
		super();
	}

	public Rectorat(String nom, Adresse adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etablissement> getEtablissements() {
		return etablissements;
	}

	@Override
	public String toString() {
		return "Rectorat [nom=" + nom + "]";
	}
	
}
