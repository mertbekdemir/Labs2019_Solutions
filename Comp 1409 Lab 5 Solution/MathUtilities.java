
/**
 * Class MathUtilities to provide some common math functionality.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class MathUtilities
{
    public static final int EVEN = 2;

    public static int power(int base, int exponent){
        int result =1;
        int counter = 0;
        while(counter < exponent){
            result *= base;
            counter++;
        }

        return result;
    }

    /**
     * Method calculator
     *
     * @param number1 A parameter which is the first operand
     * @param operation A parameter to specify the operation
     * @param number2 A parameter which is the second operand
     */
    public static void calculator(double number1, char operation, double number2){
        double result = 0;
        switch (operation){
            case '+':
            result = number1+number2;
            System.out.println("the result of "+ number1 + operation +number2 +" = "+result);
            break;
            case '-':
            result = number1 - number2;
            System.out.println("the result of "+ number1 + operation+number2 +" = "+result);
            break;

            case '*':
            result = number1 * number2;
            System.out.println("the result of "+ number1 + operation+number2 +" = "+result);
            break;
            case'/': 
            if(number2 != 0){
                result = number1 / number2;
                System.out.println("the result of "+ number1 + operation+number2 +" = "+result);
            }
            else{
                throw new IllegalArgumentException(" the denominator cannot be 0"); 
            }
            break;
            case'%':
            if(number2 != 0){
                result = number1 % number2;
                System.out.println("the result of "+ number1 + operation+number2 +" = "+result);
            }
            else{
                throw new IllegalArgumentException(" the denominator cannot be 0"); 
            }
            break;
            default: 
            System.out.println("invalid operation");
            break;

        }
    }

    /**
     * Method sumOddNumbers
     *
     * @param number A parameter to set the upper limit
     * @return The the sum of all odd numbers from 0 to number
     */
    public static double sumOddNumbers(int number){
        double result = 0;
        if(number>0){
            int count = 0;
            while (count< number){
                if(count % EVEN != 0){
                    result += count;
                    System.out.println(count);
                    //count++;
                }
                count++;
            }
        }
        else{
            System.out.println(" the number cannot be negative");
        }
        return result;
    }

    /**
     * Method sumOddNumbers2
     *
     * @param number A parameter to set the upper limit
     * @return The the sum of all odd numbers from 0 to number
     */
    public static double sumOddNumbers2(int number){
        double result = 0;
        if(number>0){
            int count = 1;
            while (count<= number){
                System.out.println(count);
                result += count;
                count +=EVEN;
            }
        }
        else{
            System.out.println(" the number cannot be negative");
        }
        return result;
    }

    /**
     * Method displaySquareNumbers
     *
     * @param number A parameter to set the limit of the loop
     */
    public static void displaySquareNumbers(int number){
        int count = 0;
        if (number >= 0){
            while(count <= number){
                System.out.println(" the square of "+ count+" is: " + (count * count));
                count ++;
            }
        }
        else{
            while(count > number){
                System.out.println(" the square of "+ number +" is: " + (number * number));
                number ++;
            }
        }
    }

    /**
     * Method getFactorial
     *
     * @param number A parameter to calculate the factorial of
     */
    public static void getFactorial(int number){
        int count = 1;
        int result = 1;
        if (number >= 0){
            while(count <= number){
                result *= count;
                count++;
            }
            System.out.println(" the factorail of "+ number +" is: "+ result);
        }
        else{
            System.out.println(" the factorial of a negative number is undefined");
        }
    }
    
    public static int multiply(int number1, int number2){
        
        int count = 0;
        int sum = 0;
        while(count < number2){
          sum = sum + number1;
          count = count +1;
        }
        return sum;
    }

    public static void main(String[] args){
        sumOddNumbers(60);
        
    }
}
