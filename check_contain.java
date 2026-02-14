import java.util.Scanner;

public class check_contains {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter 10 Numebrs  :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Specific number : ");
        int n = sc.nextInt();
        boolean contain = false;
        for(int i=0; i<arr.length; i++){
            if(n == arr[i]){
                contain = true;
            }
        }
        if(contain){
            System.out.println("array contains the value "+n);
        }else{
            System.out.println("array does not cotain the value "+n);
        }
    }
}