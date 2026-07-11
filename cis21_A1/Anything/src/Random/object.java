package Random;
class object {
    String name = "Noman";
    int age = 25;

    void show()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
class output
{
    static void main() {
        object ob = new object();
        ob.show();
    }
}