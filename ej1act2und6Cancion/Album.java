package linkedList.ej1act2und6Cancion;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //atributos
    protected String nombre;
    protected String artista;
    protected ArrayList<Cancion> canciones;

    //constructor
    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }


    //getters
    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public Cancion getCancion() {
        return cancion;
    }

    Cancion cancion = new Cancion("Haven", 1.43);


    //metodos
    private Cancion findSong(String tituloCancion) {
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getTitulo().equalsIgnoreCase(tituloCancion)) {
                return cancion;
            }
        }
        return null;
    }

    public boolean addCancion(String tituloCancion, double duracion) {
        if (tituloCancion == null || duracion <= 0) {
            return false;
        }
        if (findSong(tituloCancion) != null) {
            return false;
        }

        this.canciones.add(new Cancion(tituloCancion, duracion));
        return true;
    }

    public boolean addToPlaylist(int numeroPista, LinkedList<Cancion> playlist) {
        int index = numeroPista -1;

        if (index < 0 || index >= canciones.size()) {
            System.out.println("El número de pista " + numeroPista + " no es válido");
            return false;
        }

        Cancion cancionAnadir = canciones.get(index);
        playlist.add(cancionAnadir);
        return true;
    }

}
