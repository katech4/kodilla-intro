public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User katarzyna = new User("Katarzyna", 20);
        User maciej = new User("Maciej", 10);
        User michal = new User("Michal", 58);

        User[] users = {katarzyna, maciej, michal};


        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }

        double av = result / users.length;

        System.out.println("Srednia wieku uzytkownikow: " + av);

        for (int i=0; i< users.length; i++){
             int age = users[i].age;

             if (age < av){
                 System.out.println("Imiona uzytkownika ponizej sredniej: " + users[i].name);
             }
        }
    }
}

