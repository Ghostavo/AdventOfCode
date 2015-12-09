package AdventOfCode.Day3;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class PerfectlySphericalHousesInAVacuumTest extends TestCase {
    @Test
    public void testGetVisitedHouses() throws Exception {
        assertEquals("Result must be 2", 2, PerfectlySphericalHousesInAVacuum.getVisitedHouses(">"));
        assertEquals("Result must be 4", 4, PerfectlySphericalHousesInAVacuum.getVisitedHouses("^>v<"));
        assertEquals("Result must be 2", 2, PerfectlySphericalHousesInAVacuum.getVisitedHouses("^v^v^v^v^v"));
    }

    @Test
    public void testGetVisitedHousesWithRobot() throws Exception {
        assertEquals("Result must be 3", 3, PerfectlySphericalHousesInAVacuum.getVisitedHousesWithRobot("^v"));
        assertEquals("Result must be 3", 3, PerfectlySphericalHousesInAVacuum.getVisitedHousesWithRobot("^>v<"));
        assertEquals("Result must be 11", 11, PerfectlySphericalHousesInAVacuum.getVisitedHousesWithRobot("^v^v^v^v^v"));
    }
}