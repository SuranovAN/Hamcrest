package Figure;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class PointTests {
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
    void getDistanceTest(){
        Point p1 = new Point(1, 4);
        Point p2 = new Point(4, 2);
        Double expectedResult = 3.605551275463989;
        Double result = Point.getDistance(p1, p2);
        assertEquals(expectedResult, result);
    }

    @Test
    void getThirdPointTest(){
        Point p1 = new Point(1, 4);
        Point p2 = new Point(4, 2);
        Point expectedPoint = new Point(1, 2);
        Point result = Point.getThirdPoint(p1, p2);
        assertEquals(result.toString(), expectedPoint.toString());
    }

    @Test
    void checkPropertyThenHas(){
        Point p1 = new Point(1, 4);
        assertThat(p1, Matchers.<Point>hasProperty("x"));
    }

    @Test
    void toStringTest(){
        Point p1 = new Point(1, 4);
        assertThat(p1.toString(), Matchers.<String>hasToString("1 4"));
    }
}
