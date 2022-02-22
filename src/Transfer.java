import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Transfer {
    private int number_of_transfer;
    private int amount;
    private Currencies name;
    private String date;
    private Recipient recipient;
    private Sender sender;

    public static int counter;

    public Transfer(int number_of_transfer, int amount, Currencies name, String date, Recipient recipient, Sender sender) {
        this.number_of_transfer = number_of_transfer;
        this.amount = amount;
        this.name = name;
        this.date = date;
        this.recipient = recipient;
        this.sender = sender;
    }

    public static Transfer get(Scanner scanner){
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = null;

    dateFormat = new SimpleDateFormat();

        Transfer obj = new Transfer(0,0,Currencies.RUB,"", new Recipient("","","","","",""), new Sender("","","","","",""));
        System.out.println("enter info Recipient ");
        obj.recipient = Recipient.get(scanner);
        System.out.println("enter info Sender ");
        obj.sender = Sender.get(scanner);
        /////
        obj.number_of_transfer = Transfer.counter;

        System.out.println("transaction number :"+ obj.number_of_transfer);
        Transfer.counter++;
        /////




    System.out.println("enter currencies (1)-RUB (2)-USD (3)-EUR:");

    while (true) {
        int value = scanner.nextInt();
        if(value == 1){
            obj.name = Currencies.RUB;
            break;
        } if (value ==2){
            obj.name = Currencies.USD;
            break;
        } if (value==3){
            obj.name = Currencies.EUR;
            break;
        }
        System.out.println("enter notCorrected value! pls try again...");

    }
    System.out.println("enter amount :");
        obj.amount = scanner.nextInt();


        switch (obj.name){
            case RUB -> {
                if(Integer.valueOf(obj.getSender().getCashValue()) >= obj.amount) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue());
                    buff -= obj.amount;
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.valueOf(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+obj.amount));
                } else {
                    System.out.println("no money!");
                }
            }
            case EUR -> {
                if(Integer.valueOf(obj.getSender().getCashValue())/90 >= obj.amount) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue())/90;
                    buff -= obj.amount;
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.parseInt(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+obj.amount));
                } else {
                    System.out.println("no money!");

                }
            }
            case USD -> {
                if(Integer.valueOf(obj.getSender().getCashValue())/80 >= obj.amount) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue())/80;
                    buff -= obj.amount;
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.parseInt(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+obj.amount));
                } else {
                    System.out.println("no money!");
                }
            }

        }



    obj.date = dateFormat.format( currentDate );
    System.out.println("date transaction :"+ obj.date);


        System.out.println("Номер перевода :"
            + " " +obj.number_of_transfer + " "
            + "Дата:" + " " + obj.date + " "
            +"номер счета получателя:" + " " +
            obj.getRecipient().getAccNumber()
            + " " + "валюта:" + obj.name + " " + "сумма:"+
            obj.amount + " " +
            " Получатель: " + " "
            +obj.getRecipient().getInfo(obj.recipient) + " "
            + "Отправитель: "+ " "
            + obj.getSender().getInfo(obj.sender));
    return obj;

}






////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getNumber_of_transfer() {
        return number_of_transfer;
    }

    public void setNumber_of_transfer(int number_of_transfer) {
        this.number_of_transfer = number_of_transfer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currencies getName() {
        return name;
    }

    public void setName(Currencies name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return number_of_transfer == transfer.number_of_transfer && amount == transfer.amount && counter == transfer.counter && name == transfer.name && date.equals(transfer.date) && recipient.equals(transfer.recipient) && sender.equals(transfer.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number_of_transfer, amount, name, date, recipient, sender, counter);
    }

    @Override
    public String toString() {
        return
            "number_of_transfer=" + number_of_transfer + ", date='" + date + '\'' +
            ", amount=" + amount +
            ", name=" + name +

            ", recipient=" + recipient +
            ", sender=" + sender +
            ", counter=" + counter ;
    }
}
