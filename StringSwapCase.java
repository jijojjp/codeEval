package com.github.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/*
 * 
 * Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same.
INPUT SAMPLE:
Your program should accept as its first argument a path to a filename. Input example is the following
Hello world!
JavaScript language 1.8
A letter

OUTPUT SAMPLE:
Print results in the following way.
hELLO WORLD!
jAVAsCRIPT LANGUAGE 1.8
a LETTER
 */

public class StringSwapCase
{
    public static void main(final String[] args)
    {
        try
        {
            final File file = new File(args[0]);
            final BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null)
            {
                for(int index = 0; index < line.length(); index++)
                {
                    if(Character.isLowerCase(line.charAt(index)))
                    {
                        System.out.print(Character.toUpperCase(line.charAt(index)));
                    }
                    else
                    {
                        System.out.print(Character.toLowerCase(line.charAt(index)));
                    }
                }
                System.out.println();
            }
        }
        catch(final Exception e)
        {
            e.printStackTrace();
        }
    }
}
