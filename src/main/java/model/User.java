package model;

public class User {
     int id;
     String Name ;
     String email;
     String phone;
     String password;

    public User(int id, String name, String email, String phone, String password) {
        this.id = id;
        this.Name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) &&
                this.password.equals(password);
    }

    public void logout() {
        System.out.println(Name + " logged out.");
    }
}
