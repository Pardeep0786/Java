import java.util.Scanner;
import java.lang.Math;

public class Main {
    //Functions
    //Made a simple function to print a message
    public static void Function(){
        System.out.println("Hello Guys");
    }

    //Made a function for calculating the sum of two numbers
    public static void Sum(int e, int f){
        System.out.println(e + f);
    }
    public static void main(String[] args) {
        //Print the simple print statement
        System.out.println("Hello Universe");

        //Take the input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Age :");
        int age = sc.nextInt();
        System.out.println("The Age is : " + age);

        //Close the scanner 
        sc.close();
        
        //Variables in java/Primitive data types
        String stu = "Pardeep";
        int Age = 20;
        double fees = 17500.2;
        System.out.println("The name of the Student is : " + stu);
        System.out.println("The Age of the Student is : " + Age);
        System.out.println("The fees of the student is : " + fees);

        //There are some operations related with string
        String stu1 = "Ansh";
        String stu2 = " Yuvraj";
        String Friends = stu1 + stu2; //String Concatenation
        System.out.println(Friends);

        String Msg = "Hello";
        System.out.println(Msg.charAt(0)); //charAt ->To check the value of the string at particular index

        String Language = "java";
        System.out.println(Language.length()); //length() ->To check the length of the given string

        String stu3 = "Raj";
        System.out.println(stu3.replace('j', 'm')); //replace() ->To replace the character of the given string 

        String Friends2 = "ShivaliAndPalak";
        System.out.println(Friends2.substring(0,7)); //substring() ->To derive the small part of string from the main string 

        //Creating a Array with new keyword
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        System.out.println(arr[0]);

        //Creating a Array with second method
        int[] arr2 = {100, 200, 300, 400};
        System.out.println(arr2[1]);

        //Operators 
        //Arithmetic
        int x = 10;
        int y = 20;
        System.out.println(x + y);      //Addition Operator(+)
        System.out.println(x - y);      //Subtraction Operator(-)
        System.out.println(x * y);      //Multiplication Operator(*)
        System.out.println(x / y);      //Divison Operator(/)
        System.out.println(x % y);      //Modulation Operator(%)
        System.out.println(x++);        //Unary Operator(++, --)

        //Assignment Operator 
        int q = 33;                     //In this example the '=' is a assignment operator
        System.out.println(q);

        //Comparison Operator
        int r = 10;
        int s = 15;
        System.out.println(r > s);      //Greater Than Comparison Operator 
        System.out.println(r < s);      //Less Than Comparison Operator
        System.out.println(r == s);     //Equal too Comparison Operator

        //Math class
        int m = 11;
        int n = 22;
        int RandomNo = (int) (Math.random()*10);  //Generate the random number from 0 to 10
        System.out.println(Math.max(m, n));       //Check the minimum number from m and n
        System.out.println(Math.min(m, n));       //Check the maximum number from m and n
        System.out.println(RandomNo);             //Print the random number
        
        //Conditional Statement 'if-else'
        int marks = 50;
        if(marks > 33){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //Conditional Statement 'Switch'
        int p = 2;
        switch (p){
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }

        //Loops
        //for loop
        for(int i = 0; i<50; i++){
            System.out.println(i);
        }

        //While loop
        int j = 0;
        while(j < 10){
            System.out.println("Hello Universe");
            j++;
        }

        //do-While
        int k = 0;
        do{
            System.out.println("Hi Friends");
            k++;
        }while(k < 5);

        //Continue & break Statements
        //Continue

        for(int a = 0; a < 10; a++){
            if(a%2 == 0){
                continue;
            }
            System.out.println(a);
        }

        //break
        for(int l = 0; l < 20; l++){
            if(l == 10){
                break;
            }
            System.out.println(l);
        }

        //Exception Handling
        int[] Scores = {95, 22, 55};
        try {
            System.out.println(Scores[3]);
        }
        catch (Exception exception){
            System.out.println("Please Enter the Appropriate index, Because the given index is out of the range");
        }

        //Call the function into main function 
        Function();

        //Call the Sum function into the main function 
        Sum(5, 10);
    }
}