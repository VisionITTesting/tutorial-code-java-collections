# Code Example for How to Use Comparator and Comparable
---

* Created by Akash Tyagi on 5thFeb2021
* Detail: How to use Comparable  and Comparator interface to sort the arrays with simple or custom objects.

### Comparable Example:

* Employee Class with compareTo method implemented
```java
package comparable.example;

public class Employee implements Comparable<Employee>{

    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(Employee o) {

        if (this.age<o.age){
            return -1;
        }else if (this.age==o.age){
            return 0;
        }else {
            return 1;
        }
    }
}


```

* Comparator Class

```java
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


```

### Comparator Example for Sorting:

* Employee Class:

```java
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

```

* Employee Age Comparator 

```java
package comparator.example;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if (o1.age>o2.age){
            return 1;
        }else if (o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}

```

* Employee Salary Comparator

```java
package comparator.example;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        if (o1.salary>o2.salary){
            return 1;
        }else if (o1.salary<o2.salary){
            return -1;
        }else{
            return 0;
        }
    }
}

```

* Comparator Example, sort by Age and Salary

```java
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

```