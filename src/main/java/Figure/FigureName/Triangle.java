package Figure.FigureName;;

import Figure.Color;
import Figure.Figure;
import Figure.Point;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Color fillColor, Point a, Point b, Point c) {
        super(fillColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return Point.getDistance(a, b) + Point.getDistance(b, c) + Point.getDistance(c, a);
    }

    @Override
    public double getArea() {
        double hp = getPerimeter() / 2.0;
        return Math.sqrt(hp
                * (hp - Point.getDistance(a, b))
                * (hp - Point.getDistance(b, c))
                * (hp - Point.getDistance(c, a)));
    }
}
