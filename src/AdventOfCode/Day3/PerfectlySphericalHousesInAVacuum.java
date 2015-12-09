package AdventOfCode.Day3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gmpp on 07/12/2015.
 */
public class PerfectlySphericalHousesInAVacuum {
    /**
     * Day 3 puzzle, part 1
     *
     * @param input
     * @return the number of visited houses
     */
    public static int getVisitedHouses(final String input) {
        final Map<String, Integer> houses = new ConcurrentHashMap<String, Integer>();
        houses.put("0:0", 1);

        int x = 0;
        int y = 0;

        for (final char movement : input.toCharArray()) {
            switch (movement) {
                case '>':
                    x += 1;
                    break;
                case '^':
                    y += 1;
                    break;
                case '<':
                    x -= 1;
                    break;
                case 'v':
                    y -= 1;
                    break;
                default:
                    break;
            }

            final String key = x + ":" + y;

            houses.put(key, houses.getOrDefault(key, 0) + 1);
        }

        return houses.size();
    }

    /**
     * Day 3 puzzle, part 2
     *
     * @param input
     * @return the number of houses visited, including by the robot
     */
    public static int getVisitedHousesWithRobot(final String input) {
        final Map<String, Integer> houses = new ConcurrentHashMap<String, Integer>();
        houses.put("0:0", 2);

        int x = 0;
        int y = 0;

        int robotX = 0;
        int robotY = 0;

        boolean santaTurn = true;

        for (final char movement : input.toCharArray()) {
            String key;
            if (santaTurn) {
                switch (movement) {
                    case '>':
                        x += 1;
                        break;
                    case '^':
                        y += 1;
                        break;
                    case '<':
                        x -= 1;
                        break;
                    case 'v':
                        y -= 1;
                        break;
                    default:
                        break;
                }
                key = x + ":" + y;
            } else {
                switch (movement) {
                    case '>':
                        robotX += 1;
                        break;
                    case '^':
                        robotY += 1;
                        break;
                    case '<':
                        robotX -= 1;
                        break;
                    case 'v':
                        robotY -= 1;
                        break;
                    default:
                        break;
                }
                key = robotX + ":" + robotY;
            }

            houses.put(key, houses.getOrDefault(key, 0) + 1);
            santaTurn = !santaTurn;
        }

        return houses.size();
    }
}
