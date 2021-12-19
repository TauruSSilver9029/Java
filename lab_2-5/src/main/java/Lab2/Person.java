package Lab2;

import com.fasterxml.jackson.annotation.JsonProperty;
//Використовувати бібліотеку Jackson
//Cтворимо Maven project і додамо в pom.xml наступні залежності:
public class Person {
    @JsonProperty("First Name") //Це говорить нам, що даний атрибут в JSON буде іменуватися як First Name
    private String first_name;

    @JsonProperty("Last Name")
    private String last_name;

    @JsonProperty("Birth")
    private String birth;

    @JsonProperty("Phone Number")
    private String phone;

    @JsonProperty("Address")
    private String address;

    public Person() {
        super();
    }

    public Person(String first_name, String last_name, String phone, String address, String birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.birth = birth;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        if ((this.first_name == null) ? (other.first_name != null) : !this.first_name.equals(other.first_name)) {
            return false;
        }

        return true;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "First name," + first_name +
                ", Last Name: " + last_name +
                ", Phone: " + phone +
                ", Birth: " + birth +
                ", Address: " + address +
                "]";
    }
}
