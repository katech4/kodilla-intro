public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("Ten notebook jest lekki");
        } else if (this.weight > 600 && this.weight < 1000) {
            System.out.println("Ten notebook jest nie zbyt cieżki");
        } else {
            System.out.println("Ten noteook jest cieżki.");
        }
    }

    public void checkYear() {
        if (this.year <= 2010) {
            System.out.println("Ten notebook jest stary");
        } else if (this.year > 2010 && this.year < 2018) {
            System.out.println("Ten notebook jest też stary");
        } else {
            System.out.println("Ten notebook jest nowy");
        }
    }
}
