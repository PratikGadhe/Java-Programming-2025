class account {
    String name;
    Long acc_no;
    String acc_type;
    float balance;
    void get(String name1 , Long num , String type , float bal){
        name = name1 ;
        acc_no = num ;
        acc_type = type ;
        balance = bal ;
    }
    void display(){
        System.out.println("Account Holder : "+name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Type : "+acc_type);
        System.out.println("Account Balance : "+balance);
    }
}
public class Main{
    public static void main(String[] args) {
        account obj = new account();
        obj.get("Pratik Gadhe",354l,"Saving",23500);
        obj.display();
    }
}
