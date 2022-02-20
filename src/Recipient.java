import java.util.Scanner;

public class Recipient {
    private String lastName;
    private String firstName;
    private String fatherName;
    private int cardNumber;
    private int accNumber;
    private int cashValue;

    public Recipient(String lastName, String firstName, String fatherName, int cardNumber, int accNumber, int cashValue) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.cashValue = cashValue;
    }

    public static Recipient get(Scanner scanner){
       Recipient obj = new Recipient("","","",0,0,0);
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

    public String upCase(Recipient recipient){
        return recipient.lastName.toUpperCase() + recipient.firstName.toUpperCase() + recipient.fatherName.toUpperCase();
    }

    public String downCase(Recipient recipient){
        return recipient.lastName.toLowerCase() + recipient.firstName.toLowerCase() + recipient.fatherName.toLowerCase();
    }
}
