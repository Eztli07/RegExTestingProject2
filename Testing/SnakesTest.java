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
    void isEmail() //test 19
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"));
    }

    @Test
    void isGreaterThanFive() //test 20
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getBreed().length() > 5);
    }

    @Test
    void getBreedEqualsLength() //test 21
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().equals("5.8 feet"));
    }

    @Test
    void getLengthEqualsLengthCase() //test 22
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().equalsIgnoreCase("5.8 feet"));
    }

    @Test
    void emptyString() //test 23
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().isEmpty());

    }

    @Test
    void notEmptyString() //test 24
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(!python.getLength().isEmpty());
    }

    @Test
    void containsFeet() //test 25
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().contains("feet"));

    }

    @Test
    void startsWith5() //test 26
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().startsWith("5"));
    }

    @Test
    void endsWithT() //test 27
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().endsWith("t"));
    }

    @Test
    void nullString() //test 28
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength() == null);
    }

    @Test
    void notNullString() //test 29
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength() != null);
    }

    @Test
    void trimmedEquals() //test 30
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().trim().equals("5.8 feet"));
    }

    @Test
    void onlyLetters() //test 31
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches("[a-zA-Z]+"));

    }

    @Test
    void onlyNumbers() //test 32
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches("\\d+"));
    }

    @Test
    void numbersAndLetters() //test 33
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches("[a-zA-Z0-9]+"));
    }

    @Test
    void matchesLengthRegex() //test 34
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches(".*5.8 feet.*"));
    }

    @Test
    void specialCharacters() //test 35
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches(".*[^a-zA-Z0-9].*"));
    }

    @Test
    void uppercase() //test 36
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches(".*[A-Z].*"));
    }

    @Test
    void lowercase() //test 37
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches(".*[a-z].*"));
    }

    @Test
    void isPalindrome() //test 38
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().equals(new StringBuilder(python.getBreed()).reverse().toString()));
    }

    @Test
    void isEmail() //test 39
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"));
    }

    @Test
    void isGreaterThanFive() //test 40
    {
        Snakes python = new Snakes("Python", "5.8 feet", "0");
        System.out.println(python.getLength().length() > 5);
    }

}
