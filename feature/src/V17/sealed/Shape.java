package V17.sealed;

public sealed abstract class Shape permits Rectangle, Circle {

    public abstract double calculateArea();

}
