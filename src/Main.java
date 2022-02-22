import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {
       Transfer t = Transfer.get(new Scanner(System.in));
        System.out.println(t.getSender().downCase(t.getSender()));
        Transfer t1 = TransferAccToAcc.get(new Scanner(System.in));

//        while (true) {
//            System.out.println(
//                "Выберете пункт меню:\n" +
//                    "0. выход\n" +
//                    "1. Перевод к карты на карту \n" +
//                    "2. Перевод со счета на счет\n" +
//                    "3. Информация об отправителе\n" +
//                    "4. Информация об получателе\n" +
//                    ": "
//            );
//            int choice = scanner.nextInt();
//            if (choice == 0)
//                break;
//            if (choice < 1 || choice > 4) {
//                System.out.println("выбран неправильный пункт меню, повторите ввод.");
//                continue;
//            }
//            switch (choice) {
//                case 1:
//                    TransferCardToCard t1 = TransferCardToCard.get(new Scanner(System.in));
//                    break;
//                case 2:
//                     Transfer t2 = TransferAccToAcc.get(new Scanner(System.in));
//                    break;
//                case 3:
//                    car.change_wheel(scanner);
//                    break;
//                case 4:
//                    System.out.println(car.toString());
//                    break;
//            }
//        }
    }
}
