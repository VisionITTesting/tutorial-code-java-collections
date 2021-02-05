package comparator.example;

public class Employee1 implements Comparable<Employee1>{

    String name;
    int age;
    int salary;

    public Employee1(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age + " " + this.salary;
    }

    @Override
    public int compareTo(Employee1 o) {

        if (this.age<o.age){
            return -1;
        }else if (this.age==o.age){
            return 0;
        }else{
            return 1;
        }
    }
}
