package AdventOfCode.Day7;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by gmpp on 07/12/2015.
 */
public class SomeAssemblyRequiredTest extends TestCase {
    @Test
    public void testGetSignalOfA() throws Exception {
        assertEquals("1. Should get a value of 65079", 65079, SomeAssemblyRequired.getSignalOfA("123 -> x\n456 -> y\nx AND y -> d\nx OR y -> e\nx LSHIFT 2 -> f\ny RSHIFT 2 -> g\nNOT x -> h\nNOT y -> a"));
        assertEquals("1. Should get a value of 65412", 65412, SomeAssemblyRequired.getSignalOfA("123 -> x\n456 -> y\nx AND y -> d\nx OR y -> e\nx LSHIFT 2 -> f\ny RSHIFT 2 -> g\nNOT x -> a\nNOT y -> i"));
        assertEquals("1. Should get a value of 65079", 65079, SomeAssemblyRequired.getSignalOfA("NOT x -> h\nNOT y -> a\n123 -> x\n456 -> y\nx AND y -> d\nx OR y -> e\nx LSHIFT 2 -> f\ny RSHIFT 2 -> g"));
        assertEquals("1. Should get a value of 65412", 65412, SomeAssemblyRequired.getSignalOfA("NOT x -> a\nNOT y -> i\n123 -> x\n456 -> y\nx AND y -> d\nx OR y -> e\nx LSHIFT 2 -> f\ny RSHIFT 2 -> g"));
    }
}