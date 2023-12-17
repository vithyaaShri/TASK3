public class Test {
    public static void main(String[] args) {
        Employee e=new Employee(123,"john",300000);
        double employeetax=e.calctax();
        System.out.println(employeetax);
        Product p=new Product(345, 1000, 5);
        double producttax=p.calctax();
        String formatted = String.format("%.2f", producttax);
        System.out.println(formatted);
    }
}
