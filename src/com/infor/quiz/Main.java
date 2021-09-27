package com.infor.quiz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        String inputString = myScanner.nextLine(); // Take whole line
        convertToDecimal(inputString);
        System.out.println(inputString);
    }

    public int convertToDecimal(String binary)
    {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i< binary.length(); i++)
        {
            if (binary.charAt(binary.length() - i) == '1')
            {
                result += conversion;
            }
            else {
                conversion *= 2;
            }
        }
        return result;
    }
}
