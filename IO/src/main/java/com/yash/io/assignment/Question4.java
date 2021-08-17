package com.yash.io.assignment;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Question4
{
	public static void main(String data[])
    {
 
        try {
 
            String nameNumberString;
            String address;
            long number;
            int index;
            String friendname;
 
            // Using file pointer creating the file.
            File file = new File("D:\\company\\friendInfo.txt");
            Scanner sc=new Scanner (System.in);
            System.out.println("Assignment Question : 4");   
            System.out.println("Enter Friend name : ");
            String str= sc.nextLine();    
           
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;
 
           
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");
 
                // separating name and number.
                address = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Print the contact data
                System.out.println(
                    "Address: " + address + "\n"
                    + "Contact Number: " + number + "\n");
            }
        }
 
            catch (IOException ioe)
            {
 
                System.out.println(ioe);
            }
            catch (NumberFormatException nef)
            {
 
                System.out.println(nef);
            }
    }

}
