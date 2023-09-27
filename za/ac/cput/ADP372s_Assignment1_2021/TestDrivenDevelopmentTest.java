package za.ac.cput.ADP372s_Assignment1_2021;

 /**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class TestDrivenDevelopmentTest {
    private TestDrivenDevelopmentTest car1;
    private TestDrivenDevelopmentTest car2;
    private TestDrivenDevelopmentTest car3;

    private TestDrivenDevelopmentTest carDealer1;
    private TestDrivenDevelopmentTest carDealer2;


    @BeforeEach
    void setUp() {
        car1 = new TestDrivenDevelopmentTest();
        car2 = car3;

        carDealer1 = new TestDrivenDevelopmentTest();
        carDealer2 = carDealer1;
    }


    /* Testing For Object Identity */
    @Test
    void objectIdentity(){
        assertSame(car2,car3);
    }

    /* Making Sure The Test Fails */
    @Test
    void failingTest(){
        fail("Unexpected Error... Shutting Down...");
        assertNotSame(carDealer1,car1);
    }

    /* Running Timeouts */
    @Test
    @Timeout(3)
    void timeOuts() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Please be patient... Test will pass soon...");
    }

    /* Initiating A Disabling Test */
    @Test
    @Disabled
    void disablingTest() throws InterruptedException{
        assertEquals(carDealer1,carDealer2);
        System.out.println("Exiting...");
    }
}