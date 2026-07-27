package model;

public class Customer {
    int id;
    String name;
    String email;
    String phone;
    String password;
    private String customerType;
    private int totalBookings;

    public Customer(int id, String name, String email, String phone, String password, String customerType, int totalBookings) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.customerType = customerType;
        this.totalBookings = totalBookings;
    }

    public String getCustomerType() {
        return customerType;
    }

    public int getTotalBookings() {
        return totalBookings;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setTotalBookings(int totalBookings) {
        this.totalBookings = totalBookings;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", customerType='" + customerType + '\'' +
                ", totalBookings=" + totalBookings +
                '}';
    }

    public void searchProperty() {

    }

    public void bookProperty() {

    }

    public void reserveProperty() {

    }

    public void makePayment() {

    }

    public void viewInvoice() {

    }

    public void signContract() {

    }
}
