package com.ian.javaarray;



import java.util.Scanner;


//Sample of different operations of array


class OwnArray {
    
    public void traversing(int[] array) {
        
        System.out.println("Array Traversing");
        
        for(int i = 0; i < array.length; ++i) {
            System.out.println("Array content: " + array[i]);
        }
    }
    
    public void linearSearching(int[] array) {
        
        System.out.println("Linear Searching");
        
        int targetNumber = 8;
        
        for(int i = 0; i < array.length; ++i) {
            if(array[i] == targetNumber) {
                System.out.println("Found the target: " + array[i]);
                return;              
            } 
        }
        
        System.out.println("Element doesnt exist in the memory");
    }
    
    public void binarySearching(int[] array) {
        
        System.out.println("Binary Searching");
        
        int targetNumber = 10;
        int left = 0;
        int right = array.length;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(array[mid] == targetNumber) {
                System.out.println("Number found at index " + mid);
                return;
            } else if(array[mid] < targetNumber) {
                left = mid + 1;              
            } else {
                right = mid - 1;
            }
        }     
    }
    
    public void insertBeginning(int[] array) {
        
        System.out.println("Insert array in the beginning");
        
        int toInsert = 10;
        int[] newArray = new int[array.length + 1];
        
        for(int i = array.length - 1; i >= 0; --i) {
            newArray[i + 1] = array[i];
        }
        
        newArray[0] = toInsert;
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }
    
    public void insertEnd(int[] array) {
        
        System.out.println("Insert array in the end");
        
        int toInsert = 50;
        int[] newArray = new int[array.length + 1];
        
        for(int i = 0; i < array.length; ++i) {
            newArray[i] = array[i];
        }
        
        newArray[newArray.length - 1] = toInsert;
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }
    
    public void insertAnywhere(int[] array) {
        
        System.out.println("Insert Array Anywhere");
        
        int toInsert = 45;
        int sampleIndex = 2;
        int[] newArray = new int[array.length + 1];
        
        for(int i = 0; i < sampleIndex; ++i) {
            newArray[i] = array[i];
        }
            
        for(int i = sampleIndex + 1; i < newArray.length; ++i) {
            newArray[i] = array[i - 1];
        }
        
        newArray[sampleIndex] = toInsert;
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }
    
    public void deleteBeginning(int[] array) {
        
        System.out.println("Delete beginning of the Array");
        
        int[] newArray = new int[array.length - 1];
        
        for(int i = 1; i < array.length; ++i) {
            newArray[i - 1] = array[i];
        }
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }   
    
    public void deleteEnd(int[] array) {
        
        System.out.println("Delete the end of the Array");
        
        int[] newArray = new int[array.length - 1];
        
        for(int i = 0; i <= newArray.length - 1; ++i) {
            newArray[i] = array[i];
        }
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }
    
    public void deleteAnywhere(int[] array) {
        
        int sampleIndex = 6;
        int[] newArray = new int[array.length - 1];
        
        for(int i = 0; i < sampleIndex; ++i) {
            newArray[i] = array[i];
        }
        
        for(int i = sampleIndex; i < array.length - 1; ++i) {
            newArray[i] = array[i + 1];
        }
        
        for(int copy : newArray) {
            System.out.println("New Array: " + copy);
        }
    }
    
}   





public class JavaArray {

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in); 
        OwnArray myArray = new OwnArray();
            
        int[] array = {1,2,3,4,5,6,7,8};
        //myArray.INPUT_YOUR_SELECTED_METHOD(array);
          
    }
}
