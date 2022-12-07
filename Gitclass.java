import java.time.LocalDate;
import java.time.Period;
public class Gitclass{
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int ans = 2 * 2;
        System.out.println("The result of 2 times 2 is: "+ans);
        someOneAge();
    }
    //calculate the age of a person
    public static void someOneAge(){
        LocalDate date = LocalDate.now();
        System.out.println("age: "+date);
    }
}