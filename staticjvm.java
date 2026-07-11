package Random;

class A {

    String name;

    void show() {

        System.out.println("What is this");
    }

    static {
        String name = "Noman";
        System.out.println(name);
    }
}

class staticjvm {
    public static void main(String[] args) {
        System.out.println("jvm");

        A a = new A();
        a.show();
    }
}


