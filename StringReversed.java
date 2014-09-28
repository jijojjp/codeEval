import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * CHALLENGE DESCRIPTION:
 * You are given two strings. Determine if the second string is a rotation of the first string.
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file contains two comma separated strings. E.g.
 * Hello,lloHe
 * Basefont,tBasefon
 * OUTPUT SAMPLE:
 * Print out True/False if the second string is a rotation of the first. E.g.
 * True
 * True
 */

public class StringReversed {

    public static void main(final String[] args) {
        try {
            final File file = new File(args[0]);
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                final String[] lineArray = line.split(",");
                if(lineArray.length > 0) {
                    if(isReverse(lineArray[0], lineArray[1])) {
                        System.out.println("True");
                    }
                    else {
                        System.out.println("False");
                    }

                }
            }
        }
        catch(final Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isReverse(final String s1, final String s2) {
        final String temp = s2 + s2;
        return temp.contains(s1);
    }
}
