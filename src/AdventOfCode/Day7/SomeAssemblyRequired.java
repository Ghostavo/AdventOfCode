package AdventOfCode.Day7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gmpp on 07/12/2015.
 */
public class SomeAssemblyRequired {
    /**
     * Day 7 puzzle, part 1
     * @param input
     * @return
     */
    public static int getSignalOfA(final String input) {
        final String[] lines = input.split("\n");
        final Map<String, String> map = new ConcurrentHashMap<String, String>();

        for (final String line : lines) {
            final String[] instructions = line.split(" -> ");
            map.put(instructions[1], instructions[0]);
        }

        int count;
        do {
            count = (int) map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).count();
            map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).forEach((entry) -> map.put(entry.getKey(), processSignal(entry.getValue(), map)));
        } while (count != map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).count());

        return Integer.parseInt(map.get("a"));
    }

    /**
     * Day 7 puzzle, part 2
     * @param input
     * @return
     */
    public static int getSignalOfAWithBOverride(final String input) {
        final String[] lines = input.split("\n");
        final Map<String, String> map = new ConcurrentHashMap<String, String>();

        for (final String line : lines) {
            final String[] instructions = line.split(" -> ");
            map.put(instructions[1], instructions[0]);
        }

        map.put("b", "3176"); // Or if you're feeling pedantic, getSignalOfA(day8.txt);

        int count;
        do {
            count = (int) map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).count();
            map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).forEach((entry) -> map.put(entry.getKey(), processSignal(entry.getValue(), map)));
        } while (count != map.entrySet().stream().filter((entry) -> !entry.getValue().matches("\\d*")).count());

        return Integer.parseInt(map.get("a"));
    }

    private static String processSignal(final String input, final Map<String, String> map) {
        final String[] instructions = input.split(" ");
        try {
            switch (instructions.length) {
                case 1:
                    final int value = instructions[0].matches("\\d*") ? Integer.parseInt(instructions[0]) : Integer.parseInt(map.get(instructions[0]));
                    return Integer.toString(value);
                case 2:
                    final int valueNot = instructions[1].matches("\\d*") ? Integer.parseInt(instructions[1]) : Integer.parseInt(map.get(instructions[1]));
                    return Integer.toString(65535 - valueNot);
                case 3:
                    final int value1 = instructions[0].matches("\\d*") ? Integer.parseInt(instructions[0]) : Integer.parseInt(map.get(instructions[0]));
                    final int value2 = instructions[2].matches("\\d*") ? Integer.parseInt(instructions[2]) : Integer.parseInt(map.get(instructions[2]));
                    switch (instructions[1]) {
                        case "AND":
                            return Integer.toString(value1 & value2);
                        case "OR":
                            return Integer.toString(value1 ^ value2);
                        case "LSHIFT":
                            return Integer.toString(value1 << value2);
                        case "RSHIFT":
                            return Integer.toString(value1 >> value2);
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            // Value not yet ready to be calculated
        }
        return input;
    }
}