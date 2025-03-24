package ej3.polimorfismoPintura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormaTest {

    Forma esfera = new Esfera("Esfera", 10);
    Forma rectangulo = new Rectangulo("Rectangulo", 5, 10);
    Forma cilindro = new Cilindro("Cilindro", 7, 14);

    @Test
    public void ToString() {
        assertEquals("Esfera{radio=10.0, nombre='Esfera'}", esfera.toString());
        assertEquals("Rectangulo{ancho=10.0, nombre='Rectangulo'}", rectangulo.toString());
        assertEquals("Cilindro{altura=14.0, nombre='Cilindro'}", cilindro.toString());
    }

    @Test
    public void Area() {
        assertEquals(1256.64, esfera.area(), 0.01);
        assertEquals(50, rectangulo.area());
        assertEquals(923.628, cilindro.area(), 0.001);
    }

}
