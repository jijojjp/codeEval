import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Given a sequence, write a program to detect cycles within it.
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename containing a sequence of numbers (space delimited). The file can have
 * multiple such lines. E.g
 * 2 0 6 3 1 6 3 1 6 3 1
 * 3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49
 * 1 2 3 1 2 3 1 2 3
 * OUTPUT SAMPLE:
 * Print to stdout the first cycle you find in each sequence. Ensure that there are no trailing empty spaces on each line you print. E.g.
 * 6 3 1
 * 49
 * 1 2 3
 * The cycle detection problem is explained more widely on wiki
 * Constrains:
 * The elements of the sequence are integers in range [0, 99]
 * The length of the sequence is in range [0, 50]
 */


public class DetectingCycles {
    public static void main(final String[] args) {
        try {
            final File file = new File(args[0]);
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                final String[] lineArray = line.split(" ");
                if(lineArray.length > 0) {
                    final Set<Integer> numberSet = new LinkedHashSet<Integer>();
                    final Set<Integer> result = new LinkedHashSet<Integer>();
                    boolean flag = Boolean.FALSE;
                    for(final String character : lineArray) {
                        final Integer integer = Integer.parseInt(character);
                        if(numberSet.contains(integer)) {
                            result.add(integer);
                            numberSet.add(integer);
                            flag = Boolean.TRUE;
                        }
                        else {
                            if(flag) {
                                break;
                            }
                            numberSet.add(integer);
                        }
                    }
                    String resultString = "";
                    for(final Integer res : result) {
                        resultString += res + " ";
                    }
                    System.out.println(resultString.trim());
                }
            }
        }
        catch(final Exception e) {
            e.printStackTrace();
        }
    }
}
