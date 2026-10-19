// Collection framework
//                                               1. Array list

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Day40 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an arraylist ");
//         int x = sc.nextInt();
//         sc.nextLine();
//         ArrayList <String> fruits = new ArrayList<>();
//         for(int i=0;i<x;i++){
//             System.out.println("Enter the name of Fruit");
//             String m = sc.nextLine();
//             fruits.add(m);
//         }
//         System.out.println(fruits);

//     }

// }

//                                               2. Linkedlist 


// import java.util.*;

// public class Day40 {
//     public static void main(String[] args) {
//         System.out.println("This is the example of LinkedList : ");
//         LinkedList<String> name = new LinkedList<>();
//         name.add("Mehul");
//         name.add("Lucky");
//         name.add("Tinku");
//         name.addFirst("Oggy");         // Sabse aage jake judta hai
//         System.out.println(name);
//         name.add("Tinku");
//         System.out.println(name);

//         Iterator<String> it = name.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }

//         // HashSet<String> name1 = new HashSet<>(name);      // Ye LinkedList me se sab duplicate hata deta hai
//         // System.out.println(name1);

//     }
// }

//                                               3. HashSet

// import java.util.HashSet;

// public class Day40 {
    // public static void main(String[] args) {
    //      System.out.println("This is the Example of HashSet : ");

    //      HashSet<String> s = new HashSet<>();
    //      s.add("Samosa");
    //      s.add("Pakoda");
    //      s.add("Chai");
    //      s.add("Samosa");                                // koi bhi element "Do Baar add nhi hoga" ....
    //      System.out.println(s);
    //      System.out.println(s.size());                   // Set ka "Size" batayega....
    //      System.out.println(s.contains("Pakoda"));       // Ye batata hai ki set me ye
    //      element "hai ya nhi".....
    //      s.remove("Chai");                               // Ye uss element ko "Remove" kr dega SET ke ander se.....
    //      System.out.println(s);
    // }

// }


//                                               4. HashMap 

// import java.util.HashMap;
// 
// public class Day40 {

//     public static void main(String[] args){

//         System.out.println("This is the Example of HashMap : ");
//         HashMap < String , Integer> marks = new HashMap<>();
//         marks.put("Mehul", 95);
//         marks.put("Lucky", 86);
//         marks.put("Tinku", 93);
//         marks.put("Sachin", 55);
//         System.out.println(marks);
//         System.out.println(marks.get("Mehul"));     // Ye Primary key se Value fetch krne ke liye... 
//         System.out.println(marks.containsKey("Tinku"));   // Ye Check krne ke liye ki ye Primary key isme hai ya nhii...
//         marks.remove("Tinku");                          // Ye Iss Primary key or uske data ko remove krte hai 
//         System.out.println(marks);

//     }
// }