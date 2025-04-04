package intermodularXML;

import intermodularColeccionDatos.Resena;

import java.util.ArrayList;
import java.util.Iterator;

//lucia mendiola naharro

public class ArraydeResena {

    private ArrayList<Resena> resenas;

    //constructor
    public ArraydeResena() {
        this.resenas = new ArrayList<>();
        resenas.add(new Resena("R001", 5, 10, "Increíble juego, gráficos espectaculares y una historia atrapante", "2024-02-15", 1001));
        resenas.add(new Resena("R002", 4, 8, "Muy buen juego, aunque todavía se puede mejorar", "2024-01-28", 1002));
        resenas.add(new Resena("R003", 3, 6, "Entretenido, pero la jugabilidad se vuelve repetitiva después de un tiempo", "2023-12-10", 1003));
        resenas.add(new Resena("R004", 2, 4, "Esperaba más, la IA de los enemigos es bastante floja", "2023-11-05", 1004));
    }

    //getters
    public ArrayList<Resena> getResenas() {
        return resenas;
    }

    //metodos
    public boolean addNewResena(Resena resena) {
        if (findResenaId(resena.getIdResena()) == null && findResenaIdProd(resena.getIdProducto()) == null) {
            resenas.add(resena);
            return true;
        }
        return false;
    }

    public boolean removeResena(String idResena) {
        Iterator<Resena> iterator = resenas.iterator();
        while (iterator.hasNext()) {
            Resena resena = iterator.next();
            if (resena.getIdResena().equals(idResena)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    private Resena findResenaId(String idResena) {
        for (Resena resena : resenas) {
            if (resena.getIdResena().equals(idResena)) {
                return resena;
            }
        }
        return null;
    }

    private Resena findResenaIdProd(int idProducto) {
        for (Resena resena : resenas) {
            if (resena.getIdProducto() == idProducto) {
                return resena;
            }
        }
        return null;
    }

    public boolean updateResena(String idResena, int calificacion, String contenido) {
        Resena resena = findResenaId(idResena);
        if (resena != null) {
            resena.setCalificacion(calificacion);
            resena.setContenido(contenido);
            return true;
        }
        return false;
    }

    public ArrayList<Resena> queryResena() {
        return resenas;
    }

    //impirmir reseñas
    public void printResenas() {
        if (resenas.isEmpty()) {
            System.out.println("No hay reseñas en la lista");
        } else {
            System.out.println("Lista de reseñas: ");
            for (Resena r : resenas) {
                System.out.println(r);
            }
        }
    }
}