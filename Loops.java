public class Loops {
    public static void main(String[] args) {

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        int numberOfElements = names.length;

        for (int i = 0; i <= numberOfElements; i++) {
            System.out.println(i);


        }
        int result = sumNumbers(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}