package ej3.polimorfismoPintura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {

    Forma esfera = new Esfera("Esfera", 10);
    Forma rectangulo = new Rectangulo("Rectangulo", 5, 10);
    Forma cilindro = new Cilindro("Cilindro", 7, 14);

    @Test
    public void Pintura() {
        Pintura pintura = new Pintura(200);

        assertEquals(esfera.area() / pintura.cobertura, pintura.cantidadPintura(esfera));
        assertEquals(rectangulo.area() / pintura.cobertura, pintura.cantidadPintura(rectangulo));
        assertEquals(cilindro.area() / pintura.cobertura, pintura.cantidadPintura(cilindro));
    }
  
}
