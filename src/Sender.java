import java.util.HashMap;
import java.util.Scanner;

public class Sender {
    private String lastName;
    private String firstName;
    private String fatherName;
    private String cardNumber;
    private String accNumber;
    private String cashValue;



    public Sender(String lastName, String firstName, String fatherName, String cardNumber, String accNumber, String cashValue) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.cashValue = cashValue;
    }

   public static Sender get(Scanner scanner){
        Sender obj = new Sender(" "," "," ","","","");
       System.out.println("enter lastName :");
       obj.lastName = scanner.nextLine();
       obj.lastName = scanner.nextLine();
       System.out.println("enter firstName :");
       obj.firstName = scanner.nextLine();
       System.out.println("enter fatherName :");
       obj.fatherName = scanner.nextLine();
       System.out.println("enter card num :");
       obj.cardNumber = scanner.nextLine();
       System.out.println("enter acc num :");
       obj.accNumber = scanner.nextLine();
       System.out.println("enter cash value:");
       obj.cashValue = scanner.nextLine();
       return obj;

   }
    public String getInfo(Sender sender){
        return sender.lastName + " " + sender.firstName + " " + sender.fatherName;
    }
   public String upCase(Sender sender){
        return sender.lastName.toUpperCase() + " " + sender.firstName.toUpperCase() + " " + sender.fatherName.toUpperCase();
   }

   public String downCase(Sender sender){
        return sender.lastName.toLowerCase() + " " + sender.firstName.toLowerCase()+ " " + sender.fatherName.toLowerCase();
   }

    public void add_cash(int value){
cashValue +=value;
    }
/////////////////////////////////////////
    @Override
    public String toString() {
        return "Sender{" +
            "lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", fatherName='" + fatherName + '\'' +
            ", cardNumber=" + cardNumber +
            ", accNumber=" + accNumber +
            ", cashValue=" + cashValue +
            '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getCashValue() {
        return cashValue;
    }

    public void setCashValue(String cashValue) {
        this.cashValue = cashValue;
    }
}
