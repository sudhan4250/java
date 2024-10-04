package interface1;

interface multipleinterface
{
    void add();
    }
    interface sub
    {
        void multi();
    }
    class name2 implements multipleinterface,sub
    {
        public void add()
        {
            System.out.println("interface");
        }
        public void multi()
        {
            System.out.println("multi interface");
        }
        public static void main(String args[])
        {
            name2 in=new name2();
            in.add();
            in.multi();
        }
    }
