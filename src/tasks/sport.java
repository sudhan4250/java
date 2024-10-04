package tasks;

abstract class sport {

        private String name;
        public sport(String name) {
            this.name = name;
        }
        public abstract void eat();
        public abstract void exercise();
        public void displayInfo() {
            System.out.println("Name: " + name);
        }
    }

    class Athlete extends sport {
        public Athlete(String name) {
            super(name);
        }
        @Override
        public void eat() {
            System.out.println("Athlete eats a balanced and nutritious diet.");
        }
        @Override
        public void exercise() {
            System.out.println("Athlete engages in rigorous training and exercises regularly.");
        }
    }
    class Person extends sport {

        public Person(String name) {
            super(name);
        }
        @Override
        public void eat() {
            System.out.println("Lazy person eats snacks and fast food often.");
        }
        @Override
        public void exercise() {
            System.out.println("Lazy person prefers a sedentary lifestyle and avoids exercise.");
        }
    }

        class name1 {
        public static void main(String[] args) {
            Athlete athlete = new Athlete("John Doe");
            athlete.displayInfo();
            athlete.eat();
            athlete.exercise();

            System.out.println();

            Person lazyPerson = new Person("Jane Smith");
            lazyPerson.displayInfo();
            lazyPerson.eat();
            lazyPerson.exercise();
        }
    }


