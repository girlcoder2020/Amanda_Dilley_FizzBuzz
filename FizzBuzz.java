public class FizzBuzz {
    public String fizzBuzz(int number) {
        boolean bool = (number == 15);

        if(number / 3) {
            System.out.println("Fizz");
        }
        else if(number / 3) {
            System.out.println("Buzz");
        }
        if (number / 3 && number / 5) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(number);
        }
        return fizzBuzz;
        /*
         * fizzbuzz logic here print 
         * Fizz if the number is divisible by 3 
         * Buzz if the
         * number is divisible by 5 
         * FizzBuzz if the number is divisible by 3 and 5
         * number itself for all other cases
         */
    }
}
