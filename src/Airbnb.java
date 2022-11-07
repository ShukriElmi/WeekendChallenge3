import java.util.ArrayList;
import java.util.Scanner;

public class Airbnb {
    static Scanner scan = new Scanner(System.in);
    static Airbnb shukriAirbnb = new Airbnb();
    static String option = "";
    ArrayList<Property> properties;
    public void create(){
        System.out.println("You typed (C)");
        System.out.println("What is the name of the property? ");
        String name = scan.nextLine();
        System.out.println("What is the location of the property?");
        String location = scan.nextLine();
        System.out.println("What is the price of the location per night?");
        // if it doesn't work use: Double.parseDouble(scan.nextLine())
        double price = scan.nextDouble();
        Property property = new Property(name, location, price);
        shukriAirbnb.properties.add(property);
        shukriAirbnb.propertyPrint();

    }

    public void read (){

    }
    public void propertyPrint(){
        System.out.println("Here are your properties ");
        for (Property property :this.properties) {
            property.print();

        }


    }
}

