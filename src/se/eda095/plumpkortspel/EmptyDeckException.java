package se.eda095.plumpkortspel;

/**
 * Thrown when there is an attempt to access an empty deck.
 */
public class EmptyDeckException extends RuntimeException {
    public EmptyDeckException() {
        super();
    }
    public EmptyDeckException(String msg) {
        super(msg); 
    }
}
