package AdventOfCode.Day5;

import java.util.regex.Pattern;

/**
 * Created by gmpp on 07/12/2015.
 */
public class DoesHeNotHaveInternElvesForThis {
    /**
     * Day 5 puzzle, part 1
     *
     * @param input
     * @return the number of nice strings
     */
    public static int getNumberOfNiceStrings(final String input) {
        final String[] lines = input.split("\n");
        int amount = 0;

        for (final String line : lines) {
            final Pattern vowels = Pattern.compile(".*(?:((a|e|i|o|u).*){3,}?).*");
            final Pattern repeat = Pattern.compile(".*(?:(.)\\1+).*");
            final Pattern forbidden = Pattern.compile(".*(?:(ab|cd|pq|xy)).*");
            if (vowels.matcher(line).matches() && repeat.matcher(line).matches() && !forbidden.matcher(line).matches()) {
                amount += 1;
            }
        }

        return amount;
    }

    /**
     * Day 5 puzzle, part 2
     *
     * @param input
     * @return the number of nice strings
     */
    public static int getNumberOfNiceStringsV2(final String input) {
        final String[] lines = input.split("\n");
        int amount = 0;

        for (final String line : lines) {
            final Pattern pair = Pattern.compile(".*(?:(?<pair>..).*(\\k<pair>)).*");
            final Pattern repeat = Pattern.compile(".*(?:(?<char>.).(\\k<char>)).*");
            if (pair.matcher(line).matches() && repeat.matcher(line).matches()) {
                amount += 1;
            }
        }

        return amount;
    }
}
