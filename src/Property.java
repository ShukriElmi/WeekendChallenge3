public class Property {
    private String name;
    private String location;
    private  double price;

    private int idNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Property (String name, String location, double price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public void print(){
        System.out.println("The name of the this property " + name + " and the location of this property is " + location + " and the price is " + price);
    }
}

