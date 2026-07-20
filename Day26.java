// Methods overridding
class Bank{
    public void showInterest(){
        System.out.println("Standard bank interest is 4%");
    }    
}
class SBI extends Bank{
    @Override // ye check krne ke liye krte hai ki sach me hamara method override horha hai ya nhi
    public void showInterest(){
        System.out.println("SBI special interest is 7%");
    }
}

public class Day26 {
    public static void main(String[] args) {
        Bank sbiBranch=new SBI();
        sbiBranch.showInterest();
    }
}
