package method;

public class settergetter
{
        private int roll;
        private String name;
        public int getRoll()    //accessor method.method.method//getter
        {
            return roll;
        }
        public void setRoll(int roll) //mutator method.method.method
        {
            this.roll = roll;
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)//setter
        {
            this.name = name;
        }
        public void display()
        {
            System.out.println("Roll no.: "+roll);
            System.out.println("Student name: "+name);
        }
        public static void main(String args[])
        {
            settergetter in=new settergetter();
            in.getRoll();
            in.setRoll(10);
            in.setName("java");
            in.display();
        }
    }

