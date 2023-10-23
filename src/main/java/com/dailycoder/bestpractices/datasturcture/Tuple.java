package com.dailycoder.bestpractices.datasturcture;

/**
 * The Tuple class represents an ordered collection of elements, where each element
 * can be of a different type. Tuples are immutable, meaning their values cannot
 * be changed after creation.
 *
 * @param <A> The type of the first element in the tuple.
 * @param <B> The type of the second element in the tuple.
 * @param <C> The type of the third element in the tuple.
 */
public class Tuple<A, B, C> {
    private final A first;  // The first element of the tuple.
    private final B second; // The second element of the tuple.
    private final C third;  // The third element of the tuple.

    /**
     * Constructs a new Tuple with the specified elements.
     *
     * @param first  The first element of the tuple.
     * @param second The second element of the tuple.
     * @param third  The third element of the tuple.
     */
    public Tuple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Retrieves the first element of the tuple.
     *
     * @return The first element of the tuple.
     */
    public A getFirst() {
        return first;
    }

    /**
     * Retrieves the second element of the tuple.
     *
     * @return The second element of the tuple.
     */
    public B getSecond() {
        return second;
    }

    /**
     * Retrieves the third element of the tuple.
     *
     * @return The third element of the tuple.
     */
    public C getThird() {
        return third;
    }

    /**
     * Returns a string representation of the tuple in the form (first, second, third).
     *
     * @return A string representation of the tuple.
     */
    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
