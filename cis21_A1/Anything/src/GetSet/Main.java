package GetSet;

public class Main {

    static void main() {
    GetSetter getset = new GetSetter("Noman", 25, 50.50);
        System.out.println(getset.GetName());
        System.out.println(getset.GetAge());
        System.out.println(getset.GetSalary());

        getset.SetYear(2000);
        System.out.println(getset.GetYear());
    }
}
