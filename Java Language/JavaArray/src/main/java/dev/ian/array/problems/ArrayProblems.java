package dev.ian.array.problems;




import java.util.Scanner;




class Problems {
    
    public void findMaxMinNumber(int[] array) {
        
        System.out.println("Find the maximum and minimum number in array[n]");
        
        int max = array[0];
        int min = array[0];
        
        for(int i = 1; i < array.length; ++i) {
            if(array[i] > max) {
                max = array[i];
            }
            
            if(array[i] < min) {
                min = array[i];
            }
        }   
        
        System.out.println("Maximum number of given Array: " + max);
        System.out.println("Minimum number of given Array: " + min);      
        
    }
    
    public void reverseArray(int[] array) {
        
        System.out.println("Reversing an array");
        
        int temp = 0;
        int arrayLength = array.length - 1;
        
        for(int i = 0; i <= array.length/2; ++i) {
            temp = array[i];
            array[i] = array[arrayLength];
            array[arrayLength] = temp; 
            arrayLength--;
        }
        
        for(int copy : array) {
            System.out.println("New Array: " + copy);
        }
    }
    
    public void secondLargest(int[] array) {
        
        System.out.println("Second largest number in Array");
        
        int max = array[0];
        int secondMax = array[0];
        
        for(int i = 1; i < array.length; ++i) {
            if(array[i] > max) {
                max = array[i];
            }
            
            if(array[i] > secondMax) {
                if(array[i] != max) {
                   secondMax = array[i]; 
                }
            }
        }
        
        System.out.println("Maximum number in array: " + max);
        System.out.println("Second max number in array: " + secondMax);
    }
}




public class ArrayProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Problems problem = new Problems();
        
        int[] array = {5, 5, 5, 5, 5};
        problem.secondLargest(array);
        
    }
    
}
