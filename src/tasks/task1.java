package tasks;

interface task2 {
    void task();
    void task1();
    void task2();
}
    class Spacecraft implements task2 {
        @Override
        public void task() {
            System.out.println("Spacecraft is flying in outer space.");
        }
        public void task1() {
            System.out.println("Airplane is flying in the sky.");
        }
        public void task2() {
            System.out.println("Helicopter is flying in the air.");
        }
    }
    class Airplane implements task2 {
        @Override
        public void task() {
            System.out.println("Spacecraft is flying in outer space.");
        }
        public void task1() {
            System.out.println("Airplane is flying in the sky.");
        }
        public void task2() {
            System.out.println("Helicopter is flying in the air.");
        }
    }
    class Helicopter implements task2 {
        @Override
        public void task() {
            System.out.println("Spacecraft is flying in outer space.");
        }
        public void task1() {
            System.out.println("Airplane is flying in the sky.");
        }
        public void task2() {
            System.out.println("Helicopter is flying in the air.");
        }
    }

     class name2  {
        public static void main(String[] args) {
            Spacecraft spacecraft = new Spacecraft();
            Airplane airplane = new Airplane();
            Helicopter helicopter = new Helicopter();
            spacecraft.task();
            airplane.task1();
            helicopter.task2();
        }
    }


