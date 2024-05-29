package address;

import java.util.ArrayList;

public class Adress {

    private String city;
    private String street;
    private String name;
    private int postCode;
    private int unit;

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

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Adress() {

    }

    public void setName(String next) {
    }
    @Override
    public String toString() {
        return "address.Adress{" +
                " city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", name=" + name +
                ", postCode=" + postCode +
                ", unit=" + unit +
                '}';
    }

}
