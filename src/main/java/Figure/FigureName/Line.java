package Figure.FigureName;;

import Figure.Color;
import Figure.Figure;
import Figure.Point;

public class Line extends Figure {
    private Point start, end;

    public Line(Color fillColor, Point start, Point end) {
        super(fillColor);
        this.start = start;
        this.end = end;
    }

    @Override
    public double getPerimeter() {
        return Point.getDistance(start, end);
    }
}
