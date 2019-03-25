public class ArrayMistakes {
    public static void main(String args[]) {
        int[ ] nums = {6,9,14,19};

        System.out.print("\nForward");
        for (int i = 0; nums.length > i; i++) {
            System.out.print(": " + nums[i]);
        }

        System.out.print("\nBackward");
        for (int j = 3; j>= 0; --j) {
           System.out.print(": " + nums[j]);
       }
    }
}