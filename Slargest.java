import java.util.*;

public class Slargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.print("Enter 5 elements for the array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int l=arr[0],sl=0;
        for(int i=0; i<arr.length; i++){
            if(l < arr[i]){
                sl = l;
                l = arr[i];
            }
        }
        System.out.println("Second largest Number is : "+sl);
    }
}