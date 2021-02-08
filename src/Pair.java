
public class Pair<T> {
	
	private T item1, item2;
	
	public Pair(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		return item1.toString() + "\t" + item2.toString();
	}
	
	public boolean sameItems() {
		return item1.equals(item2);
		// return item1==item2; INCORRECT! tests for aliases, not logical equivalence
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Pair<?>) {
			Pair<?> anotherPair = (Pair<?>) o;

			boolean sameItem1 = this.item1.equals(anotherPair.item1);
			boolean sameItem2 = this.item2.equals(anotherPair.item2);
			boolean sameUnorderItem1 = this.item1.equals(anotherPair.item2);
			boolean sameUnorderItem2 = this.item2.equals(anotherPair.item1);

			return (sameItem1 && sameItem2) || (sameUnorderItem1 && sameUnorderItem2);
		} else {
			return false;
		}
	}

}
