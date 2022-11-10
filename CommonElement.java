package javathurlab;

public class CommonElement{
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6,7,8};// array 1 is defined 
        int[] array2 = {8,1,3,11,16,4,7,0};//array 2 is defined
        System.out.println("Common elements between two arrays: ");
        for(int i=0;i<array1.length;i++)//takes the values in array 1
        {
            for(int j=0;j<array2.length;j++)// takes the values in array 2
            {
                if(array1[i]==array2[j])// compares both the array
                {
                    System.out.print(array1[i] + " ");// printing the common value in array
                }
            }
        }    
    }    
}