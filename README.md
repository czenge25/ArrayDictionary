# ArrayDictionary

This is a simple implementation of a dictionary class in Java using two ArrayLists to store keys and values. The class provides basic dictionary functionalities such as adding key-value pairs, retrieving values by key, removing key-value pairs, checking for key existence, and more.

**Class Declaration**

public class ArrayDictionary<E,T>

**Constructors**

Default Constructor:
public ArrayDictionary()
Creates an empty dictionary.

**Methods**

*get*
public void put(E key, T value)
Adds a key-value pair to the dictionary.

*get*
public T get(E key)
Retrieves the value associated with the given key.

*remove*
public T remove(E key)
Removes the key-value pair with the specified key and returns its associated value.

*contains*
public boolean contains(E key)
Checks if the dictionary contains the specified key.

*isEmpty*
public boolean isEmpty()
Checks if the dictionary is empty, returns true if so, false if not.

*size*
public int size()
Returns the number of key-value pairs in the dictionary.

*keys*
public Collection<E> keys()
Returns a Collection of keys.

*values*
public Collection<T> values()
Returns a Collection of values.

**Example**

Usage of the class can be found inside the Main file which utilizes all instance data, constructors and methods to show the entire class.
