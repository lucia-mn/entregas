package ej3.JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    public void testQueColorSoy() {
        assertEquals("rojo", Color.queColorSoy("Antonio"));
        assertEquals("rojo", Color.queColorSoy("Bernardo"));
        assertEquals("rojo", Color.queColorSoy("Catalina"));
        assertEquals("rojo", Color.queColorSoy("Diana"));
        assertEquals("rojo", Color.queColorSoy("Efrén"));
        assertEquals("rojo", Color.queColorSoy("Francisco"));
        assertEquals("verde", Color.queColorSoy("Gemma"));
        assertEquals("verde", Color.queColorSoy("Helena"));
        assertEquals("verde", Color.queColorSoy("Iván"));
        assertEquals("verde", Color.queColorSoy("José Andrés"));
        assertEquals("verde", Color.queColorSoy("Kenia"));
        assertEquals("verde", Color.queColorSoy("Lourdes"));
        assertEquals("verde", Color.queColorSoy("Manuel"));
        assertEquals("azul", Color.queColorSoy("Nicolás"));
        assertEquals("azul", Color.queColorSoy("Ofelia"));
        assertEquals("azul", Color.queColorSoy("Patricia"));
        assertEquals("azul", Color.queColorSoy("Quasimodo"));
        assertEquals("azul", Color.queColorSoy("Ramón"));
        assertEquals("azul", Color.queColorSoy("Sonia"));
        assertEquals("amarillo", Color.queColorSoy("Tamara"));
        assertEquals("amarillo", Color.queColorSoy("Unai"));
        assertEquals("amarillo", Color.queColorSoy("Víctor"));
        assertEquals("amarillo", Color.queColorSoy("Wendy"));
        assertEquals("amarillo", Color.queColorSoy("Xacinta"));
        assertEquals("amarillo", Color.queColorSoy("Yerai"));
        assertEquals("amarillo", Color.queColorSoy("Zacarías"));
    }


    /*@Test
    public void testQueColorSoyConNombreVacio() {
        assertEquals("desconocido", Color.queColorSoy(""));
    }

    @Test
    public void testQueColorSoyConNull() {
        assertEquals("desconocido", Color.queColorSoy(null));
    }

    @Test
    public void testQueColorSoyConMinusculas() {
        assertEquals("rojo", Color.queColorSoy("antonio"));
        assertEquals("verde", Color.queColorSoy("gemma"));
        assertEquals("azul", Color.queColorSoy("nicolás"));
        assertEquals("amarillo", Color.queColorSoy("tamara"));

    }*/



    @Test
    public void testQueColorSoy2() {
        assertEquals("rojo", Color.queColorSoy2("Antonio"));
        assertEquals("rojo", Color.queColorSoy2("Bernardo"));
        assertEquals("rojo", Color.queColorSoy2("Catalina"));
        assertEquals("rojo", Color.queColorSoy2("Diana"));
        assertEquals("rojo", Color.queColorSoy2("Efrén"));
        assertEquals("rojo", Color.queColorSoy2("Francisco"));
        assertEquals("verde", Color.queColorSoy2("Gemma"));
        assertEquals("verde", Color.queColorSoy2("Helena"));
        assertEquals("verde", Color.queColorSoy2("Iván"));
        assertEquals("verde", Color.queColorSoy2("José Andrés"));
        assertEquals("verde", Color.queColorSoy2("Kenia"));
        assertEquals("verde", Color.queColorSoy2("Lourdes"));
        assertEquals("verde", Color.queColorSoy2("Manuel"));
        assertEquals("azul", Color.queColorSoy2("Nicolás"));
        assertEquals("azul", Color.queColorSoy2("Ofelia"));
        assertEquals("azul", Color.queColorSoy2("Patricia"));
        assertEquals("azul", Color.queColorSoy2("Quasimodo"));
        assertEquals("azul", Color.queColorSoy2("Ramón"));
        assertEquals("azul", Color.queColorSoy2("Sonia"));
        assertEquals("amarillo", Color.queColorSoy2("Tamara"));
        assertEquals("amarillo", Color.queColorSoy2("Unai"));
        assertEquals("amarillo", Color.queColorSoy2("Víctor"));
        assertEquals("amarillo", Color.queColorSoy2("Wendy"));
        assertEquals("amarillo", Color.queColorSoy2("Xacinta"));
        assertEquals("amarillo", Color.queColorSoy2("Yerai"));
        assertEquals("amarillo", Color.queColorSoy2("Zacarías"));
    }


    @Test
    public void testQueColorSoyConCaracteresNoAscii() {
        assertEquals("blanco", Color.queColorSoy2("1Pedro"));
        assertEquals("blanco", Color.queColorSoy2("!María"));
        assertEquals("blanco", Color.queColorSoy2("ñandú"));
        assertEquals("blanco", Color.queColorSoy2("Óscar"));
        assertEquals("blanco", Color.queColorSoy2("Érica"));
    }
}
