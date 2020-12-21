public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Katarzyna";
        names[1] = "Maciej";
        names[2] = "Michal";
        names[3] = "Mikolaj";
        names[4] = "Jan";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera");
        System.out.println(numberOfElements);
        System.out.println("elementow");

    }
}
