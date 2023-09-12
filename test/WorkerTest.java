import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker p1, p2;

    @BeforeEach
    void setUp()
    {

        p1 = new Worker("000000", "Joe", "Tester1", "Mr.", 2000, 15);
        p2 = new Worker("000001", "Jane", "Tester2", "Mrs.", 1990, 20);

    }

    @Test
    void testConstructor() {

        Worker testPerson = new Worker("000003", "Example", "Test", "Mr.", 1980, 25);
        assertEquals("000003", testPerson.getID());
        assertEquals("Example", testPerson.getFirstName());
        assertEquals("Test", testPerson.getLastName());
        assertEquals("Mr.", testPerson.getTitle());
        assertEquals(1980, testPerson.getYOB());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(225.0, p1.calculateWeeklyPay(15));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("There were 15.0 hours of regular pay for a total of $225.0, while there were 0 hours of overtime pay for a total of $0.00, and the total combined pay was $225.0", p1.displayWeeklyPay(15));
    }



}