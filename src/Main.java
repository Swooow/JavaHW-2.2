public class Main {
    public static void main(String[] args) {
        int balance = 117;
        int payment = 1142;
        int bonus = 0;

        if (payment > 1000) {
            int bonusPlus = 0;
            bonusPlus = payment / 100;
            bonus = bonus + bonusPlus;
            balance = balance + payment + bonus;
        } else {
            balance = balance + payment;
        }

        System.out.println("Вы пополнили баланс на " + payment + " рублей!");
        System.out.println("Вам начислено " + bonus + " бонусов!");
        System.out.println("Подробнее с бонусной программой можно ознакоиться, пройдя по ссылке ...");
        System.out.println("Ваш текущий баланс - " + balance + " рублей.");
    }
}
