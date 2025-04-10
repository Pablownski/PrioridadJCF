package hospital;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.PriorityQueue;

public class Tests {

    @Test
    public void testAddPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        // La cola no debe estar vacía
        assertFalse(cola.isEmpty());

        // El primer elemento debe ser el que agregamos
        assertEquals("Juan", cola.peek().getNombre());
    }

    @Test
    public void testRemovePaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        // Eliminamos al paciente
        Paciente eliminado = cola.poll();

        assertEquals("Juan", eliminado.getNombre());
        assertTrue(cola.isEmpty());
    }
}
