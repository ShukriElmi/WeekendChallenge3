import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Airbnb shukriAirbnb = new Airbnb();
    static String option = "";
    public static void main(String[] args) {
        shukriAirbnb.greeting();
        option = scan.nextLine();

        if (option.equalsIgnoreCase("C")){
            shukriAirbnb.createProperty();
            shukriAirbnb.saveData();
        } else if (option.equalsIgnoreCase("R")) {
            shukriAirbnb.readProperty();
            shukriAirbnb.loadData();
        } else if (option.equalsIgnoreCase("U")) {
            shukriAirbnb.updateProperty();
        } else if (option.equalsIgnoreCase("D")){
            shukriAirbnb.deleteProperty();
        } else if (option.equalsIgnoreCase("Q")) {
            System.out.println("Would you like to see the properties?");
        }

    }
}
