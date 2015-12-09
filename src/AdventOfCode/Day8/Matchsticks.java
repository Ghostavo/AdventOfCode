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
        int representation = 0;
        int meaning = 0;

        for(String line : input.split("\n"))
        {
            representation += line.length();
            line = line.replaceAll("^\"",""); //Remove first "
            line = line.replaceAll("\"$", ""); // Remove last "
            line = line.replaceAll("\\\\\\\\", "c"); // Replace \\ with c
            line = line.replaceAll("\\\\\"", "\""); // Replace \" with "
            line = line.replaceAll("\\\\x.{2}","\\$"); // Replace \x** with $

            meaning += line.length();
        }

        return representation - meaning;
    }
}
