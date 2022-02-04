public class Main {
    public static void main(String[] args) {

        int amount = 99; // стоимость билета
        int number = 20; // сумма для получения одной бонусной милли
        int bonus = amount / number; // кол-во бонусных миль

        System.out.println("Купили билет. Получили в подарок бонусные мили в количестве:");
        System.out.println(bonus);
    }
}
