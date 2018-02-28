package model;

/**
 *
 * @author student
 */
public class Carte {
    private int idCarte;
    private String titlu;
    private String autor;

    public Carte(int idCarte, String titlu, String autor) {
        this.idCarte = idCarte;
        this.titlu = titlu;
        this.autor = autor;
    }

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public Carte() {
    }

    public int getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titlu + " / " + autor;
    }
}
