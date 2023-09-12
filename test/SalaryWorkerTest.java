import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker p1, p2;

    @BeforeEach
    void setUp()
    {

        p1 = new SalaryWorker("000000", "Joe", "Tester1", "Mr.", 2000, 60000);
        p2 = new SalaryWorker("000001", "Jane", "Tester2", "Mrs.", 1990, 80000);

    }

    @Test
    void testConstructor() {

        SalaryWorker testPerson = new SalaryWorker("000003", "Example", "Test", "Mr.", 1980, 100000);
        assertEquals("000003", testPerson.getID());
        assertEquals("Example", testPerson.getFirstName());
        assertEquals("Test", testPerson.getLastName());
        assertEquals("Mr.", testPerson.getTitle());
        assertEquals(1980, testPerson.getYOB());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1154.0, p1.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("There is a weekly pay of $1154.0, which represents one week, or 1/52, of the yearly salary", p1.displayWeeklyPay(0));
    }
}