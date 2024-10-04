package abstraction1;
import abstraction.name;

class name1 extends name {
    public static void main(String args[])
    {

        name1 in = new name1();
        in.high();

    }
    @Override
    protected void high() {
        System.out.println("bye");

    }
}

