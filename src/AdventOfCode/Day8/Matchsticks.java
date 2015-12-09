package AdventOfCode.Day8;

/**
 * Created by gmpp on 09/12/2015.
 */
public class Matchsticks {

    /**
     * Day 8 puzzle, part 1
     * @param input
     * @return
     */
    public static int getStringRepresentationDelta(String input)
    {
        System.out.println(input);
        int representation = 0;
        int meaning = 0;

        for(String line : input.split("\n"))
        {
            representation += line.length();
        }

        return representation - meaning;
    }
}
