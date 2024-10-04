package advancejava.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee1 extends Employee{


    Employee1(int id, String name, int salary, String grade) {
        super(id, name, salary, grade);
    }

    public static void main(String[] args) {
        Employee1 obj=new Employee1(120,"sudhan",50000,"D");
        Employee1 obj1=new Employee1(121,"sudhan1",60000,"C");
        Employee1 obj2=new Employee1(122,"sudhan2",70000,"B");
        Employee1 obj3=new Employee1(123,"sudhan3",80000,"A");
        List<Employee1>on=new ArrayList<>();
        on.add((Employee1) obj);
        on.add((Employee1) obj1);
        on.add((Employee1) obj2);
        on.add((Employee1) obj3);
        //on.stream().forEach(System.out::println);
      Optional<Employee1>i=on.stream().filter(a->a.grade.equals("A")).reduce((b,c)->(b.salary < c.salary)? b : c);
      System.out.println(i.get());

    }

}
