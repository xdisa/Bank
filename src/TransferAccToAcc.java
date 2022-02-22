import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TransferAccToAcc extends Transfer {


    public TransferAccToAcc(int number_of_transfer, int amount, Currencies name, String date, Recipient recipient, Sender sender) {
        super(number_of_transfer, amount, name, date, recipient, sender);
    }
    public static TransferAccToAcc get(Scanner scanner){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat();

        TransferAccToAcc obj = new TransferAccToAcc(0,
            0,Currencies.RUB,"", new Recipient("","",
            "","","",""), new Sender("","",
            "","","",""));
        System.out.println("enter info Recipient ");
        obj.setRecipient(Recipient.get(scanner));
        System.out.println("enter info Sender ");
        obj.setSender(Sender.get(scanner));
        /////
        obj.setNumber_of_transfer(Transfer.counter);

        System.out.println("transaction number :"+ obj.getNumber_of_transfer());
        Transfer.counter++;
        /////




        System.out.println("enter currencies (1)-RUB (2)-USD (3)-EUR:");

        while (true) {
            int value = scanner.nextInt();
            if(value == 1){
                obj.setName(Currencies.RUB);
                break;
            } if (value ==2){
                obj.setName(Currencies.USD);
                break;
            } if (value==3){
                obj.setName(Currencies.EUR);
                break;
            }
            System.out.println("enter notCorrected value! pls try again...");

        }
        System.out.println("enter amount :");
        obj.setAmount(scanner.nextInt());


        switch (obj.getName()){
            case RUB -> {
                if(Integer.valueOf(obj.getSender().getCashValue()) >= obj.getAmount()) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue());
                    buff -= obj.getAmount();
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.valueOf(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+ obj.getAmount()));
                } else {
                    System.out.println("no money!");
                }
            }
            case EUR -> {
                if(Integer.valueOf(obj.getSender().getCashValue())/90 >= obj.getAmount()) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue())/90;
                    buff -= obj.getAmount();
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.parseInt(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+ obj.getAmount()));
                } else {
                    System.out.println("no money!");

                }
            }
            case USD -> {
                if(Integer.valueOf(obj.getSender().getCashValue())/80 >= obj.getAmount()) {
                    int buff = Integer.valueOf(obj.getSender().getCashValue())/80;
                    buff -= obj.getAmount();
                    obj.getSender().setCashValue(String.valueOf(buff));
                    int buff1 = Integer.parseInt(obj.getRecipient().getCashValue());
                    obj.getRecipient().setCashValue(String.valueOf(buff1+ obj.getAmount()));
                } else {
                    System.out.println("no money!");
                }
            }

        }



        obj.setDate(dateFormat.format(currentDate));
        System.out.println("date transaction :"+ obj.getDate());


        System.out.println("Номер перевода :"
            + " " + obj.getNumber_of_transfer() + " "
            + "Дата:" + " " + obj.getDate() + " "
            +"номер счета получателя:" + " " +
            obj.getRecipient().getAccNumber()
            + " " + "валюта:" + obj.getName() + " " + "сумма:"+
            obj.getAmount() + " " +
            " Получатель: " + " "
            +obj.getRecipient().getInfo(obj.getRecipient()) + " "
            + "Отправитель: "+ " "
            + obj.getSender().getInfo(obj.getSender()));
        return obj;
    }


    ///////////////////////////////////////////////////////////////////////


    @Override
    public int getNumber_of_transfer() {
        return super.getNumber_of_transfer();
    }

    @Override
    public void setNumber_of_transfer(int number_of_transfer) {
        super.setNumber_of_transfer(number_of_transfer);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public Currencies getName() {
        return super.getName();
    }

    @Override
    public void setName(Currencies name) {
        super.setName(name);
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public void setDate(String date) {
        super.setDate(date);
    }

    @Override
    public Recipient getRecipient() {
        return super.getRecipient();
    }

    @Override
    public void setRecipient(Recipient recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public Sender getSender() {
        return super.getSender();
    }

    @Override
    public void setSender(Sender sender) {
        super.setSender(sender);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
