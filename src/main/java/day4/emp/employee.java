package day4.emp;

public class employee {
    private int id=1;
    private String firstName= null;
    private String lastName= null;

    private int salary=1;

    public employee() {
    }

    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        if(salary>0)
        this.salary = salary;
        else
            System.out.println("di lam la phai co luong");
    }
    public String getName()
    {
        return firstName+" "+lastName;
    }
    public int getAnnualSalary()
    {
        return salary*12;
    }
    public int raiseSalary(int percent)
    {
        salary+=salary*percent/100;
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + firstName + '\'' +" "+ lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
