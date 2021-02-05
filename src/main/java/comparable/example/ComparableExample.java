package comparable.example;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public static void main(String[] args){
        Employee emp1 = new Employee("Akash",35);
        Employee emp2 = new Employee("SunShun",25);
        Employee emp3 = new Employee("Keerthana",26);
        Employee emp4 = new Employee("Timothy",29);
        Employee emp5 = new Employee("Maverick",38);

        //Create a Array list
        ArrayList<Employee> arrayList = new ArrayList();
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);

        //Sort the List
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
