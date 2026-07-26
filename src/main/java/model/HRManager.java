package model;

public class HRManager {
    int id;
    String Name ;
    String email;
    String phone;
    String password;
    private String department;
    private int totalEmployeesManaged;

    public HRManager(int id, String name, String email, String phone, String password, String department, int totalEmployeesManaged) {
        this.id = id;
        Name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.department = department;
        this.totalEmployeesManaged = totalEmployeesManaged;
    }

    public String getDepartment() {
        return department;
    }

    public int getTotalEmployeesManaged() {
        return totalEmployeesManaged;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTotalEmployeesManaged(int totalEmployeesManaged) {
        this.totalEmployeesManaged = totalEmployeesManaged;
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", totalEmployeesManaged=" + totalEmployeesManaged +
                '}';
    }

    public void recruitEmployee() {

    }

    public void scheduleInterview() {

    }

    public void evaluateCandidate() {

    }

    public void approveContract() {

    }

    public void manageEmployee() {

    }
}
