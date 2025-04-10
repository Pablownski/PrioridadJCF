package hospital;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.PriorityQueue;

public class Tests {

    @Test
    public void testAgregarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        assertFalse(cola.isEmpty());
        assertEquals("Juan", cola.peek().getNombre());
    }

    @Test
    public void testEliminarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        Paciente eliminado = cola.poll();

        assertEquals("Juan", eliminado.getNombre());
        assertTrue(cola.isEmpty());
    }
}
