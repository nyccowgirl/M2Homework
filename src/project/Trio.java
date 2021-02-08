package project;

import java.util.Objects;

public class Trio<T> {

    private T item1, item2, item3;

    public Trio(T item1, T item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Trio(T item) {
        this(item, item, item);
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public T getItem3() {
        return item3;
    }

    public void setItem3(T item3) {
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return "(" + item1 + ", " + item2 + ", " + item3 + ")";
    }

    public void replaceAll(T item) {
        this.setItem1(item);
        this.setItem2(item);
        this.setItem3(item);
    }

    public boolean hasDuplicates() {
        return item1.equals(item2) || item1.equals(item3) || item2.equals(item3);
    }

    public int count(T item) {
        int count = 0;

        if (item1.equals(item)) {
            count++;
        }

        if (item2.equals(item)) {
            count++;
        }

        if (item3.equals(item)) {
            count++;
        }

        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trio)) return false;
        Trio<?> trio = (Trio<?>) o;
        return (Objects.equals(item1, trio.item1) && Objects.equals(item2, trio.item2) &&
                Objects.equals(item3, trio.item3)) || (Objects.equals(item1, trio.item2) &&
                Objects.equals(item2, trio.item3) && Objects.equals(item3, trio.item1)) ||
                (Objects.equals(item1, trio.item3) && Objects.equals(item2, trio.item1) &&
                Objects.equals(item3, trio.item2)) || (Objects.equals(item1, trio.item1) &&
                Objects.equals(item2, trio.item3) && Objects.equals(item3, trio.item2)) ||
                (Objects.equals(item1, trio.item3) && Objects.equals(item2, trio.item2) &&
                Objects.equals(item3, trio.item1)) || (Objects.equals(item1, trio.item2) &&
                Objects.equals(item2, trio.item1) && Objects.equals(item3, trio.item3));
    }



}
