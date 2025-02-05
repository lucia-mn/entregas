package intermodular;

//lucia mendiola

public class Resena {

    //atributos
    private String idResena;
    private int idProducto;
    private int calificacion;
    private String contenido;
    private String fPublicacion;
    private int idUsuario;

    //constructor
    public Resena(String idResena, int idProducto, int calificacion, String contenido, String fPublicacion, int idUsuario) {
        this.idResena = idResena;
        this.idProducto = idProducto;
        this.calificacion = calificacion;
        this.contenido = contenido;
        this.fPublicacion = fPublicacion;
        this.idUsuario = idUsuario;
    }

    //getters
    public String getIdResena() {
        return idResena;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFPublicacion() {
        return fPublicacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }


    //setters
    public void setIdResena(String idResena) {
        this.idResena = idResena;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFPublicacion(String fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    //toString
    @Override
    public String toString() {
        return "Reseña{" +
                "\nidResena ==> '" + idResena + '\'' +
                ", \nidProducto ==> " + idProducto +
                ", \ncalificacion ==> " + calificacion +
                ", \ncontenido ==> '" + contenido + '\'' +
                ", \nfPublicacion ==> '" + fPublicacion + '\'' +
                ", \nidUsuario ==> " + idUsuario +
                '}';
    }
}
