package tasks;
    abstract class
    Employee {
        String name;
        int employeeId;
        public Employee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }
        public abstract double calculateSalary();
        public abstract void displayInfo();
    }

    class Manager extends Employee {
        private double baseSalary;
        private double bonus;
        public Manager(String name, int employeeId, double baseSalary, double bonus) {
            super(name, employeeId);
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }
        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }
        @Override
        public void displayInfo() {
            System.out.println("Manager Information:");
            System.out.println("Name: " + super.name);
            System.out.println("Employee ID: " + super.employeeId);
            System.out.println("Salary: $" + calculateSalary());
        }
    }

    class Programmer extends Employee {
        private double hourlyRate;
        private int hoursWorked;
        public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
            super(name, employeeId);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }
        @Override
        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
        @Override
        public void displayInfo() {
            System.out.println("Programmer Information:");
            System.out.println("Name: " + super.name);
            System.out.println("Employee ID: " + super.employeeId);
            System.out.println("Salary: $" + calculateSalary());
        }
    }

     class name{
        public static void main(String[] args) {

            Manager manager = new Manager("sudhan", 1001, 100000, 10000);
            manager.displayInfo();

            Programmer programmer = new Programmer("cpns", 1002, 25.0, 160);
            programmer.displayInfo();
        }
    }


