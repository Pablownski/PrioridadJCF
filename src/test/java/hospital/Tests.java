package hospital;

import org.junit.Test;
import static org.junit.Assert.*;
import hospital.Paciente;

public class Tests {

    @Test
    public void testAddRemove() {
        VectorHeap heap = new VectorHeap();
        heap.add(new Paciente("Juan", "fractura", 'C'));
        assertEquals("Juan", heap.remove().getNombre());
    }
}
