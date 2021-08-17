package com.yash.io.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5
{
	public static void main(String[] args) throws IOException
    {
        File file = new File("D:\\company\\essay.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
         
        String line;
         
        // Initializing counters
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
              while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            else
            {
                characterCount += line.length();
            
                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");
                 
                sentenceCount += sentenceList.length;
            }
        }
         System.out.println("Assignment No.05"); 
         System.out.println("Total number of alphabets :  = " + characterCount);
        System.out.println("Total number of sentences :  = " + sentenceCount);
        System.out.println("Number of paragraphs :  = " + paragraphCount);
          }

}
