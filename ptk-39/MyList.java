import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public MyList() {
        capacity = 10;
        array = (T[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            resizeArray();
        }
        array[size++] = data;
    }

    private void resizeArray() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }
    }

    public void set(int index, T data) {
        if (index >= 0 && index < size) {
            array[index] = data;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start >= 0 && finish >= start && finish <= size) {
            MyList<T> sublist = new MyList<>(finish - start);
            for (int i = start; i < finish; i++) {
                sublist.add(array[i]);
            }
            return sublist;
        }
        return null;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
