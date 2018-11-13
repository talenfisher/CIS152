/**
 * An Entry for a Map of the same <Key,Value> template
 * @author Talen Fisher
 *
 * @param <Key> the key type
 * @param <Value> the value type
 */
public class Entry<Key,Value> {

    /**
     * The entry's key
     */
    private Key key;

    /**
     * The entry's value
     */
    private Value value;

    /**
     * Next entry in the map
     */
    private Entry<Key,Value> next;

    /**
     * Constructor
     * 
     * @param key the key for the entry
     * @param value the value for the entry
     */
    public Entry(Key key, Value value) {
        this.key = key;
        this.value = value;
    }


    /**
     * getter for the key property
     * key is readonly after set by the constructor
     * 
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * getter for the value property
     * 
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * setter for the value property
     * 
     * @param value the value to set
     * @return the value set
     */
    public Value setValue(Value value) {
        return this.value = value;
    }

    /**
     * Convert the entry to a string
     */
    public String toString() {
        return key + ": " + value;
    }

    /**
     * getter for the next entry
     * 
     * @return the next entry
     */
    public Entry<Key, Value> getNext() {
        return next;
    }

    /**
     * setter for the next entry property
     * 
     * @param next the next entry
     * @return the next entry that was set
     */
    public Entry<Key,Value> setNext(Entry<Key,Value> next) {
        return this.next = next;
    }
}
