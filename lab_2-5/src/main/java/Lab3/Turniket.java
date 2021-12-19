package Lab3;

import java.util.Scanner;

public class Turniket {

    public static void main(String[] args){

        String input;
        int quantity, term;
        System.out.println("Ведіть номер карти за якою здійснюте прохід через турнікет" +
                "\n(1)Студентські, (2)Учнівські, (3)Звичайні:");


        Scanner sc = new Scanner(System.in);
        input = sc.next();

        if(input.matches("1")) {
            System.out.println("Ви обрали студентську картку \nТурнікет, що здійснював облік дозволів вампроходу");
        }else if(input.matches("3")){
            System.out.println("Ви обрали звичайну картку \nВедіть кількість поїздок: ");
            quantity = sc.nextInt();
            System.out.println("Ведіть термін дії: ");
            term = sc.nextInt();
            if (quantity <= 0 || term <=0 ){
                System.out.println("Вхід заборонено, будь-ласку поповніть карту та проведіть операцію ще раз!");
            }else if (quantity > 0 || term > 0){
                System.out.println("Вхід дозволено");
            }else{
                System.out.println("Не вдалося зчитувати дані [Термін дії] та [Кількість поїздок]");
            }
        }else if(input.matches("2")){
            System.out.println("Ви обрали учнівську картку \nТурнікет здійснює облік дозволів проходу");
        }else{
            System.out.println("Турнікет не вдалось зчитувати дані");
        }

    }
}

