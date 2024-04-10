package uvg.ed.gt;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<String> heap = new VectorHeap<>();
        assertTrue(heap.isEmpty()); // Verifica que el heap esté vacío al principio
        heap.add("A");
        assertEquals(1, heap.size()); // Verifica que el tamaño sea 1 después de agregar un elemento
        heap.add("B");
        assertEquals(2, heap.size()); // Verifica que el tamaño sea 2 después de agregar otro elemento
    }

    @Test
    public void testRemove() {
        VectorHeap<String> heap = new VectorHeap<>();
        heap.add("A");
        heap.add("B");
        heap.add("C");
        assertEquals("A", heap.remove()); // Verifica que el elemento eliminado sea "A"
        assertEquals("B", heap.remove()); // Verifica que el elemento eliminado sea "B"
        assertEquals("C", heap.remove()); // Verifica que el elemento eliminado sea "C"
        assertTrue(heap.isEmpty()); // Verifica que el heap esté vacío después de eliminar todos los elementos
    }
}
