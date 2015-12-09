package AdventOfCode.Day6;

/**
 * Created by gmpp on 07/12/2015.
 */
public class ProbablyAFireHazard {
    /**
     * Day 6 puzzle, part 1
     *
     * @param input
     * @return the number of lit lights
     */
    public static int getNumberOfLitLights(final String input) {
        final String[] lines = input.split("\n");
        final boolean[][] lights = new boolean[1000][1000];

        for (final String line : lines) {
            final String[] instructions = line.split(" ");

            if (instructions[0].equals("toggle")) {
                final int firstX = Integer.parseInt(instructions[1].split(",")[0]);
                final int firstY = Integer.parseInt(instructions[1].split(",")[1]);

                final int lastX = Integer.parseInt(instructions[3].split(",")[0]);
                final int lastY = Integer.parseInt(instructions[3].split(",")[1]);

                for (int x = firstX; x <= lastX; x++) {
                    for (int y = firstY; y <= lastY; y++) {
                        lights[x][y] = !lights[x][y];
                    }
                }
            } else {
                final int firstX = Integer.parseInt(instructions[2].split(",")[0]);
                final int firstY = Integer.parseInt(instructions[2].split(",")[1]);

                final int lastX = Integer.parseInt(instructions[4].split(",")[0]);
                final int lastY = Integer.parseInt(instructions[4].split(",")[1]);

                if (instructions[1].equals("on")) {
                    for (int x = firstX; x <= lastX; x++) {
                        for (int y = firstY; y <= lastY; y++) {
                            lights[x][y] = true;
                        }
                    }
                } else {
                    for (int x = firstX; x <= lastX; x++) {
                        for (int y = firstY; y <= lastY; y++) {
                            lights[x][y] = false;
                        }
                    }
                }
            }


        }

        int litLights = 0;
        for (final boolean[] row : lights) {
            for (final boolean light : row) {
                if (light) {
                    litLights += 1;
                }
            }
        }

        return litLights;
    }

    /**
     * Day 6 puzzle, part 2
     *
     * @param input
     * @return the combined brightness of all lights
     */
    public static int getCombinedBrightness(final String input) {
        final String[] lines = input.split("\n");
        final int[][] lights = new int[1000][1000];

        for (final String line : lines) {
            final String[] instructions = line.split(" ");

            if (instructions[0].equals("toggle")) {
                final int firstX = Integer.parseInt(instructions[1].split(",")[0]);
                final int firstY = Integer.parseInt(instructions[1].split(",")[1]);

                final int lastX = Integer.parseInt(instructions[3].split(",")[0]);
                final int lastY = Integer.parseInt(instructions[3].split(",")[1]);

                for (int x = firstX; x <= lastX; x++) {
                    for (int y = firstY; y <= lastY; y++) {
                        lights[x][y] += 2;
                    }
                }
            } else {
                final int firstX = Integer.parseInt(instructions[2].split(",")[0]);
                final int firstY = Integer.parseInt(instructions[2].split(",")[1]);

                final int lastX = Integer.parseInt(instructions[4].split(",")[0]);
                final int lastY = Integer.parseInt(instructions[4].split(",")[1]);

                if (instructions[1].equals("on")) {
                    for (int x = firstX; x <= lastX; x++) {
                        for (int y = firstY; y <= lastY; y++) {
                            lights[x][y] += 1;
                        }
                    }
                } else {
                    for (int x = firstX; x <= lastX; x++) {
                        for (int y = firstY; y <= lastY; y++) {
                            lights[x][y] = Math.max(lights[x][y] - 1, 0);
                        }
                    }
                }
            }
        }

        int totalBrightness = 0;
        for (final int[] row : lights) {
            for (final int light : row) {
                totalBrightness += light;
            }
        }

        return totalBrightness;
    }
}
