package modele;

import java.util.ArrayList;
import java.util.List;

public class Etablissement {

	

	private String nom;
	private String type;
	private List <Etudiant> etudiants = new ArrayList<>();
	private Rectorat rectorat;
	private Adresse adresse;
	
	public Rectorat getRectorat() {
		return rectorat;
	}

	public void setRectorat(Rectorat rectorat) {
		this.rectorat = rectorat;
	}

	public void ajoutEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
		etudiant.setEtablissement(this);
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public Etablissement() {
		super();
	}
	
	public Etablissement(String nom, String type, Adresse adresse) {
		super();
		this.nom = nom;
		this.type = type;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Etablissement [nom=" + nom + ", type=" + type + "]";
	}
}
