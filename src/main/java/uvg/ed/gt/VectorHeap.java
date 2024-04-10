package uvg.ed.gt;

import java.util.PriorityQueue;
import java.util.Vector;

// Clase VectorHeap que utiliza PriorityQueue internamente
public class VectorHeap<E extends Comparable<E>> {
    private PriorityQueue<E> data;

    public VectorHeap() {
        data = new PriorityQueue<>();
    }

    public VectorHeap(Vector<E> v) {
        data = new PriorityQueue<>(v);
    }

    public boolean add(E val) {
        return data.add(val);
    }

    public E remove() {
        return data.poll();
    }

    public E peek() {
        return data.peek();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void clear() {
        data.clear();
    }
}



