package LeetCode;

import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String input = "It's Mohfez Rahman";


        byte[] someArray = input.getBytes();
        byte[] result = new byte[someArray.length];


        StringBuilder input2 = new StringBuilder();

        for (int i = 0; i < someArray.length; i++) {
            result[i] = someArray[someArray.length - i - 1];

            System.out.println(new String(result));
        }
        System.out.println("<-----------------1ST-------------------------->");
        for (int i = 0; i < someArray.length; i++)
            result[i] = someArray[someArray.length - i - 1];

        System.out.println(new String(result));

        System.out.println("<--------------------2ND----------------------->");

        input2.append(input);
        input2 = input2.reverse();
        System.out.println(input2);

        System.out.println("<--------------------3RD----------------------->");
        char[] input3 = input.toCharArray();
        for (int i = input3.length - 1; i >= 0; i--) {
            System.out.println(input3[i]);
        }
    }
}