package templatemethod;

public abstract class HouseTemplate {
    // template method, "final" not allow subclass override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        buildRoof();
        System.out.println("House is built.");
    }

    // default implementation
    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron, stone and sand.");
    }

    private void buildWindows() {
        System.out.println("Building windows.");
    }

    private void buildRoof() {
        System.out.println("Building roof.");
    }

    // methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();
}