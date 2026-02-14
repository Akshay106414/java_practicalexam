public class RemoveDuplicatesSimple {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

        int[] newNumber = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == newNumber[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                newNumber[size] = arr[i];
                size++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < size; i++) {
            System.out.print(newNumber[i] + " ");
        }
    }
}