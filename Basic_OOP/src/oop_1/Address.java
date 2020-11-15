package oop_1;

public class Address {
    int index;
    String county;
    String city;
    String street;
    byte house;
    double apartment;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public byte getHouse() {
        return house;
    }

    public void setHouse(byte house) {
        this.house = house;
    }

    public double getApartment() {
        return apartment;
    }

    public void setApartment(double apartment) {
        this.apartment = apartment;
    }


    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(4074);
        address.setCounty("Ukraine");
        address.setCity("Kiev");
        address.setStreet("Mostickaya");
        address.setHouse((byte) 14);
        address.setApartment(249);

        System.out.println(address.getIndex() + "," + address.getCounty() + "," + address.getCity());
        System.out.println(address.getStreet() + "," + address.getHouse() + "," + address.getApartment());
    }


}