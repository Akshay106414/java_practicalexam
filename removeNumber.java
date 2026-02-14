public class removeNumbers {
    public static void main(String[] args) {
        String str = "for1tune2clous3";
        String result = str.replaceAll("\\d", "");
        
        System.out.println("Original String is: " + str);
        System.out.println("String without numbers: " + result);
    }
}