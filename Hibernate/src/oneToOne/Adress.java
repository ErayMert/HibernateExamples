package oneToOne;

import javax.persistence.*;

/**
 * Created by eraym on 14.08.2018.
 */
@Entity(name = "Adress")
public class Adress {

    @Id
    @SequenceGenerator(name = "Adress_Sequence_Generator", sequenceName = "Adress_Sequence", initialValue = 10)
    @GeneratedValue(generator = "Adress_Sequence_Generator")
    @Column(name = "Adress_Id")
    private int adressId;

    @Column(name = "Street", length = 40)
    private String street;

    @Column(name = "City")
    private String city;

    @Column(name = "Country")
    private String country;

    public Adress(){

    }

    public Adress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "Adress [ adressId = " + adressId + ", street=" + street + ", city="+ city + ", country= " + country + " ]";
    }
}
