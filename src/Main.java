public class Main {
    public static void main(String[] args) {

        int start = 300;     // Начальный счет
        int pay = 900;      // Сумма пополнения
        int discount = pay / 100;    // Сумма кэшбека

        if (pay > 1000) {
            System.out.println("Сумма подарочных рублей: " + (discount) + "р.");
            System.out.println("Итоговая сумма счета: " + ((start) + (pay) + (discount)) + "р.");
        }else {
            System.out.println("Подарочные рубли предоставляются только при пополнении на сумму более 1000р.");
            System.out.println("Итоговая сумма счета: " + ((start) + (pay)) + "р.");
        }
    }
}