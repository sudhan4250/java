package advancejava.pojo;

public class Employee {
    int id;
   String name;
    int salary;
   String grade;

    Employee(int id, String name, int salary, String grade) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }
    /*int name()
    {
        return salary;
    }*/
    public String toString()
    {
        return "id"+this.id+"name"+this.name+"salary"+this.salary+"grade"+this.grade;
    }




}
