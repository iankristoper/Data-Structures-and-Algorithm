package dev.ian.array.problems;




import java.util.Scanner;




class Problems {
    
    public void findMaxMinNumber(int[] array) {
        
        System.out.println("Find the maximum and minimum number in array[n]");
        
        int max = array[0];
        int min = array[1];
        
        for(int i = 1; i < array.length; ++i) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println("Max number: " + max);

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
            
            if(array[i] >= secondMax) {
                if(array[i] != max) {
                   secondMax = array[i]; 
                } else if (array[i] == max) {
                   secondMax = -1; //indicate as null
                }
            }
        }
        
        System.out.println("Maximum number in array: " + max);
        System.out.println("Second max number in array: " + secondMax);
    }
    
    public void checkAscendingOrder(int[] array) {
        
        System.out.println("Ascending Order");
        
        boolean isAscending = false;
        
        for(int i = 0; i < array.length - 1; ++i) {
            if(array[i] > array[i + 1]) {
                System.out.println("Not in ascending order");
                System.out.println(array[i]);
                break;
            } 
        }        
    }
    
    public void moveZero(int[] array) {
        
        System.out.println("Moving zero to the end of the array");
        
        int temp = 0;
        
        for(int i = 0; i < array.length; ++i) {
            if(array[i] == 0) {
                for(int j = i; j < array.length - 1; ++j) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        for(int copy : array) {
            System.out.println("New Array: " + copy);
        }
    }
}




public class ArrayProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Problems problem = new Problems();
        
        int[] array = {3, 2, 5, 7, 1};
        problem.findMaxMinNumber(array);
        
        
    }
    
}
