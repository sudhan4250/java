package advancejava;

class AgenotEligibleException extends Exception {


    AgenotEligibleException(String msg) {
        super(msg);
    }
    static int age = 14;
        public static void main(String[] args) throws AgenotEligibleException {
                if (age < 18) {
                    throw new AgenotEligibleException("not Eligible for vote");
                }


            }
        }



