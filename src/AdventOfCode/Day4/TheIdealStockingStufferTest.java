package AdventOfCode.Day4;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class TheIdealStockingStufferTest extends TestCase {
    @Test
    public void testGetLowestMd5HashForFiveZeroes() throws Exception {
        assertEquals("Result must be 609043", 609043, TheIdealStockingStuffer.getLowestMd5HashForFiveZeroes("abcdef"));
        assertEquals("Result must be 1048970", 1048970, TheIdealStockingStuffer.getLowestMd5HashForFiveZeroes("pqrstuv"));
    }
}