package advance;


 class MyClass {
        private int id;
        private String name;

        public MyClass(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MyClass other = (MyClass) obj;
            if (id != other.id)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "MyClass [id=" + id + ", name=" + name + "]";
        }

        public static void main(String[] args) {
            MyClass obj1 = new MyClass(1, "John");
            MyClass obj2 = new MyClass(1, "John");

            // Testing equals
            System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));

            // Testing hashCode
            System.out.println("obj1.hashCode(): " + obj1.hashCode());
            System.out.println("obj2.hashCode(): " + obj2.hashCode());

            // Testing toString
            System.out.println("obj1.toString(): " + obj1);
            System.out.println("obj2.toString(): " + obj2);
        }
    }

