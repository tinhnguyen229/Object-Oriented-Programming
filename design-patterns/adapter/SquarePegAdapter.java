package adapter;

public class SquarePegAdapter extends RoundPeg {
    /*
     * It extends the RoundPeg class to let 
     * the adapter objects act as round pegs.
     */
    private SquarePeg peg;
    public int getRadius() {
        /*
         * The adapter pretends that it's a round peg 
         * with a radius that could fit the square peg 
         * that the adapter actually wraps.
         */
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
    public SquarePegAdapter(int radius) {
        super(radius);
    }
    public SquarePegAdapter(SquarePeg peg) {
        super((int) (peg.getWidth() * Math.sqrt(2) / 2));
        this.peg = peg;
    }
}
