import java.util.ArrayList;

public class Box<T> {
	
	private T thing;
//	private int thingCount;
	private ArrayList<T> history;

	public Box(T firstThing) {
		this.thing = firstThing;
//		this.thingCount = 1;
		history = new ArrayList<>();
		history.add(firstThing);
	}
	
	public T getContents() {
		return thing;
	}

	public int getCount() {
//		return thingCount;
		return history.size();
	}


	public void replaceContents(T newThing) {
		this.thing = newThing;
//		thingCount++;
		history.add(newThing);
	}
	
	@Override
	public String toString() {
		return thing.toString() + " (item " + history.size() + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Box<?>) {
			Box<?> otherBoxR = (Box<?>) other;
			
			boolean sameThing = this.thing.equals(otherBoxR.thing);
			boolean sameCount = this.history.size()==otherBoxR.history.size();
			
			return sameThing && sameCount;
			
		} else {
			return false;
		}
	}

	public boolean contains(T someThing) {
		return this.thing.equals(someThing);
	}

	public boolean replaceIfDifferent(T someThing) {
		if (contains(someThing)) {
			return false;
		} else {
			replaceContents(someThing);
			return true;
		}
	}

	public boolean hasDuplicates() {
		if (history.contains(thing)) {
			return true;
		} else {
			for (int i = 0; i < history.size(); i++) {
				T thing1 = history.get(i);

				for (int j = i + 1; j < history.size(); j++) {
					if (thing1.equals(history.get(j))) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
