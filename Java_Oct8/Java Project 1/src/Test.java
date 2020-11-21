public class Test {

    public void count(int number){

        for (int i = 0; i < number; i++) {
            System.out.printf("The number was %s", i);
        }

    }

    public void printShirtSize(char funTimes) {
        String msg= "";
        switch (funTimes) {
            case 's':
                msg = "Shirt is Small";
                break;
            case 'm':
                msg = "Shirt is Medium";
                break;
            case 'l':
                msg = "Shirt is Large";
                break;
            case 'x':
                msg = "Shirt is Extar Large";
                break;

            default:
            msg = "Sorry, we couldn't find that size.";
                break;
        }
        System.out.println(msg);
    }
}
