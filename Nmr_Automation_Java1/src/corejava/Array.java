package corejava;

public class Array {

	public static void main(String[] args) {
        //Initialize array  
        int [] a = new int [] {23, 56, 84, 10};  
        //Initialize max with first element of array.  
        int max = a[0];  
        //Loop through the array  
        for (int i = 0; i < a.length; i++) {  
            //Compare elements of array with max  
           if(a[i] > max)  
               max = a[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  
