package adapter;

public class TestMain {

    public static void main(String[] args) {
        // test RoundHole and RoundPeg
        RoundHole hole = new RoundHole(10);
        RoundPeg rPeg = new RoundPeg(8);
        System.out.println(hole.fits(rPeg));// true
        
        // test SquarePeg
        SquarePeg sPeg = new SquarePeg(5);
//        System.out.println(hole.fits(sPeg)); // can't compile
        
        // test Adapter Object
        SquarePegAdapter adapter = new SquarePegAdapter(sPeg);
        System.out.println(hole.fits(adapter));// true
    }
}
