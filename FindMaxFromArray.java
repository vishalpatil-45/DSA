import java.util.Scanner;

public class FindMaxFromArray{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = scn.nextInt();
        }
        int max = findMax(arr);
        System.out.println("The maximum element in the array is: " + max);

    }
    
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
