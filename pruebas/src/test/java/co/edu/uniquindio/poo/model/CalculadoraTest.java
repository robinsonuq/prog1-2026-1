package co.edu.uniquindio.poo.model;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase para probar la calculadora
 * @author Juanito
 * @since 2026-04-14
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */

class CalculadoraTest {
    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(CalculadoraTest.class.getName());
    Calculadora calculadora = null;

    @BeforeEach
    public void inicializarDatos() {
         calculadora = new Calculadora(2,3);
    }

    @Test
    void sumar() {
        LOG.info("Inicio de prueba sumar...");

        int actual = calculadora.sumar();
        int esperado = 8;

        assertEquals(esperado, actual);

        LOG.info("Fin de prueba sumar...");
    }
    @Test
    void sumarCero() {
        LOG.info("Inicio de prueba sumar...");
        calculadora = new Calculadora(0,0);
        int actual = calculadora.sumar();
        int esperado = 0;

        assertEquals(esperado, actual);

        LOG.info("Fin de prueba sumar...");
    }
    @Test
    void sumarException() {
        LOG.info("Inicio de prueba sumar...");
        calculadora = new Calculadora(0,0);
        int actual = calculadora.sumar();
        int esperado = 0;

        assertThrows(Throwable.class, ()-> calculadora.sumar());

        LOG.info("Fin de prueba sumar...");
    }


}