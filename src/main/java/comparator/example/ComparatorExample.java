package comparator.example;


import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

    public static void main(String[] args){
        Employee1 emp1 = new Employee1("Akash",35,1500);
        Employee1 emp2 = new Employee1("SunSHun",25,3500);
        Employee1 emp3 = new Employee1("Tim",29,3000);
        Employee1 emp4 = new Employee1("Keerthana",26,500);
        Employee1 emp5 = new Employee1("Naverick",38,4000);

        //Create a Array list
        ArrayList<Employee1> arrayList = new ArrayList<Employee1>();
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);

        //Sort the array, by default based on age as mentioned in the Employee Class using Comparable
        Collections.sort(arrayList);
        System.out.println("Sorting based on Age: " + arrayList.toString());

        //Sort based on Salary Comparator
        Collections.sort(arrayList,new EmployeeSalaryComparator());
        System.out.println("Sorting based on Salary as: " + arrayList.toString());

    }
}
