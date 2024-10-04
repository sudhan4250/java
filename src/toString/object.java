package toString;

public class object {

        int rollno;
        String name;
        String city;

    object(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }

        public static void main(String args[]){
            object s1=new object(101,"sudhan","namakkal");
            object s2=new object(102,"cpns","namakkal");

            System.out.println(s1);//compiler writes here s1.toString()
            System.out.println(s2);//compiler writes here s2.toString()
        }
    }

