
import java.util.HashMap;
import java.util.Scanner;

public class Airbnb {
    static Scanner scan = new Scanner(System.in);
    static Airbnb shukriAirbnb = new Airbnb();
    static String option = "";
HashMap<Integer, Property> properties;
    public Airbnb (){
       this.properties = new HashMap<Integer, Property>();

    }

    public void createProperty(){
        System.out.println("You typed (C)");
        System.out.println("Input an iD number");
        int idNumber = Integer.parseInt(scan.nextLine());
        System.out.println("What is the name of the property? ");
        String name = scan.nextLine();
        System.out.println("What is the location of the property?");
        String location = scan.nextLine();
        System.out.println("What is the price of the location per night?");
        // if it doesn't work use: Double.parseDouble(scan.nextLine())
        double price = scan.nextDouble();
        Property property = new Property(name, location, price);
        shukriAirbnb.properties.put(idNumber, new Property(name,location,price));
    }
    public void readProperty(){
        for (Integer key : properties.keySet()) { // prints the keys
            System.out.println("Key: " + key + " Values: ");
            properties.get(key).print(); // prints values
        }
    }


    public void updateProperty(){
        System.out.println("Input id of properties: ");
        int idNumber = Integer.parseInt(scan.nextLine());
        properties.get(idNumber);
        System.out.println("What is the name of the property? ");
        String name = scan.nextLine();
        System.out.println("What is the location of the property?");
        String location = scan.nextLine();
        System.out.println("What is the price of the location per night?");
        // if it doesn't work use: Double.parseDouble(scan.nextLine())
        double price = scan.nextDouble();

        properties.put(idNumber, properties.get(idNumber));
        shukriAirbnb.properties.put(idNumber, new Property(name,location,price));



    }

    public void deleteProperty(){

            readProperty();
            System.out.println("Provide the ID of the property you'd like to delete:");
            int iDNumber=Integer.parseInt(scan.nextLine());
            properties.remove(iDNumber); // access hashmap to delete, no loop needed like arrayList
            System.out.println(properties);
        }




    }
//    public void propertyPrint(){
//        System.out.println("Here are your properties ");
//        for (Property property :this.properties) {
//            property.print();
//
//        }
//
//
//    }


