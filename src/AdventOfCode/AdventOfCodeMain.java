package AdventOfCode;

import AdventOfCode.Day1.NotQuiteLisp;
import AdventOfCode.Day2.IWasToldThereWouldBeNoMath;
import AdventOfCode.Day3.PerfectlySphericalHousesInAVacuum;
import AdventOfCode.Day4.TheIdealStockingStuffer;
import AdventOfCode.Day5.DoesHeNotHaveInternElvesForThis;
import AdventOfCode.Day6.ProbablyAFireHazard;
import AdventOfCode.Day7.SomeAssemblyRequired;
import AdventOfCode.Day8.Matchsticks;

import java.util.Scanner;

/**
 * Created by gmpp on 01/12/2015.
 */
public final class AdventOfCodeMain {
    private AdventOfCodeMain() {
    }

    public static void main(final String... args) {
        System.out.println("Day 1");
        String day1 = getStringInputFromFile("/AdventOfCode/Day1/day1.txt");
        System.out.println("\tFloor: " + NotQuiteLisp.getFloor(day1));
        System.out.println("\tPosition: " + NotQuiteLisp.getBasementCharacterPosition(day1));

        System.out.println("\nDay 2");
        String day2 = getStringInputFromFile("/AdventOfCode/Day2/day2.txt");
        System.out.println("\tAmount of fabric needed: " + IWasToldThereWouldBeNoMath.getAmountOfFabric(day2));
        System.out.println("\tAmount of ribbon needed: " + IWasToldThereWouldBeNoMath.getAmountOfRibbon(day2));

        System.out.println("\nDay 3");
        String day3 = getStringInputFromFile("/AdventOfCode/Day3/day3.txt");
        System.out.println("\tNumber of houses visited: " + PerfectlySphericalHousesInAVacuum.getVisitedHouses(day3));
        System.out.println("\tNumber of houses visited with robo-santa: " + PerfectlySphericalHousesInAVacuum.getVisitedHousesWithRobot(day3));

        System.out.println("\nDay 4");
        String day4 = getStringInputFromFile("/AdventOfCode/Day4/day4.txt");
        System.out.println("\tLowest decimal number for five leading zeroes in hash: " + TheIdealStockingStuffer.getLowestMd5HashForFiveZeroes(day4));
        System.out.println("\tLowest decimal number for six leading zeroes in hash: " + TheIdealStockingStuffer.getLowestMd5HashForSixZeroes(day4));

        System.out.println("\nDay 5");
        String day5 = getStringInputFromFile("/AdventOfCode/Day5/day5.txt");
        System.out.println("\tNumber of nice strings: " + DoesHeNotHaveInternElvesForThis.getNumberOfNiceStrings(day5));
        System.out.println("\tNumber of nice strings: " + DoesHeNotHaveInternElvesForThis.getNumberOfNiceStringsV2(day5));

        System.out.println("\nDay 6");
        String day6 = getStringInputFromFile("/AdventOfCode/Day6/day6.txt");
        System.out.println("\tNumber of lit lights: " + ProbablyAFireHazard.getNumberOfLitLights(day6));
        System.out.println("\tCombined brightness: " + ProbablyAFireHazard.getCombinedBrightness(day6));

        System.out.println("\nDay 7");
        String day7 = getStringInputFromFile("/AdventOfCode/Day7/day7.txt");
        System.out.println("\tValue of A is: " + SomeAssemblyRequired.getSignalOfA(day7));
        System.out.println("\tValue of A is: " + SomeAssemblyRequired.getSignalOfAWithBOverride(day7));

        System.out.println("\nDay8");
        String day8 = getStringInputFromFile("/AdventOfCode/Day8/day8.txt");
        System.out.println("\tString length delta for representation: " + Matchsticks.getStringRepresentationDelta(day8));
        System.out.println("\tString length delta for expansion: " + Matchsticks.getStringExpansionDelta(day8));
    }

    private static String getStringInputFromFile(String filename)
    {
        Scanner scan = new Scanner(AdventOfCodeMain.class.getResourceAsStream(filename));

        StringBuilder sb = new StringBuilder();
        while(scan.hasNext())
        {
            sb.append(scan.nextLine() + "\n");
        }

        return sb.toString();
    }
}