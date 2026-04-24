package airport.staff;

public abstract class Staff {

    protected String staffId;
    protected String name;
    protected String role;
    protected double salary;

    public Staff() {}

    public Staff(String staffId, String name, String role, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID='" + staffId + '\'' +
                ", Name='" + name + '\'' +
                ", Role='" + role + '\'' +
                ", Salary=" + salary +
                '}';
    }
}