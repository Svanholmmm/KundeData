public class Customer {
    String name;
    String phone;
    String email;

    public Customer(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;


    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " Tlf: " + phone + " Email: " + email + "\n";
    }
}
