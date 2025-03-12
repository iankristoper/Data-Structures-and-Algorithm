package dev.ian.array.problems;




import java.util.Scanner;




class Problems {
    
    public void findMaxMinNumber(int[] array) {
        
        System.out.println("Find the maximum and minimum number in array[n]");
        
        int max = array[0];
        int min = array[0];
        boolean isAllEqual = true;
        
        for(int i = 1; i < array.length; ++i) {
            if(max < array[i]) {
                max = array[i];
            } 
            
            if(min > array[i]) {
                min = array[i];
            }    
            
            if(array[i] != array[0]) {
                isAllEqual = false;
            }
        }
        
        if(isAllEqual) {
            System.out.println("All numbers in array are equal");
        } else {
            System.out.println("Max number: " + max);
            System.out.println("Min number: " + min);
        }
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
        
        int j = 0; //pointer comparator 
        
        for(int i = 0; i < array.length; ++i) {
            if(array[i] != 0) {
                array[j] = array[i];
                j++;
            }
        }   
        
        while(j < array.length) {
            array[j] = 0;
            j++;
        }
        
        for(int copy : array) {
            System.out.println("New array: " + copy);
        }
    }
    
    public void findMissing(int[] array) {
        
        System.out.println("Finding the missing number {1,3,4,5,9,12,15,20}");
        
        int j = 1;
        int diff = 0;
        int iter = 0;
        
        for(int i = 0; i < array.length - 1; ++i) {
            diff = array[j] - array[i];
            iter = array[i];
            
            while(diff > 1) {
                System.out.println("Missing: " + ++iter);
                --diff;
            }
            
            j++; //iterate j for maintaining the balance 
        }
        
    }
    
    public void findDuplicate(int[] array) {
        
        System.out.println("FInding the duplicates");
        
        for(int i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - 1; ++j) {
                if(array[i] == array[j + 1]) {
                    System.out.println("Duplicate number: " + array[i]);
                }
                
                if(i != 0) {
                    for(int k = i; k > 0; --k) {
                        if(array[k] == array[k - 1]) {
                            System.out.println("Duplicate number: " + array[k]);
                        }
                    }
                }
            }
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
        
        int[] array = {1,3,4,5,9,12,15,20};
        problem.findDuplicate(array);        
    }
    
}
