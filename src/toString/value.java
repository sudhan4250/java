package toString;

public class value {
        int rollno;
        String name;
        String city;

    value(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }

        public String toString(){//overriding the toString() method
            return rollno+" "+name+" "+city;
        }
        public static void main(String args[]){
            value s1=new value(101,"sudhan","namakkal");
            value s2=new value(102,"cpns","namakkal");

            System.out.println(s1);//compiler writes here s1.toString()
            System.out.println(s2);//compiler writes here s2.toString()
        }
    }

