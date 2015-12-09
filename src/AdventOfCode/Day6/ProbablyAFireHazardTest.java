package AdventOfCode.Day6;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class ProbablyAFireHazardTest extends TestCase {
    @Test
    public void testGetNumberOfLitLights() throws Exception {
        assertEquals("1. Should turn on every light (1.000.000)", 1000000, ProbablyAFireHazard.getNumberOfLitLights("turn on 0,0 through 999,999"));
        assertEquals("2. Should turn on every light in the first row (1.000)", 1000, ProbablyAFireHazard.getNumberOfLitLights("toggle 0,0 through 999,0"));
        assertEquals("3. Should turn off the middle four lights ()", 998996, ProbablyAFireHazard.getNumberOfLitLights("turn on 0,0 through 999,999\ntoggle 0,0 through 999,0\nturn off 499,499 through 500,500"));
    }

    @Test
    public void testGetCombinedBrightness() throws Exception {
        assertEquals("1. Should get a total brightness of 1", 1, ProbablyAFireHazard.getCombinedBrightness("turn on 0,0 through 0,0"));
        assertEquals("2. Should get a total brightness of 2.000.000", 2000000, ProbablyAFireHazard.getCombinedBrightness("toggle 0,0 through 999,999"));
    }
}