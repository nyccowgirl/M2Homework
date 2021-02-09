public class Quad<T, S> {

    private Pair<T> pair1;
    private Pair<S> pair2;

    public Quad(Pair<T> pair1, Pair<S> pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public Pair<T> getPair1() {
        return pair1;
    }

    public Pair<S> getPair2() {
        return pair2;
    }

    public void setPair1(Pair<T> pair1) {
        this.pair1 = pair1;
    }

    public void setPair2(Pair<S> pair2) {
        this.pair2 = pair2;
    }

    @Override
    public String toString() {
        return "Pair 1: " + pair1.toString() + "\tPair 2: " + pair2.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quad<?, ?>)) return false;
        Quad<?, ?> quad = (Quad<?, ?>) o;
        return (pair1.equals(quad.pair1) && pair2.equals(quad.pair2)) ||
                (pair1.equals(quad.pair2) && pair2.equals(quad.pair1));
    }

}
