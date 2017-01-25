package modele;

public class Adresse {
	
	private int codePostal;
	private String voie;
	private String ville;
	
	public Adresse() {
		super();
	}

	public Adresse(int codePostal, String voie, String ville) {
		super();
		this.codePostal = codePostal;
		this.voie = voie;
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", voie=" + voie + ", ville=" + ville + "]";
	}
	
}