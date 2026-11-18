package morse;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class MorseTester {

    @Test
    public void testConvertEtoMorse() {
        MorseConverter converter = new MorseConverter();
        String text = "E";

        String actual = converter.convert(text);
        String expected = ".";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertHtoMorse() {
        MorseConverter converter = new MorseConverter();
        String text = "H";

        String actual = converter.convert(text);
        String expected = "....";

        assertEquals(expected, actual);
    }

    //EH -> . ....
    @Test
    public void testConvertEHtoMorse() {
        MorseConverter converter = new MorseConverter();
        String text = "EH";

        String actual = converter.convert(text);
        String expected = ". ....";

        assertEquals(expected, actual);
    }

    //Översätt . -> E
    @Test
    public void testConvertMorseToE() {
        MorseConverter converter = new MorseConverter();
        String text = ".";

        String actual = converter.convertMorse(text);
        String expected = "E";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToH() {
        MorseConverter converter = new MorseConverter();
        String text = "....";

        String actual = converter.convertMorse(text);
        String expected = "H";

        assertEquals(expected, actual);
    }


    //Översätt . .... -> EH
    @Test
    public void testConvertMorseToEH() {
        MorseConverter converter = new MorseConverter();
        String text = ". ....";

        String actual = converter.convertMorse(text);
        String expected = "EH";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertSymbolToMorse() {
        MorseConverter converter = new MorseConverter();
        String text = "E!";

        String actual = converter.convert(text);
        String expected = "Invalid input";

        assertEquals(expected, actual);
    }

    @Test
    public void testNoInput() {
        MorseConverter converter = new MorseConverter();
        String text = "";

        String actual = converter.convert(text);
        String expected = "No input";

        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleSpaces() {
        MorseConverter converter = new MorseConverter();
        String text = "       ";

        String actual = converter.convert(text);
        String expected = "No input";

        assertEquals(expected, actual);
    }

    //Ogiltliga tecken

    //Gemener istället för versaler

    //Extra whitespace

    //Meningar? Ord?

    //Morse istället för Engelska och tvärt om

    //Felhantering i själva mainmetoden

    //Hantera morse och engelska i samma metod

    //Hantera morse och engelska i samma mening


}
