import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // This goes to test file and calls variable and makes new test thang. we can then recall it
        Test variable = new Test();
        variable.printShirtSize('s');

        variable.count(10);
        
        // This is an enhanced for loop
        int[] simpleArray = {1,2,3,4,5};

        for(int number : simpleArray){
            System.out.println("The current number is " + number);
// This does the do first then if the while statement is true, it will repeat the do
            int iterator=15;
        do{
            System.out.println("I'm running at full speed");
            iterator++;

        } while(iterator<20);

        Random rnum= new Random();
        int breakPoint = rnum.nextInt(100);
        System.out.println(breakPoint);


        }
    }
    
}
