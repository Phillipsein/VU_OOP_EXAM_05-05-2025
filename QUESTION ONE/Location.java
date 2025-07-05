package vu.oop_exam;

/**
 *
 * @author phill
 */
public class Location {
    private final int x;
    private final int y;

    public Location(int x, int y) {
        if (x < 0 || x > 100 || y < 0 || y > 100)
            throw new IllegalArgumentException("Coordinates must be 0–100");
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
