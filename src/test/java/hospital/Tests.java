package hospital;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.PriorityQueue;


public class PacienteTest {

    @Test
    public void testAgregarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        // Verificar que el paciente se agregó correctamente
        assertFalse("La cola no debería estar vacía", cola.isEmpty());
        assertEquals("Juan", cola.peek().getNombre());
    }

    @Test
    public void testEliminarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        Paciente p = new Paciente("Juan", "fractura", 'C');
        cola.add(p);

        // Eliminar el paciente y verificar
        Paciente eliminado = cola.poll();
        assertEquals("Juan", eliminado.getNombre());
        assertTrue("La cola debería estar vacía después de eliminar", cola.isEmpty());
    }
}