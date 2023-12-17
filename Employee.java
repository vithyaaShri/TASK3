public class Employee implements Taxable {
    int empID;
    String name;
    int salary;
    public Employee(int empID,String name,int salary){
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public double calctax() {
        double tax=salary*incometax/100;
        return tax;
    }
    
    
}
