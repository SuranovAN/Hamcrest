package Figure;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Figure {
    private Color fillColor;

    protected Figure(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public double getPerimeter() {
        throw new NotImplementedException();
    }

    public double getArea() {
        throw new NotImplementedException();
    }
}
