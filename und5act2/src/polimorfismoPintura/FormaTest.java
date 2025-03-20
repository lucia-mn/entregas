package polimorfismoPintura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormaTest {

    @Test
    public void testToString() {
        Forma esfera = new Esfera("Esfera", 10);
        Forma rectangulo = new Rectangulo("Rectangulo", 5, 10);
        Forma cilindro = new Cilindro("Cilindro", 7, 14);

        assertTrue(esfera.toString().contains("Esfera"));
        assertTrue(rectangulo.toString().contains("Rectangulo"));
        assertTrue(cilindro.toString().contains("Cilindro"));
    }

    @Test
    public void testArea() {
        Esfera esfera = new Esfera("Esfera", 10);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 5, 10);
        Cilindro cilindro = new Cilindro("Cilindro", 7, 14);

        assertEquals(4 * Math.PI * Math.pow(10, 2), esfera.area(), 0.001);
        assertEquals(5 * 10, rectangulo.area(), 0.001);
        assertEquals(2 * Math.PI * Math.pow(7, 2) + 2 * Math.PI * 7 * 14, cilindro.area(), 0.001);
    }

    @Test
    public void testPintura() {
        Pintura pintura = new Pintura(200);

        Forma esfera = new Esfera("Esfera", 10);
        Forma rectangulo = new Rectangulo("Rectangulo", 5, 10);
        Forma cilindro = new Cilindro("Cilindro", 7, 14);

        assertEquals(esfera.area() / 200, pintura.cantidadPintura(esfera), 0.001);
        assertEquals(rectangulo.area() / 200, pintura.cantidadPintura(rectangulo), 0.001);
        assertEquals(cilindro.area() / 200, pintura.cantidadPintura(cilindro), 0.001);
    }
}

