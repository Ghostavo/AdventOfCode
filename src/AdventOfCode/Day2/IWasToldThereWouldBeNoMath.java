package AdventOfCode.Day2;

/**
 * Created by gmpp on 07/12/2015.
 */
public class IWasToldThereWouldBeNoMath {
    /**
     * Day 2 puzzle, part 1
     *
     * @param input size of boxes
     * @return amount of fabric needed
     */
    public static int getAmountOfFabric(final String input) {
        final String[] lines = input.split("\n");
        int amount = 0;

        for (final String line : lines) {
            final String[] values = line.split("x");
            final int a = Integer.parseInt(values[0]);
            final int b = Integer.parseInt(values[1]);
            final int c = Integer.parseInt(values[2]);

            final int ab = a * b;
            final int ac = a * c;
            final int bc = b * c;

            amount += Math.min(ab, Math.min(ac, bc)) + 2 * ab + 2 * ac + 2 * bc;
        }

        return amount;
    }

    /**
     * Day 2 puzzle, part 2
     *
     * @param input size of boxes
     * @return amount of fabric needed
     */
    public static int getAmountOfRibbon(final String input) {
        final String[] lines = input.split("\n");
        int amount = 0;

        for (final String line : lines) {
            final String[] values = line.split("x");
            final int a = Integer.parseInt(values[0]);
            final int b = Integer.parseInt(values[1]);
            final int c = Integer.parseInt(values[2]);

            final int ab = a + a + b + b;
            final int ac = a + a + c + c;
            final int bc = b + b + c + c;

            amount += Math.min(ab, Math.min(ac, bc)) + a * b * c;
        }

        return amount;
    }
}
