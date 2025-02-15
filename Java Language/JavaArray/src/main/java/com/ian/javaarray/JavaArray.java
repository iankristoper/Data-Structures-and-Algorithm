package com.ian.javaarray;



import java.util.Scanner;



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
        */
        
        
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
            anotherNewArray[i + 1] = anotherNewArray[i];
        }
        
        for(int copy : anotherNewArray) {
            System.out.println("New Array: " + copy);
        }
    }
}
