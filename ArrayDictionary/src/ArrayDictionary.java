/*
CZ
12/11/23
HK
 */

import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<E,T> {

    // ArrayLists to store keys and values
    private ArrayList<E> keys = new ArrayList<E>();
    private ArrayList<T> values = new ArrayList<T>();

    // Size variable to keep track of the number of key-value pairs in the dictionary
    private int size;

    // Default constructor, dictionary starts with size = 0
    public ArrayDictionary() {

    }

    // Method to add a key-value pair to the dictionary
    public void put(E key, T value) {
        keys.add(key);
        values.add(value);
        size++;
    }

    // Method to get the value associated with a given key
    public T get(E key) {
        return values.get(keys.indexOf(key));
    }

    // Method to remove a key-value pair and return its value
    public T remove(E key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            size--;
            return values.remove(index);
        }
        // If key is not found, prints a warning message and returns null
        System.out.println("Could not remove key \"" + key + "\"");
        return null;
    }

    // Method to check if the given key has an associated value
    public boolean contains(E key) {
        return keys.contains(key);
    }

    // Method to check if the dictionary is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of key-value pairs in the dictionary
    public int size() {
        return size;
    }

    // Method to get a Collection of keys
    public Collection<E> keys() {
        return keys;
    }

    // Method to get a Collection of values
    public Collection<T> values() {
        return values;
    }
}
