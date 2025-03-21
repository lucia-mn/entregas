package polimorfismoPintura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormaTest {

    Forma esfera = new Esfera("Esfera", 10);
    Forma rectangulo = new Rectangulo("Rectangulo", 5, 10);
    Forma cilindro = new Cilindro("Cilindro", 7, 14);

    @Test
    public void ToString() {
        assertTrue(esfera.toString().contains("Esfera"));
        assertTrue(rectangulo.toString().contains("Rectangulo"));
        assertTrue(cilindro.toString().contains("Cilindro"));
    }

    @Test
    public void Area() {
        assertEquals(4 * Math.PI * Math.pow(10, 2), esfera.area(), 0.1);
        assertEquals(5 * 10, rectangulo.area(), 0.1);
        assertEquals(2 * Math.PI * Math.pow(7, 2) + 2 * Math.PI * 7 * 14, cilindro.area(), 0.1);
    }

    @Test
    public void Pintura() {
        Pintura pintura = new Pintura(200);

        assertEquals(esfera.area() / 200, pintura.cantidadPintura(esfera), 0.1);
        assertEquals(rectangulo.area() / 200, pintura.cantidadPintura(rectangulo), 0.1);
        assertEquals(cilindro.area() / 200, pintura.cantidadPintura(cilindro), 0.1);
    }
}
