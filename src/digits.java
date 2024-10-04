public class digits {
        private int number;
        public int Number(int number)
        {
            this.number = number;
            return number;
        }
        public void separate()
        {
            int temp = number;
            int digit;
            int position = 1;
            while (temp > 0)
            {
                digit = temp % 10;
                temp /= 10;
                System.out.println("Digit at position " + position + ": " + digit);
                position++;
            }
        }
        public static void main(String[] args)
        {
            // Example usage
            digits on = new digits();
            on.Number(123456);
            on.separate();
        }
}


