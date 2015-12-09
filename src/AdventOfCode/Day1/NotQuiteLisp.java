package AdventOfCode.Day1;

/**
 * Created by gmpp on 07/12/2015.
 */
public class NotQuiteLisp {
    /**
     * Day 1 puzzle, part 1
     *
     * @param input movement characters
     * @return the final floor position
     */
    public static int getFloor(final String input) {
        int floor = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                floor += 1;
            }

            if (input.charAt(i) == ')') {
                floor -= 1;
            }
        }

        return floor;
    }

    /**
     * Day 1 puzzle, part 2
     *
     * @param input movement characters
     * @return character at which the basement is entered
     */
    public static int getBasementCharacterPosition(final String input) {
        int floor = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                floor += 1;
            }

            if (input.charAt(i) == ')') {
                floor -= 1;
            }

            if (floor == -1) {
                return i + 1;
            }
        }

        return 0;
    }
}
