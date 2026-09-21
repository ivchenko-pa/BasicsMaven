import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum_result6_when2and4() {
        int input_a = 2;
        int input_b = 4;

        int expected = 6;
        int actual = Main.sum(input_a,input_b);
        assertEquals(expected, actual);
    }

    @Test
    void sum_result7_when3and4() {
        int input_a = 2;
        int input_b = 4;

        int expected = 7;
        int actual = Main.sum(input_a,input_b);
        assertEquals(expected, actual);
    }
}