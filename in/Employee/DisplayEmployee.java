package in.Employee;

class DisplayEmployee {
    public static void main(String[] args) {

        Employee EmployeeDetail = new Employee("Harsh",20,2000000);
        System.out.println(EmployeeDetail.EmployeeDetail());
        EmployeeDetail.setName("Shivam");
        System.out.println(EmployeeDetail.EmployeeDetail());
    }
}
