package AdventOfCode.Day8;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 09/12/2015.
 */
public class MatchsticksTest extends TestCase {

    @Test
    public void testGetStringRepresentationDelta() throws Exception {
        assertEquals("The difference should be 23", 23, Matchsticks.getStringRepresentationDelta("\"\"\n\"abc\"\n\"aaa\\\"aaa\"\n\"\\x27\""));
    }
}