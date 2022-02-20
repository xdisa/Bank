import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transfer {
    //номер перевода, сумма, валюта, получатель, отправитель, дата перевода
    private int number_of_transfer;
    private int amount;
    private Currencies name;
    private String date;
    private Recipient recipient;
    private Sender sender;


    public int counter=0;

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

        Transfer obj = new Transfer(0,0,Currencies.RUB,"", new Recipient("","","",0,0,0), new Sender("","","",0,0,0));
    
        obj.number_of_transfer = obj.counter+1;
        System.out.println("transaction number :"+ obj.counter);
    System.out.println("enter amount :");
    obj.amount = scanner.nextInt();



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
    obj.date = dateFormat.format( currentDate );
    System.out.println("date transaction :"+ obj.date);

    obj.recipient = Recipient.get(scanner);
    obj.sender = Sender.get(scanner);


    return obj;

}



}
