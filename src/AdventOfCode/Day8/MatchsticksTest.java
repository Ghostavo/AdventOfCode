package AdventOfCode.Day8;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 09/12/2015.
 */
public class MatchsticksTest extends TestCase {

    @Test
    public void testGetStringRepresentationDelta() throws Exception {
        assertEquals("The difference should be 12", 12, Matchsticks.getStringRepresentationDelta("\"\"\n\"abc\"\n\"aaa\\\"aaa\"\n\"\\x27\""));
        assertEquals("The difference should be 7", 7, Matchsticks.getStringRepresentationDelta("\"\\\\\\x32\\\"\""));
    }

    @Test
    public void testGetStringExpansionDelta() throws Exception {
        assertEquals("The difference should be 19", 19, Matchsticks.getStringExpansionDelta("\"\"\n\"abc\"\n\"aaa\\\"aaa\"\n\"\\x27\""));
    }
}