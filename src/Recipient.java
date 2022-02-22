import java.util.Scanner;

public class Recipient {
    private String lastName;
    private String firstName;
    private String fatherName;
    private String cardNumber;
    private String accNumber;
    private String cashValue;

    public Recipient(String lastName, String firstName, String fatherName, String cardNumber, String accNumber, String cashValue) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.cashValue = cashValue;
    }

    public static Recipient get(Scanner scanner){
       Recipient obj = new Recipient("","","","","","");
        System.out.println("enter lastName :");
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

    public String getInfo(Recipient recipient){
        return recipient.lastName + " " + recipient.firstName + " " +recipient.fatherName;
    }
    public String upCase(Recipient recipient){
        return recipient.lastName.toUpperCase() + " " + recipient.firstName.toUpperCase() + " " +recipient.fatherName.toUpperCase();
    }

    public String downCase(Recipient recipient){
        return recipient.lastName.toLowerCase() + " " +recipient.firstName.toLowerCase() + " " +recipient.fatherName.toLowerCase();
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

    @Override
    public String toString() {
        return "Recipient{" +
            "lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", fatherName='" + fatherName + '\'' +
            ", cardNumber=" + cardNumber +
            ", accNumber=" + accNumber +
            ", cashValue=" + cashValue +
            '}';
    }
}
