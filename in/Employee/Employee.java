package in.Employee;

class Employee {

    String Name ;
    int Age;
    double salary;

    String EmployeeDetail(){   //
        return ("Detail Of employee are :--\nName: "+Name +
                " \nAge: "+ Age+
                " \nSalary: "+salary);

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.Name = name;
        this.Age = age;
        this.salary = salary;
    }
}
