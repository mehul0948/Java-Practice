// Quetion 1 >> Age validator
/*

 class Voter {
    private String name;
    private int age;

    public void setName(String name){
       this.name=name;
    }
    public void setAge(int age){
        if (age<18) {
            System.out.println("Hey buddy ! You are underage");
            return;
        }
        this.age=age;
        
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getName(){
        System.out.println(name);
    }
    
}
public class Day21_practice {
    public static void main(String[] args) {
        Voter a = new Voter();
        a.setName("Mehul");
        a.setAge(4);
        a.getName();
        a.getAge();
        
    }
}
*/

// Question no 2 >> The E-commerce product inventor
/*

class Product  {

    private String productName;
    private int stocks;

    public void setProductName(String productName){
        this.productName=productName;
    }
    public void getProductName(){
        System.out.println(productName);
    }
    public void setStocks(int stocks){
        if(stocks<=0){
            System.out.println("Hey buddy ! Stocks can't be Zero or Negative");
            return ;
        }
        this.stocks=stocks;
    }
    public void getstocks(){
        System.out.println(stocks);
    }
    public void purchase(int quantity){
        if(stocks<quantity){
            System.out.println("Out of stock!");
            return ;
        }
        stocks-=quantity;
        System.out.println("remaining stock = " +stocks);
    }

}
public class Day21_practice {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setProductName("Milk");
        p1.getProductName();
        p1.setStocks(10);
        p1.getstocks();
        p1.purchase(82);
    }   
}
*/