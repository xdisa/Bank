import java.util.Scanner;

public class Sender {
    private String lastName;
    private String firstName;
    private String fatherName;
    private int cardNumber;
    private int accNumber;
    private int cashValue;

    public Sender(String lastName, String firstName, String fatherName, int cardNumber, int accNumber, int cashValue) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.cashValue = cashValue;
    }

   public static Sender get(Scanner scanner){
        Sender obj = new Sender(" "," "," ",0,0,0);
       System.out.println("enter lastName :");
        obj.lastName = scanner.nextLine();
       System.out.println("enter firstName :");
       obj.firstName = scanner.nextLine();
       System.out.println("enter fatherName :");
       obj.fatherName = scanner.nextLine();
       System.out.println("enter card num :");
       obj.cardNumber = scanner.nextInt();
       System.out.println("enter acc num :");
       obj.accNumber = scanner.nextInt();
       System.out.println("enter cash value:");
       obj.cashValue = scanner.nextInt();
       return obj;

   }

   public String upCase(Sender sender){
        return sender.lastName.toUpperCase() + sender.firstName.toUpperCase() + sender.fatherName.toUpperCase();
   }

   public String downCase(Sender sender){
        return sender.lastName.toLowerCase() + sender.firstName.toLowerCase() + sender.fatherName.toLowerCase();
   }

    public void add_cash(int value){
cashValue +=value;
    }

}
