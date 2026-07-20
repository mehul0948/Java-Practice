// constructor overloading
class Product{
    private String productName;
    private double price;
    private int stock;
    public Product(){
        productName="Unknown";
        price=0.0;
        stock=0;
    }
    public Product(String x,double y){
        stock=10;
    }
    public Product(String x,double y,int z){
        productName=x;
        price=y;
        stock=z;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public void getDeatils(){
        System.out.println("Product name = "+productName);
        System.out.println("Price = "+price);
        System.out.println("Stock = "+stock);
    }
}
public class Day23 {

    public static void main(String[] args) {
       Product a1 = new Product();
       a1.getDeatils();
       Product a2 = new Product("Milk",36);
       a2.getDeatils();
       Product a3 = new Product("Mouse",150,8);
       a3.getDeatils();
        
    }
}