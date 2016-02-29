package MyHash;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String,Integer> hash=new MyHashMap<String,Integer>(20);
		hash.put("Iloveyou",520);
		hash.put("Idontloveyou",521);
		hash.put("Iloveyo",522);
		System.out.print(hash.get("Iloveyo"));
		hash.put("Iloveyo",523);
		System.out.print(hash.get("Iloveyo"));
	}

}
