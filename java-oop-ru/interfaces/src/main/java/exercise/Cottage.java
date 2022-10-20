package exercise;

// BEGIN
public class Cottage implements Home{
    double area;
    int floorCount;

    public Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public double getArea() {
        return area;
    }

    public String toString() {
        return String.format("%s этажный коттедж площадью %s метров", floorCount, getArea());
    }
}
// END
