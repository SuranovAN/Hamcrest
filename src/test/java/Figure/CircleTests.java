package Figure;

import Figure.FigureName.Circle;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTests {
    private static long startTests;
    private long startTestTime;

    @BeforeAll
    static void init() {
        System.out.println("Starting Tests");
        startTests = System.currentTimeMillis();
    }

    @AfterAll
    static void completeTests() {
        System.out.println("Tests complete " + (System.currentTimeMillis() - startTests) + " milliseconds");
    }

    @BeforeEach
    void initTest() {
        System.out.println("Start new test");
        startTestTime = System.currentTimeMillis();
    }

    @AfterEach
    void completeTest() {
        System.out.println("Test complete " + (System.currentTimeMillis() - startTestTime) + " milliseconds");
    }

    @Test
    void getPerimeterTest(){
        Circle c = new Circle(new Color("Blue"), new Point(1, 1), new Point(3,3));
        long expectedPerimeter = 18;
        assertTrue(c.getPerimeter() != 0d);
        Assertions.assertEquals(expectedPerimeter, Math.round(c.getPerimeter()));

        assertThat(expectedPerimeter, greaterThan(0L));
        assertThat(expectedPerimeter, equalTo(Math.round(c.getPerimeter())));
    }

    @Test
    void getAreaTest(){
        Circle c = new Circle(new Color("Blue"), new Point(1, 1), new Point(3,3));
        long expectedArea = 25;
        assertTrue(c.getArea() != 0d);
        assertEquals(expectedArea, Math.round(c.getArea()));

        assertThat(expectedArea, greaterThan(0L));
        assertThat(expectedArea, equalTo(Math.round(c.getArea())));
    }
}
