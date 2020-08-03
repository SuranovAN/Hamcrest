package Figure;

import Figure.FigureName.Circle;
import Figure.FigureName.Line;
import Figure.FigureName.Rectangle;
import Figure.FigureName.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static double perimeterOneObject = 0;
    private static double areaOneObject = 0;
    private static double totalPerimeter = 0;
    private static double totalArea = 0;

    private static void addFigure(Figure f) {
        perimeterOneObject += f.getPerimeter();
        if (f.getClass().getName().equals(Line.class.getName())) {
            totalArea += 0;
        }
        areaOneObject += f.getArea();
    }

    public static void main(String[] args) {
        List<Figure> figures;
        figures = Arrays.asList(
                new Triangle(new Color("blue"),
                        new Point(1, 1),
                        new Point(2, 2),
                        new Point(2, 1)),
                new Circle(new Color("red"),
                        new Point(1, 2),
                        new Point(3, 4)),
                new Line(new Color("green"),
                        new Point(1, 1),
                        new Point(3, 4))
        );

        addFigure(new Rectangle(new Color("blue"), new Point(1, 4), new Point(10, 1)));
        System.out.printf("Фигура: прямоугольник\nпериметр = %.2f, площадь = %.2f\n\n",
                perimeterOneObject, areaOneObject);

        perimeterOneObject = 0;
        areaOneObject = 0;
        addFigure(new Circle(new Color("blue"), new Point(2, 2), new Point(3, 2)));
        System.out.printf("Фигура: круг\nпериметр = %.2f, площадь = %.2f\n\n", perimeterOneObject, areaOneObject);

        perimeterOneObject = 0;
        areaOneObject = 0;
        addFigure(new Triangle(new Color("blue"),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 1)));
        System.out.printf("Фигура: треугольник\nпериметр = %.2f, площадь = %.2f\n\n",
                perimeterOneObject, areaOneObject);

        for (Figure figure : figures) {
            totalPerimeter += figure.getPerimeter();
            if (figure.getClass().getName().equals(Line.class.getName())) {
                continue;
            }
            totalArea += figure.getArea();
        }

        System.out.format("Perimeter %.2f%n", totalPerimeter);
        System.out.format("Area %.2f%n", totalArea);
    }
}
