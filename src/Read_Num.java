import java.util.Scanner;

public class Read_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number you would like to be read");
        number = scanner.nextInt();

        // số có 1 chữ số
        if (number >=0 && number < 10){
            switch (number){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        //Từ 10 đến 20
        else if (number >=10){
            switch (number){
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }
        //từ 20 trở đi
        else{
            int tens;
            int ones;
            String a;
            String b;
            tens = number /10;
            ones = number %10;
            switch (tens){
                case 2:
                    a = "twenty ";
                    break;
                case 3:
                    a = "thirty ";
                    break;
                case 4:
                    a = "fourty ";
                    break;
                case 5:
                    a = "fifty ";
                    break;
                case 6:
                    a = "sixty ";
                    break;
                case 7:
                    a = "seventy ";
                    break;
                case 8:
                    a = "eighty ";
                    break;
                case 9:
                    a = "ninety ";
                    break;
            }
            switch (ones){
                case 1:
                    b = "one";
                    break;
                case 2:
                    b = "two";
                    break;
                case 3:
                    b = "three";
                    break;
                case 4:
                    b = "four";
                    break;
                case 5:
                    b = "five";
                    break;
                case 6:
                    b = "six";
                    break;
                case 7:
                    b = "seven";
                    break;
                case 8:
                    b = "eight";
                    break;
                case 9:
                    b = "nine";
                    break;
            }
            System.out.println(a + b);
        }
    }
}
