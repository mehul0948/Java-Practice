//String methods


public class Day6 {
    public static void main(String[] args) {
        String name = "Mehul kumar ";
        // 1. lenght >> to check the length of the string ->
        System.out.println(name.length()); 
        // 2. to lowercase >> to change the formate of string to lower every character ->
        System.out.println(name.toLowerCase());
        // 3. to uppercase >> to chnage the formate of string to upper every single character ->
        System.out.println(name.toUpperCase());
        // 4. trim >> to tring all the white space in the string ->
        System.out.println(name.trim());
        // 5. Replace >> to repalce the character or words from another char or word ->
        System.out.println(name.replace("kumar", "Thakur"));
        // 6.  Substring >> it used for which index we start and when we want to stop
        System.out.println(name.substring(2,9) );
        // 7. startwith >> it is used to check the string is really start with given words if yes then gave (true) or if no thne gave (false) it work in boolean
        System.out.println(name.startsWith("M"));
        // 8. endwith >> it work same as startwith but it check ending part
        System.out.println(name.endsWith("n"));
        // 9. charat >> ye isliye usse krte hai example jese ki index 3 me konsa character hai 
        System.out.println(name.charAt(7));
        // 10. indexof >> ye charat ka ulta work krta hai jese ki usme index daal kr character dhundh rahe the isme character dalkr index niklega 
        System.out.println(name.indexOf("h"));
        // 11. equals >> ye check krta hai ki jo string hai vo equal hai ya nhiii in boolean 
        System.out.println(name.equals("Mehul"));
        







    }

}
