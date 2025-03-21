package ej3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpresoraTest {

    @Test
    void dobleCara() {
        boolean impresionDobleCara = true;
        int paginasImpresasIniciales = 0;
        int nivelTonerInicial = 50;

        Impresora impresora = new Impresora(impresionDobleCara, paginasImpresasIniciales, nivelTonerInicial);

        int entrada = 10;
        int salidaEsperada = 5;
        int salidaRecibida = impresora.imprimirPaginas(entrada);

        assertEquals(salidaEsperada, salidaRecibida);
    }


    @Test
    void nivelToner() {
        Impresora impresora = new Impresora(false, 2, 50);
        impresora.setNivelToner(80);

        assertEquals(100, impresora.nivelTonerActual(20));
    }


    //en los metodos de la clase hay que evitar los datos de entrada: println, scanner, etc.!!

}
