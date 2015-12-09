package AdventOfCode.Day1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class NotQuiteLispTest extends TestCase {
    @Test
    public void testGetFloor() throws Exception {
        assertEquals("Result must be 1", 1 , NotQuiteLisp.getFloor("("));
        assertEquals("Result must be 1", -1 ,NotQuiteLisp.getFloor(")"));
        assertEquals("Result must be 1", 0 ,NotQuiteLisp.getFloor("()"));
        assertEquals("Result must be 1", 0 ,NotQuiteLisp.getFloor(")("));
        assertEquals("Result must be 1", 2 ,NotQuiteLisp.getFloor("(("));
    }

    @Test
    public void testGetBasementCharacterPosition() throws Exception {
        assertEquals("Result must be 1", 1 ,NotQuiteLisp.getBasementCharacterPosition(")"));
        assertEquals("Result must be 5", 5 ,NotQuiteLisp.getBasementCharacterPosition("()())"));
    }
}