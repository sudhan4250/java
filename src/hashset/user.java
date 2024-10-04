package hashset;
import java.util.HashSet;

public class user {
        private String name;
        private int age;

        public user(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Override hashCode and equals for proper HashSet behavior
        @Override
        public int hashCode() {
            return name.hashCode() + age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            user person = (user) obj;
            return age == person.age && name.equals(person.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    class Main {
        public static void main(String[] args) {
            HashSet<user> personHashSet = new HashSet<>();

            // Adding Persons to the HashSet
            personHashSet.add(new user("Alice", 30));
            personHashSet.add(new user("Bob", 25));
            personHashSet.add(new user("Alice", 30)); // Adding duplicate (will be ignored)

            // Printing out the HashSet
            for (user person : personHashSet) {
                System.out.println(person);
            }
        }
}

