public class Main {
    public static void main(String[] args) {

        int amount = 1312; // сумма билета
        int oneMili = 20; // количество рублей для одной бонусной мили
        int bonus = amount / oneMili; // количество начисленных миль

        System.out.println("Количество начисленных миль: " + bonus);
    }
}