import java.time.LocalDate;

public class Wrapper {
    public static void main(String[] args) {
        Integer integer=Integer.valueOf(50);
        Integer integer2=50;
        System.out.println("Reference are equal? : "+(integer==integer2)); //This is the example of autoboxing

        int a=integer;
        System.out.println("Unboxing : "+a); //This is an example of unboxing

        LocalDate today=LocalDate.now();
        System.out.println("Todays date : "+today);

        System.out.println("Year : "+today.getYear());

        System.out.println("Month : "+today.getMonth());

        System.out.println("Day : "+today.getDayOfWeek());
    }

}
