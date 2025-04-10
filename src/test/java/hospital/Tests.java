package hospital;

import hospital.Paciente;
import junit.framework.TestCase;

/**
 * Prueba unitaria para la clase VectorHeap.
 * Verifica que los pacientes se inserten y se eliminen en orden correcto.
 */
public class Tests extends TestCase {

    public void testAddAndRemove() {
        // Crear un heap de pacientes
        VectorHeap heap = new VectorHeap();

        // Agregar pacientes con distintas prioridades
        Paciente p1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente p2 = new Paciente("Maria Ramirez", "apendicitis", 'A');
        Paciente p3 = new Paciente("Carlos Gomez", "dolor de pecho", 'B');

        heap.add(p1);
        heap.add(p2);
        heap.add(p3);

        // El orden correcto debería ser: Maria (A), Carlos (B), Juan (C)
        assertEquals("Maria Ramirez", ((Paciente) heap.remove()).getNombre());
        assertEquals("Carlos Gomez", ((Paciente) heap.remove()).getNombre());
        assertEquals("Juan Perez", ((Paciente) heap.remove()).getNombre());

        // La cola debe estar vacía ahora
        assertTrue(heap.isEmpty());
    }
}

