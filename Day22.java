// constructurs 

class SmartPhone {
    private String brand;
    private String model;
    private int price;
    public SmartPhone(String myBrand,String myModel,int myPrice){
        brand=myBrand;
        model=myModel;
        price=myPrice;
    }  
   
    public void getDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}


public class Day22 {
    public static void main(String[] args) {
        SmartPhone myPhone1 = new SmartPhone("Redmi", "Note 13 pro", 16000);
        SmartPhone myPhone2 = new SmartPhone("Apple", "iphone 16", 85000);
        myPhone1.getDetails();
        myPhone2.getDetails(); 
        
    }
}
