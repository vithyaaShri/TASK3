public class Product implements Taxable{
    int pid;
    int quantity;
    int price;
    public Product(int pid,int price,int quantity){
        this.pid=pid;
        this.quantity=quantity;
        this.price=price;
    }
    @Override
    public double calctax() {
        double tax= price*quantity*(salestax/100);
        return tax;
    }

}
