/*
CZ
12/11/23
HK
 */

public class Main {
    public static void main(String[] args) {
        ArrayDictionary<String, Integer> dictionary = new ArrayDictionary<>();

        // Add key-value pairs
        dictionary.put("one", 1);
        dictionary.put("two", 2);
        dictionary.put("three", 3);

        // Print the dictionary
        System.out.println("Dictionary: " + dictionary.keys() + " -> " + dictionary.values());

        // Get value by key
        System.out.println("Value for key 'two': " + dictionary.get("two"));

        // Remove a key-value pair
        System.out.println("Removed value for key 'two': " + dictionary.remove("two"));

        // Print the updated dictionary
        System.out.println("Updated: " + dictionary.keys() + " -> " + dictionary.values());

        // Check if a key is present
        System.out.println("Contains key 'three': " + dictionary.contains("three"));

        // Check if the dictionary is empty
        System.out.println("Is dictionary empty? " + dictionary.isEmpty());

        // Print the size of the dictionary
        System.out.println("Dictionary size: " + dictionary.size());

        // Remove key-value pair three
        System.out.println("Removed value for key 'two': " + dictionary.remove("three"));

        // Remove key-value pair one
        System.out.println("Removed value for key 'two': " + dictionary.remove("one"));

        // Attempt to remove nonexistent key from dictionary will be stopped and met with an error
        System.out.println("Attempt to remove key 'five': " + dictionary.remove("five"));
    }
}