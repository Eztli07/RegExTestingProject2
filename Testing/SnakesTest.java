import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesTest {

    @Test
    void getBreed()
    {
        Snakes python = new Snakes("Python", 5.8, false);
        assert(python.getBreed().equals("Python"));
    }

    @Test
    void getLength()
    {

    }

    @Test
    void isVenomous()
    {

    }
}