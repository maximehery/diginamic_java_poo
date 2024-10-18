package fr.diginamic.fichier;

public class Ville {
    private Integer codeDepartement;
    private String nomDeLaRegion;
    private String nom;
    private Integer populationTotale;

    public Ville(Integer codeDepartement, String nomDeLaRegion, String nom, Integer populationTotale) {
        this.codeDepartement = codeDepartement;
        this.nomDeLaRegion = nomDeLaRegion;
        this.nom = nom;
        this.populationTotale = populationTotale;
    }

    public Integer getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(Integer codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(Integer populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "codeDepartement=" + codeDepartement +
                ", nomDeLaRegion='" + nomDeLaRegion + '\'' +
                ", nom='" + nom + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
