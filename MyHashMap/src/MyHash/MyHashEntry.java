package MyHash;

public class MyHashEntry<K,V> {
	K key;
	V val;
	MyHashEntry next;
	public MyHashEntry(K k,V v){
		this.key=k;
		this.val=v;
	}
}
