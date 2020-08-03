package Figure.FigureName;;

import Figure.Color;
import Figure.Figure;
import Figure.Point;

public class Rectangle extends Figure {
    private Point topLeft, bottomRight, bottomLeft;

    public Rectangle(Color fillColor, Point topLeft, Point bottomRight) {
        super(fillColor);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double getPerimeter() {
        bottomLeft = Point.getThirdPoint(topLeft, bottomRight);

        return 2 * (Point.getDistance(bottomLeft, topLeft)
                + Point.getDistance(bottomLeft, bottomRight));
    }

    @Override
    public double getArea() {
        bottomLeft = Point.getThirdPoint(topLeft, bottomRight);

        return Point.getDistance(bottomLeft, topLeft) * Point.getDistance(bottomLeft, bottomRight);
    }
}
