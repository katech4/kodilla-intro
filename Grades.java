public class Grades {
    int[] grades;
    int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void Last() {
        for (int i = 0; i < 10; i++) {
            this.grades[i] = i + 1;
            System.out.println(this.grades[i]);
        }
    }
}