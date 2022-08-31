public class FizzBuzz {

    public static void main(String[] args) {

        int numberToDivied = 5;

        System.out.println(fizzBuzz(numberToDivied));

    }

    public static String fizzBuzz(int number){

        String numToCheck;


        if(number%3 == 0 && number%5 == 0){
            numToCheck = "FizzBuzz";
        }
        else if(number%3 == 0) {
            numToCheck = "Fizz";
        }
        else if(number%5 == 0){
             numToCheck = "Buzz";
        }
        else{
            return String.valueOf(number);
        }

        return numToCheck;


    }

}
