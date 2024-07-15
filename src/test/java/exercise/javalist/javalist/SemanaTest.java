package exercise.javalist.javalist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SemanaTest {
    private Semana semana;

    @BeforeEach
    public void setUp() {
        semana = new Semana();
        semana.crearListaDias();
    }

    @Test
    public void testCrearListaDias() {
        List<String> dias = semana.obtenerDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    public void testObtenerDias() {
        List<String> dias = semana.obtenerDias();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
    }

    @Test
    public void testLargoLista() {
        assertEquals(7, semana.largoLista());
    }

    @Test
    public void testEliminarDia() {
        semana.eliminarDia("Martes");
        assertEquals(6, semana.largoLista());
        assertFalse(semana.existeDia("Martes"));
    }

    @Test
    public void testObtenerDia() {
        assertEquals("Lunes", semana.obtenerDia(0));
        assertEquals("Domingo", semana.obtenerDia(6));
        assertNull(semana.obtenerDia(7)); // Indice fuera de rango
    }

    @Test
    public void testExisteDia() {
        assertTrue(semana.existeDia("Lunes"));
        assertFalse(semana.existeDia("Funday"));
    }

    @Test
    public void testOrdenarDiasAlfabeticamente() {
        semana.ordenarDiasAlfabeticamente();
        List<String> dias = semana.obtenerDias();
        assertEquals("Domingo", dias.get(0));
        assertEquals("Viernes", dias.get(6));
    }

    @Test
    public void testVaciarLista() {
        semana.vaciarLista();
        assertEquals(0, semana.largoLista());
        assertTrue(semana.obtenerDias().isEmpty());
    }
}
