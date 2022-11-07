public class Property {
    String name;
    String location;
    double price;

    public Property (String name, String location, double price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public void print(){
        System.out.println("The name of the this property " + name + " and the location of this property is " + location + " and the price is " + price);
    }
}

