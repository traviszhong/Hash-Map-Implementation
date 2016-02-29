package MyHash;

public class MyHashMap<K,V>{
	MyHashEntry<K,V>[] buckets;
	int numOfBucket;
	public MyHashMap(int numOfBucket){
		this.numOfBucket=numOfBucket;
		this.buckets=new MyHashEntry[numOfBucket];
	}
	public void put(K key,V val){
		if(containsKey(key)){
			MyHashEntry e=findEntry(key);
			e.val=val;
		}else{
			int id=getBucketId(key);
			if(buckets[id]==null) buckets[id]=new MyHashEntry<K,V>(key,val);
			else{
				MyHashEntry<K,V> e=new MyHashEntry<K,V>(key,val);
				e.next=buckets[id];
				buckets[id]=e;
			}
		}
	}
	public int getBucketId(K key){
		int hash=key.hashCode();
		return Math.abs(hash%numOfBucket);
	}
	public V get(K key){
		return findEntry(key).val;
	}
	public MyHashEntry<K,V> findEntry(K key){
		int id=getBucketId(key);
		MyHashEntry<K,V> e=buckets[id];
		while(e!=null&&!e.key.equals(key)) e=e.next;
		return e;
	}
	public boolean containsKey(K key){
		return findEntry(key)!=null;
	}
	
}
