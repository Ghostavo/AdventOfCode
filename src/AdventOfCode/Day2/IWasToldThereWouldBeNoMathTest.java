package AdventOfCode.Day2;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class IWasToldThereWouldBeNoMathTest extends TestCase {
    @Test
    public void testGetAmountOfFabric() throws Exception {
        assertEquals("Result must be 58", 58, IWasToldThereWouldBeNoMath.getAmountOfFabric("2x3x4"));
        assertEquals("Result must be 43", 43, IWasToldThereWouldBeNoMath.getAmountOfFabric("1x1x10"));
    }

    @Test
    public void testGetAmountOfRibbon() throws Exception {
        assertEquals("Result must be 34", 34, IWasToldThereWouldBeNoMath.getAmountOfRibbon("2x3x4"));
        assertEquals("Result must be 14", 14, IWasToldThereWouldBeNoMath.getAmountOfRibbon("1x1x10"));
    }
}