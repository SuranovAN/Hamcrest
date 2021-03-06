package DDOSUser;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.FileNotFoundException;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserMapsTests {
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

    @DisplayName("fileExist")
    @Test
    void fileExist() {
        File usersFile = new File("src\\main\\resources\\users.db");
        File serverLog = new File("src\\main\\resources\\server.log");
        assertTrue(usersFile.exists());
        assertTrue(serverLog.exists());
        System.out.println("users.db exists\n" + "server.log exists");
    }


    @Test
    void userMapNotEmpty() throws FileNotFoundException {
        String usersDb = "src\\main\\resources\\users.db";
        UsersMaps usersMaps = new UsersMaps();
        Main.readUsersFromFile(usersDb, usersMaps);
        assertNotNull(usersMaps);
    }

    @Test
    void hasItem() throws FileNotFoundException {
        String usersDb = "src\\main\\resources\\users.db";
        UsersMaps usersMaps = new UsersMaps();
        Main.readUsersFromFile(usersDb, usersMaps);

        MatcherAssert.assertThat(usersMaps.getUsersMap(), hasKey("1844512"));
        MatcherAssert.assertThat(usersMaps.getUsersMap(), hasValue(hasProperty("id")));
    }
}
