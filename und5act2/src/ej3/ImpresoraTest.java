package ej3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpresoraTest {

    @Test
    void testImprimirDobleCaraActivada() {
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
    void testConstructorValoresValidos() {
        Impresora impresora = new Impresora(true, 10, 50);
        assertTrue(impresora.isImpresionDobleCara());
        assertEquals(10, impresora.getPaginasImpresas());
        assertEquals(50, impresora.getNivelToner());
    }

    @Test
    void testConstructorNivelTonerInvalido() {
        Impresora impresora = new Impresora(false, 5, 150);
        assertEquals(0, impresora.getNivelToner()); // Debería establecerse en 0 si el valor es inválido
    }

    @Test
    void testGetSetNivelToner() {
        Impresora impresora = new Impresora(false, 0, 50);
        impresora.setNivelToner(80);
        assertEquals(80, impresora.getNivelToner());
    }

    @Test
    void testGetSetPaginasImpresas() {
        Impresora impresora = new Impresora(false, 10, 50);
        impresora.setPaginasImpresas(20);
        assertEquals(20, impresora.getPaginasImpresas());
    }

    @Test
    void testGetSetImpresionDobleCara() {
        Impresora impresora = new Impresora(false, 0, 50);
        impresora.setImpresionDobleCara(true);
        assertTrue(impresora.isImpresionDobleCara());
    }

    @Test
    void testNivelTonerActualCargaValida() {
        Impresora impresora = new Impresora(false, 0, 50);
        assertEquals(80, impresora.nivelTonerActual(30));
    }

    @Test
    void testNivelTonerActualCargaExcesiva() {
        Impresora impresora = new Impresora(false, 0, 80);
        assertEquals(-1, impresora.nivelTonerActual(30)); // Excede 100, debe devolver -1
    }

    @Test
    void testNivelTonerActualCargaNegativa() {
        Impresora impresora = new Impresora(false, 0, 50);
        assertEquals(-1, impresora.nivelTonerActual(-10)); // Carga negativa, debe devolver -1
    }

    @Test
    void testImprimirPaginasDobleCaraPar() {
        Impresora impresora = new Impresora(true, 0, 50);
        assertEquals(5, impresora.imprimirPaginas(10));
    }

    @Test
    void testImprimirPaginasDobleCaraImpar() {
        Impresora impresora = new Impresora(true, 0, 50);
        assertEquals(6, impresora.imprimirPaginas(11));
    }

    @Test
    void testImprimirPaginasSimple() {
        Impresora impresora = new Impresora(false, 0, 50);
        assertEquals(10, impresora.imprimirPaginas(10));
    }

    @Test
    void testGetPaginasImpresas() {
        Impresora impresora = new Impresora(false, 5, 50);
        impresora.imprimirPaginas(10);
        assertEquals(15, impresora.getPaginasImpresas());
    }
}

