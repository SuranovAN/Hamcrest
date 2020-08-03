package Figure.FigureName;

import Figure.Color;
import Figure.Figure;
import Figure.Point;

public class Circle extends Figure {
    private final Point center, radius;
    private final double pi = 3.14;

    public Circle(Color fillColor, Point center, Point radius) {
        super(fillColor);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * Point.getDistance(center, radius);
    }

    @Override
    public double getArea() {
        return pi * Math.pow(Point.getDistance(center, radius), 2);
    }
}
