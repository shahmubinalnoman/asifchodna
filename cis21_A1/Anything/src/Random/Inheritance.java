package Random;

class Student {
    public int roll, marks;
    String name;

    void show() {
        System.out.println("Roll, Marks and Name are:");
    }

}

class Noman extends Student {
    public static void main(String[] args) {
        Noman std = new Noman();
        std.show();
        std.display();
    }

    void display() {
        roll = 12;
        marks = 33;
        name = "Noman";

        System.out.println(roll);
        System.out.println(marks);
        System.out.println(name);
    }
}

