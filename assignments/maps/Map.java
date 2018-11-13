import java.util.Iterator;

/**
 * My implementation of a map without a fixed size, is iterable,
 * and with key:value pairs of multiple different types.
 * 
 * @author Talen Fisher
 * @param <Key> The key type
 * @param <Value> The value type
 */
public class Map<Key,Value> implements Iterable<Entry<Key,Value>> {

    /**
     * The head entry
     */
    private Entry<Key,Value> head = null;

    /**
     * Size of the map
     */
    private int size = 0;

    /**
     * Constructor
     */
    public Map() {}

    /**
     * Map Iterator - iterates by Entry<Key,Value>
     */
    public Iterator<Entry<Key,Value>> iterator() {

        return new Iterator<Entry<Key,Value>>() {

            private Entry<Key,Value> entry = Map.this.head; // start with head entry

            public boolean hasNext() {
                return entry != null;
            }

            public Entry<Key,Value> next() {
                Entry<Key,Value> nextReturn = entry;
                entry = entry.getNext(); // move to next entry
                return nextReturn;
            }

        };
    };

    /**
     * Sets a key to a value
     * 
     * @param key the key to reference
     * @param value the value to set
     * @return the entry created
     */
    public Entry<Key,Value> set(Key key, Value value) {

        // if a key already exists, simply set its value to the new one
        for(Entry<Key,Value> entry : this) { 
            if(entry.getKey().equals(key)) {
                entry.setValue(value);
                return entry;
            }
        }

        // otherwise create a new entry altogether
        this.size++;
        Entry<Key,Value> next = new Entry<>(key, value);
        next.setNext(head);
        return head = next;
    }

    /**
     * Finds a key within the map
     * @param key the key to find
     * @return true if the key exists and false if not
     */
    public boolean findKey(Key key) {
        for(Entry<Key,Value> entry : this) {
            if(entry.getKey().equals(key)) return true;
        }

        return false; // no key found
    }

    /**
     * Gets a value from a specified key
     * 
     * @param key the key to find
     * @return the value of the key if it exists and null if it does not exist
     */
    public Value getValue(Key key) {
        for(Entry<Key,Value> entry : this) {
            if(entry.getKey() == key) return entry.getValue();
        }

        return null; // no key found
    }

    /**
     * Delete a key:value pair in the map
     * 
     * @param key the key to delete
     * @return the entry deleted or null if no key was deleted
     */
    public Entry<Key,Value> delete(Key key) {
        Entry<Key,Value> last = null;

        for(Entry<Key,Value> entry : this) {
            if(entry.getKey().equals(key)) {
                size--;

                if(last == null) {
                    head = entry.getNext();
                    return entry;
                }

                last.setNext(entry.getNext());
                return entry;
            }
            last = entry;
        }

        return null; // no key found
    }

    /**
     * Checks to see if the map is empty
     * 
     * @return true if the map is empty and false if not
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Get the size of the map
     * 
     * @return the amount of key:value pairs within the map
     */
    public int size() {
        return size;
    }

    /**
     * Shortcut for printing the toString contents of the map to the console
     */
    public void display() {
        System.out.println(this);
    }

    /**
     * Converts the map to a Queue
     * 
     * @return the map, converted to a queue
     */
    public Queue<Entry<Key,Value>> toQueue() {
        Queue<Entry<Key,Value>> queue = new Queue<>(size);

        for(Entry<Key,Value> entry : this) {
            queue.enqueue(entry);
        }

        return queue;
    }

    /**
     * Converts the map to a string
     */
    public String toString() {
        String out = "[ ";

        for(Entry<Key,Value> entry : this) {
            out += entry;
            if(entry.getNext() != null) out += ", "; // only add comma if this is not the last entry
        }

        out += " ]";
        return out;
    }
}
