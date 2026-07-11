package GetSet;

public class GetSetter {
    private final String name;
    private final int age;
    private final double salary;
    private int year;

    GetSetter(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String GetName(){
        return name;
    }

    public int GetAge(){
        return age;
    }

    public double GetSalary(){
        return salary;
    }

    public int GetYear()
    {
        return year;
    }
    public void SetYear(int year)
    {
       this.year = year;
    }

}
