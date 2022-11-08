import java.io.*;
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
    public void greeting(){
        String optionsMessage = "Welcome to Shukri's Airbnb! \n" + "Type C to create a new airbnb \n" + "Type R to read all airbnb options \n" + "Type U to update an airbnb \n" + "Type D to delete an airbnb \n" + "Type Q to quit \n";
        System.out.println(optionsMessage);
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

        public void saveData(){
            try{
                FileOutputStream fileOut = new FileOutputStream("employees.ser");
                // ^ opening a connect to a new file and allowing to connect
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                // ^ streaming data from an object into a file
                out.writeObject(properties);
                // take this object and i'm lobbing it
                out.close();
                // close it once we are done with the file
                fileOut.close();
                // close it once we are done with the file
                System.out.println("Serialized data is saved!");


            }catch (IOException i) {
                i.printStackTrace();
                // history of all the methods that were called - allows us to see where the code went wrong.
                //principle of a stack is similar to pringles - last in, first out
            }

        }

        public void loadData(){
            try {
                // read object from a file
                FileInputStream file = new FileInputStream("employees.ser");
                // create a connect to a file
                ObjectInputStream in = new ObjectInputStream(file);

                // method for deserialization for an object
                properties = (HashMap<Integer, Property>) in.readObject();
                // ^ read object and convert data to type Employee

                in.close();
                file.close();

                System.out.println("Object has been deserialized");
                System.out.println(properties.size());

            } catch (IOException i){
                i.printStackTrace();

            }catch (ClassNotFoundException c){
                c.printStackTrace();
            }

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


