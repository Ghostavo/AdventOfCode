package AdventOfCode.Day5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class DoesHeNotHaveInternElvesForThisTest extends TestCase {
    @Test
    public void testGetNumberOfNiceStrings() throws Exception {
        assertEquals("1. aaa is a nice string", 1, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings("aaa"));
        assertEquals("2. ugknbfddgicrmopn is a nice string", 1, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings("ugknbfddgicrmopn"));
        assertEquals("3. jchzalrnumimnmhp is a naughty string, doesn't have double letter", 0, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings("jchzalrnumimnmhp"));
        assertEquals("4. haegwjzuvuyypxyu is a naughty string, has xy", 0, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings("haegwjzuvuyypxyu"));
        assertEquals("5. dvszwmarrgswjxmb is a naughty string, only has one vowel", 0, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings("dvszwmarrgswjxmb"));
    }

    @Test
    public void testGetNumberOfNiceStringsV2() throws Exception {
        assertEquals("1. qjhvhtzxzqqjkmpb is a nice string", 1, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStringsV2("qjhvhtzxzqqjkmpb"));
        assertEquals("2. xxyxx is a nice string", 1, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStringsV2("xxyxx"));
        assertEquals("3. uurcxstgmygtbstg is naughty because it has a pair (tg) but no repeat with a single letter between them.", 0, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStringsV2("uurcxstgmygtbstg"));
        assertEquals("4. ieodomkazucvgmuy is naughty because it has a repeating letter with one between (odo), but no pair that appears twice.", 0, DoesHeNotHaveInternElvesForThis.getNumberOfNiceStringsV2("ieodomkazucvgmuy"));
    }
}