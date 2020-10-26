package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Star Wars: A New Hope");
        System.out.println("Star Wars: Revenge of the Sith");
        System.out.println("Star Wars: Return of the Jedi");
        System.out.println("The Bee Movie");
        System.out.println("Shrek");
        int myFirstNumber = 1;
        int mySecondNumber = 2;
        System.out.println(myFirstNumber + mySecondNumber);
        if ((mySecondNumber + myFirstNumber) >= 10) {
            System.out.println("Greater than or equal to ten");
        } else {
            System.out.println("Less than ten");
        }
        int potato = 0;
        while (potato < 1000) {
            potato++;
            System.out.println("Potato equals " + potato);
        }
        for (int potatoTwo = 0; potatoTwo < 1000; potatoTwo++) {
            System.out.println("Potato 2 = " + potatoTwo);
        }
    }
}