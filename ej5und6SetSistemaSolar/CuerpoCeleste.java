package SET.ej5und6SetSistemaSolar;

import java.util.HashSet;
import java.util.Set;

public class CuerpoCeleste {

    public enum TipoCuerpoCeleste {ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE};
    private String nombre;
    private double periodoOrbital;
    private Set<SET.ej5und6SetSistemaSolar.CuerpoCeleste> satelites;
    private SET.ej5und6SetSistemaSolar.CuerpoCeleste.TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, SET.ej5und6SetSistemaSolar.CuerpoCeleste.TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        satelites = new HashSet<>();
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<SET.ej5und6SetSistemaSolar.CuerpoCeleste> getSatelites() {
        return this.satelites;
    }

    public void setSatelites(Set<SET.ej5und6SetSistemaSolar.CuerpoCeleste> satelites) {
        this.satelites = satelites;
    }

    public boolean addSatelite(SET.ej5und6SetSistemaSolar.CuerpoCeleste satelite) {
        if (satelite.tipoCuerpo == SET.ej5und6SetSistemaSolar.CuerpoCeleste.TipoCuerpoCeleste.LUNA) {
            return satelites.add(satelite);
        }
        return false;
    }

    public boolean equals() {
        if (this.tipoCuerpo == tipoCuerpo) {
            return true;
        } else return false;
    }

    public int hashCode() {
        return nombre.hashCode() + tipoCuerpo.hashCode();
    }

    //toString
    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", periodoOrbital=" + periodoOrbital +
                ", satelites=" + satelites +
                ", tipoCuerpo=" + tipoCuerpo +
                '}';
    }

    public void showSatelites(){
        for (SET.ej5und6SetSistemaSolar.CuerpoCeleste luna : this.satelites) {
            System.out.println(luna);
        }
    }

}