package AdventOfCode.Day4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by gmpp on 07/12/2015.
 */
public class TheIdealStockingStuffer {

    private static final Logger log = Logger.getLogger("TheIdealStockingStuffer");
    /**
     * Day 4 puzzle, part 1
     *
     * @param input
     * @return the lowest integer in order to have a hash with 5 zeroes in the beginning
     */
    public static int getLowestMd5HashForFiveZeroes(final String input) {
        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");

            for (int i = 1; i > 0; i++) { // i.e. until i overflows
                final byte[] digest = md.digest((input + i).getBytes());

                if (digest[0] == 0 && digest[1] == 0 && (digest[2] & 0xF0) == 0) {
                    return i;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            log.log(Level.SEVERE, e.getLocalizedMessage());
        }

        return 0;
    }

    /**
     * Day 4 puzzle, part 2
     *
     * @param input
     * @return the lowest integer in order to have a hash with 6 zeroes in the beginning
     */
    public static int getLowestMd5HashForSixZeroes(final String input) {
        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");

            for (int i = 1; i > 0; i++) { // i.e. until i overflows
                final byte[] digest = md.digest((input + i).getBytes());

                if (digest[0] == 0 && digest[1] == 0 && digest[2] == 0) {
                    return i;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            log.log(Level.SEVERE, e.getLocalizedMessage());
        }

        return 0;
    }
}
