package hospital;

import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;


public class PacienteTest {

    @Test
    void testAgregarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente paciente = new Paciente("Juan", "fractura", 'C');

        cola.add(paciente);

        assertFalse(cola.isEmpty(), "La cola no debería estar vacía después de agregar");
        assertEquals("Juan", cola.peek().getNombre(), "El paciente en la cima debería ser Juan");
    }

    @Test
    void testEliminarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente paciente = new Paciente("Juan", "fractura", 'C');

        cola.add(paciente);
        Paciente eliminado = cola.poll();

        assertEquals("Juan", eliminado.getNombre(), "El paciente eliminado debería ser Juan");
        assertTrue(cola.isEmpty(), "La cola debería estar vacía después de eliminar");
    }
}
