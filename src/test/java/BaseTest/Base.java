package BaseTest;

import com.driver_manager.DriverManager;
import org.junit.jupiter.api.AfterAll;



public class Base {
    @AfterAll
    public static void kill() {
        DriverManager.closeDriver();
    }

}
