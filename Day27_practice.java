// library
/*
class library{
    private String [] Book;
    private int noOfBooks;
    library(){
        this.Book=new String[100];
        this.noOfBooks=0;
    }
    public void addBook(String Book){
        this.Book[noOfBooks]=Book;
        noOfBooks++;
    }
    public void showBooks(){
        for(int i=0;i<noOfBooks;i++){
            if (this.Book[i]!=null){ 
                
                System.out.println(Book[i]);
            }
        }
        System.out.println("there are "+noOfBooks+" no of books");
    }
    public void issueBook(String Book){
        for(int x=0;x<noOfBooks;x++){
            if (this.Book[x]!=null && this.Book[x].equals(Book)) {
                System.out.println(this.Book[x]+" is issued to you "); 
                this.Book[x]=null;     
                return;          
            }
        }
        System.out.println("Not available");
    }
    public void returnBook(String Book){
        addBook(Book);
        System.out.println(" Your book is Succesfully Returned");
        
    }
}

public class Day27_practice {
    public static void main(String[] args) {
        library l1 = new library();
        l1.addBook("mehul");
        l1.addBook("lucky");
        l1.addBook("Pritam");
        l1.addBook("mridul");
        l1.issueBook("mehul");
        l1.showBooks();
        
    }
}
*/

// Problems

class Circle{
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder extends Circle{
    public int height;
    public void setheight(int x){
        this.height=x;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    public int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int width;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double areaOfRectangle(){
        return length*width;
    }
    
}
class Cuboid extends Rectangle{

}
public class Day27_practice {

    public static void main(String[] args) {
        
    }
}
