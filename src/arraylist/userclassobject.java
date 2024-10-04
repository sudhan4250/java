package arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class userclassobject {
    int rollno;
    String name;
    int age;


    userclassobject(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

    class name {
        public static void main(String args[]) {
            userclassobject in = new userclassobject(36, "sudhan", 21);
            userclassobject on = new userclassobject(44, "chandran", 44);
            userclassobject io = new userclassobject(44, "barvathi", 45);
            userclassobject op = new userclassobject(36, "nandhini", 24);
            ArrayList<userclassobject> o = new ArrayList<userclassobject>();
            o.add(in);
            o.add(on);
            o.add(io);
            o.add(op);
            Iterator i = o.iterator();
            while (i.hasNext()) {
                userclassobject st = (userclassobject) i.next();
                System.out.println(st.rollno + " " + st.name + " " + st.age);
            }
            for (userclassobject p : o) {
                System.out.println(p.rollno + " " +p.name + " " +p.age);
                Iterator mo =o.iterator();

            }
        }
    }

