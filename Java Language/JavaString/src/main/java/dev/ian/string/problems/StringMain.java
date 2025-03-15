package dev.ian.string.problems;



import java.util.Scanner;






public class StringMain {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        char[] string = {'H','E','L','L','O'};
        reverseString(string);
        
        System.out.println("New character: " + new String(string)); //convert the char array to string for printing
        
    }
    
    //method to reverse the char string 
    public static void reverseString(char[] string) {
        
        System.out.println("Reversing the String output");
        
        int n = string.length;
        int iterator = 1;
        
        char temp;
        
        for(int i = 0; i < n/2; ++i) {
            temp = string[i];
            string[i] = string[n - iterator];
            string[n - iterator] = temp;
            iterator++;
        }
    }
    
}
