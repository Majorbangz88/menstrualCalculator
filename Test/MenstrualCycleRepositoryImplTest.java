import Data.Models.User;
import Data.Repositories.MenstrualCycleRepositoryImpl;
import org.junit.jupiter.api.Test;

public class MenstrualCycleRepositoryImplTest {

    MenstrualCycleRepositoryImpl cycleApp = new MenstrualCycleRepositoryImpl();
    public void setup() {
        cycleApp = new MenstrualCycleRepositoryImpl();
    }

    @Test
    public void testThatUserCanBeAddedToList() {
//        User sandra = new User();
//        cycleApp.save(sandra);
    }
}
