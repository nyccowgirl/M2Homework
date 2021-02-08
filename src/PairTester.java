
public class PairTester {

	public static void main(String[] args) {
		Pair<Integer> numberPair = new Pair<Integer>(3,4);
		Pair<String> wordPair = new Pair<String>("hello", "goodbye");
		
		System.out.println(numberPair);
		System.out.println(wordPair);
		
		// testing our sameItems method
		String s1 = new String("apple");
		String s2 = new String("apple");
		Pair<String> wordPair2 = new Pair<String>(s1, s2);
		System.out.println("wordPair2 contains the same items? " + wordPair2.sameItems());

		// testing our equals method
		Pair<Integer> numberPair2 = new Pair<Integer>(1, 2);
		Pair<Integer> numberPair3 = new Pair<Integer>(2, 1);

		System.out.println("numberPair2 is equal to numberPair3? " + numberPair2.equals(numberPair3));

		
		PairDifferent<Integer,String> numberWordPair = new PairDifferent<Integer,String>(2, "hello");
		PairDifferent<Integer,Integer> doubleNumberPair = new PairDifferent<Integer,Integer>(1,1);

		// testing our Quad class
		Quad quad1 = new Quad(numberPair2, wordPair2);
		Quad quad2 = new Quad(wordPair2, numberPair3);

		System.out.println(quad1);
		System.out.println(quad2);
		System.out.println(quad1.equals(quad2));

	}

}
