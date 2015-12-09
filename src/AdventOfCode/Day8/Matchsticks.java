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
            System.out.print(line);
            representation += line.length();
            line = line.replaceAll("^\"","");
            line = line.replaceAll("\"$", "");
            line = line.replaceAll("\\\\\"", "\"");
            line = line.replaceAll("\\\\x.{2}","\\$");
            line = line.replaceAll("\\\\\\\\", "\\\\");
            meaning += line.length();

            System.out.println(" : " + line);
        }

        return representation - meaning;
    }
}
