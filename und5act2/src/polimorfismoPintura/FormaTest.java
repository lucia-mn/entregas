package polimorfismoPintura;

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
        assertEquals(1256.6370614359173, esfera.area());
        assertEquals(50, rectangulo.area());
        assertEquals(923.6282401553991, cilindro.area());
    }

    @Test
    public void Pintura() {
        Pintura pintura = new Pintura(200);

        assertEquals(esfera.area() / 200, pintura.cantidadPintura(esfera));
        assertEquals(rectangulo.area() / 200, pintura.cantidadPintura(rectangulo));
        assertEquals(cilindro.area() / 200, pintura.cantidadPintura(cilindro));
    }

}
