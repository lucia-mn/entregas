package ej2;

public class Banda {

    private String nombre;
    private int anioDebut;
    private Integrante integrante1;
    private Integrante integrante2;
    private Integrante integrante3;
    private Cancion cancion;
    private Album album;


    //constructor
    public Banda(String nombre, int anioDebut, Integrante integrante1, Integrante integrante2, Integrante integrante3, Cancion cancion, Album album) {
        this.nombre = nombre;
        this.anioDebut = anioDebut;
        this.integrante1 = integrante1;
        this.integrante2 = integrante2;
        this.integrante3 = integrante3;
        this.cancion = cancion;
        this.album = album;
    }


    //getters
    public String getNombre() {
        return nombre;
    }

    public int getAnioDebut() {
        return anioDebut;
    }

    public Integrante getIntegrante1() {
        return integrante1;
    }

    public Integrante getIntegrante2() {
        return integrante2;
    }

    public Integrante getIntegrante3() {
        return integrante3;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public Album getAlbum() {
        return album;
    }


    //métodos
    public void lanzarAlbum() {
        System.out.println("Se está lanzando el álbum...");
        album.lanzar();
    }

    public void titutloAlbum() {
        album.titulo();
    }
}
