import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesTest {

    @Test
    void getBreedEqualsPython() //test 1
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().equals("Python"));
    }

    @Test
    void getBreedEqualsPythonCase() //test 2
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().equalsIgnoreCase("python"));
    }

    @Test
    void emptyString() //test 3
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().isEmpty());

    }

    @Test
    void notEmptyString() //test 4
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(!python.getBreed().isEmpty());
    }

    @Test
    void containsPy() //test 5
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().contains("Py"));

    }

    @Test
    void startsWithP() //test 6
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().startsWith("P"));
    }

    @Test
    void endsWithN() //test 7
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().endsWith("n"));
    }

    @Test
    void nullString() //test 8
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed() == null);
    }

    @Test
    void notNullString() //test 9
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed() != null);
    }

    @Test
    void trimmedEquals() //test 10
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().trim().equals("Python"));
    }

    @Test
    void onlyLetters() //test 11
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches("[a-zA-Z]+"));

    }

    @Test
    void onlyNumbers() //test 12
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches("\\d+"));
    }

    @Test
    void numbersAndLetters() //test 13
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches("[a-zA-Z0-9]+"));
    }

    @Test
    void matchesPythonRegex() //test 14
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches(".*Python.*"));
    }

    @Test
    void specialCharacters() //test 15
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches(".*[^a-zA-Z0-9].*"));
    }

    @Test
    void uppercase() //test 16
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches(".*[A-Z].*"));
    }

    @Test
    void lowercase() //test 17
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches(".*[a-z].*"));
    }

    @Test
    void isPalindrome() //test 18
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().equals(new StringBuilder(python.getBreed()).reverse().toString()));
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
