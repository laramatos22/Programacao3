package Generics.ex5;

/**
 * What is the following class converted to after type erasure?
 * 
public class Pair<K, V> {

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey(); { return key; }
    public V getValue(); { return value; }

    public void setKey(K key)     { this.key = key; }
    public void setValue(V value) { this.value = value; }

    private K key;
    private V value;
}
 *
 */

//Answer:

public class Pair {
	
	public Pair(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	private Object key;
	private Object value;
	
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	

}
