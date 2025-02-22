package com.ian.javaarray;



import java.util.Scanner;





class OwnArray {
    
    public void traversing(int[] array) {
        
        System.out.println("Array Traversing");
        
        for(int i = 0; i < array.length; ++i) {
            System.out.println("Array content: " + array[i]);
        }
    }
    
    public void linearSearching(int[] array) {
        
        System.out.println("Linear Searching");
        
        int targetNumber = 10;
        
        for(int i = 0; i < array.length; ++i) {
            if(i == targetNumber) {
                System.out.println("Found the target: " + array[i]);
                return;              
            } else {
                System.out.println("Target doesnt exist");
            }
        }
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
        
    }
    
    public void deleteBeginning() {
        
    }   
    
    public void deleteEnd() {
        
    }
    
    public void deleteAnywhere() {
        
    }
    
}





public class JavaArray {

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);      
            
        /*
        
        //example of array traversing - O(1) 
        int[] constantArray = {1,2,3,4,5};  //constant O(1)

        System.out.println(constantArray[0]);
        System.out.println(constantArray[1]);
        System.out.println(constantArray[2]);
        System.out.println(constantArray[3]);
        System.out.println(constantArray[4]);
        

        //example of array traversing - O(n)
        int numberOfArray = 10;
        int[] dynamicArray = new int[numberOfArray];  //linear time O(n)

        for(int i=0; i<=numberOfArray; ++i) {  //linear time (On)
            int sum = i + 1; 
            System.out.println(sum);
        }   
      



        
        //example of linear search (unsorted array)
        int[] books = {10, 45, 67, 2, 34}; //constant O(1)
        int target = 340;
        
        for(int i=0; i<books.length; ++i) {  //linear time O(n)
            if(books[i] == target) {
                System.out.println("Books found at index " + i);
                return;
            }
        }
        
        System.out.println("Book not found"); 
        
        
        //example of binary search (sorted array)
        int[] shirtsNumber = {12, 23, 1, 3, 34, 45, 78, 89};
        int locate = 34;
        
        int left = 0;
        int right = shirtsNumber.length;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(shirtsNumber[mid] == locate) {
                System.out.println("Shirts number found at index " + mid);
                return;
            } else if(shirtsNumber[mid] < locate) {
                left = mid + 1;              
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Shirts not found");   

        
        
        
        //insertion operations (insert at the end - amortized) --> Time complexity O(n)
        int[] insertArray = {1, 3, 5, 7};  //O(1)
        int newElement = 50;
        
        //alocate new array for flexibility 
        int[] newArray = new int[insertArray.length + 1];  
        
        //copy the elements to the new array 
        for(int i = 0; i < insertArray.length; i++) {  //O(n)
            newArray[i] = insertArray[i];
        }
        
        //insert the element to the end 
        newArray[newArray.length - 1] = newElement;  //O(1)
        
        //print the new array 
        for(int copy : newArray) {
            System.out.println("New array: " + copy);
        }
       
        
        
        //insertion operations (insert at the beginning) --> Time complexity O(n)
        int[] currentArray = {23, 2, 3, 40};
        int toBeInserted = 12;
        
        int[] forNewArray = new int[currentArray.length + 1];
        
        //shift element to the right 
        for(int i = currentArray.length - 1; i >= 0; --i) {  //O(n)
            forNewArray[i + 1] = currentArray[i];
        }
        
        //since the shifted has done so the 0 index is now null
        //insert the value now
        forNewArray[0] = toBeInserted;  //O(1)
        
        for(int copy : forNewArray) {
            System.out.println("New array: " + copy);
        }
        
        
        
        //insertion operation (insert at the specific index) --> Time complexity O(n)
        int[] anotherArray = {1, 2, 3, 10};
        int forInsert = 23;
        int index = 2;
        
        //create new space for new arrays 
        int[] anotherNewArray = new int[anotherArray.length + 1];
        
        //copy elements before the index 
        for(int i = 0; i < index; i++) {
            anotherNewArray[i] = anotherArray[i];
        }
        
        //insert the new element to the given index 
        anotherNewArray[index] = forInsert;
        
        //shift the remmaining index
        for(int i = index; i < anotherArray.length; i++) {
            anotherNewArray[i + 1] = anotherArray[i];
        }
        
        for(int copy : anotherNewArray) {
            System.out.println("New Array: " + copy);
        }

        
        
        //removing the element on the last index 
        int[] currentArray = {1, 2, 3, 4};
        int[] newArray = new int[currentArray.length - 1];
        
        for(int i = 0; i < currentArray.length - 1; ++i) {
            newArray[i] = currentArray[i];
        }
        
        for(int copy : newArray) {
            System.out.println(copy);
        }

        */
        
        
        //removing the element on the first index 
        int[] oldArray = {1,2,3};
        int[] newArray = new int[oldArray.length - 1];
        
        for(int i = 1; i < oldArray.length; ++i) { //shift all array starting from index 1 backwards
            newArray[i - 1] = oldArray[i];
        }
        
        for(int copy : newArray) {
            System.out.println(copy);
        }
    }
}
