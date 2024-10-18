package fr.diginamic.testenumeration;

public enum Continent {
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    OCEANIE("Océanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
