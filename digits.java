//Brendan Ng 2/25/2025, will separate digits

public class digits{
    public static void main(String[] args){
        int number;
        int one;
        int tens;
        int hundreds;

        number = 258;
        one = number % 10; //returns 8
        tens = (number / 10) % 10; //returns 5
        hundreds = ((number / 10) / 10) % 2; //Returns 2

        int number2;
        int one2;
        int ten2;
        int hun2;
        int th2;

        number2 = 2580;

        one2 = number2 % 2580;
        ten2 = number2 % 2572;
        hun2 = number2 % 2575;
        System.out.println(one2);
        System.out.println(ten2);
        System.out.println(hun2);
         
    }
}