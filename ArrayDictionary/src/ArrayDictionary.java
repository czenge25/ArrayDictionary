import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<E,T> {

    private ArrayList<E> keys;
    private ArrayList<T> values;
    private int size;

    public ArrayDictionary() {

    }

    //add an key-value pair to the dictionary
    public void put(E key, T value) {
        keys.add(key);
        values.add(value);
        size++;
    }

    //get the value associated with a given key
    public T get(E key) {
        return values.get(keys.indexOf(key));
    }

    //remove a key-value pair and return its value
    public T remove(E key) {
        keys.remove(key);
        return values.remove(keys.indexOf(key));
        size--;
    }

    //returns true if the given key has an associated value
    public boolean contains(E key) {
        if (values.contains(keys.indexOf(key))) {
            return true;
        } else {
            return false;
        }
    }

    //returns true if the dictionary is empty
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //returns the number of key-value pairs in the dictionary
    public int size() {
        return size();
    }

    //returns a Collection of keys
    public Collection<E> keys() {
        return keys;
    }

    //returns a Collection of values
    public Collection<T> values() {
        return values;
    }

}
