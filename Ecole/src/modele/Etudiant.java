package modele;

public class Etudiant {

	private String nom;
	private String prenom;
	private String sexe;
	private Etablissement etablissement;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String sexe, Etablissement etablissement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.etablissement = etablissement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	

}
