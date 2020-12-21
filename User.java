public class User {


    public User(String name, int age) {
    }

    public static void main(String[] args) {

        User katarzyna = new User("Katarzyna", 20);
        User maciej = new User("Maciej", 33);
        User michal = new User("Michal", 58);

        User[] users = {katarzyna, maciej, michal};


        int result = 0;
        for (int i = 0; i < users.length; i++) {
            /*result = result + users.length[i];*/
        }
    }
}

