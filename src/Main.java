public class Main {
    public static void main(String[] args) {
        // вызов метода домашки 1
        hw1();

        // вызов метода домашки 2
        hw2_2();
        // вызов метода домашки 2
        hw2_1();
    }

    public static void hw1() {

        System.out.println("===Домашняя работа N1===\n");
        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // куриных бёдер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");
        System.out.println("\n\n\n");

    }


    public static void hw2_2() {
        System.out.println("===Домашняя работа N2.2===\n");
        int amount = 1500;
        int balance = 200;
        int bonus = 0;
        if (amount >= 1000) {
            bonus = (amount / 100);
        }
        System.out.println("итоговый бонус: " + bonus);
        System.out.println("итоговая сумма: " + (bonus + amount + balance));
        System.out.println("\n\n\n");
    }

    public static void hw2_1() {
        System.out.println("===Домашняя работа N2.1===\n");
        int x = 200;
        System.out.println("bonus: " + x / 20);
        System.out.println("\n\n\n");
    }
}

