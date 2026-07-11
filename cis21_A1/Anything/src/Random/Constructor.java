package Random;

class User {
    int a;
    int b;

    String name;
    int age;

    User(int a, int b) {
        this.a = a;
        this.b = b;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void show() {
        System.out.println(a + b);
    }

    void detail() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        User user = new User(100, 200);
        user.show();
        User me = new User("Noman", 25);
        me.detail();
    }
}
