// Varargs >> 
//Maan lo tumhe ek aisa function banana hai jo integers ka sum kare.
//Agar user 2 numbers bheje, toh tum overloading se sum(int a, int b) bana doge.
//Agar user 3 numbers bheje, toh tum sum(int a, int b, int c) bana doge.
//Lekin agar user kahe ki main kabhi 5 numbers bhejunga, kabhi 50, aur kabhi ek bhi nahi? Tum fuzool me 50 overloaded functions thodi na likhte baithoge!
//Yahan kaam aata hai Varargs. Java tumhe ek facility deti hai jahan tum parameters me ... (three dots) laga dete ho

/*
public class Day17 {
    static int sum(int ...x){
        int total = 0;
        for (int element : x) {
            total=total+element;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Here we use Varargs fuction ");
        int i=sum(2,5);
        System.out.println(i);
    }
}
*/


// Varargs >> jab hume ye chahiye ho ki user atleast ek number jarur de to hum ye wala use krta hai;;;

public class Day17 {
    static int sum(int a,int ...x){ // humne yaha pr int a diya hai kyu ki hum chahte hai ki ek element to user jarur de
        int total = a;
        for (int element : x) {
            total=total+element;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Here we use varargs fuction || you need to enter atleast 1 input");
        int i=sum(5,5);
        System.out.println(i);

    }
}