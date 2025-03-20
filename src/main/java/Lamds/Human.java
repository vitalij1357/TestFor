package Lamds;

public class Human {
    private String name;
    private int salary;
    public Human(String name,int salary){
        this.salary=salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return"{ "+ name +" "+ salary+" }";
    }
}
