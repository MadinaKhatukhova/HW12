import java.time.LocalDate;

public class Methods {
    public static void checkLeapYear(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }
    }

    public static void choiceApp(int currentYear) {
        int clientOS = 0; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2021;
        if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.\n");
        } else if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.\n");
        } else if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.\n");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.\n");
        }
    }
    public static int calcDeliveryDays (int deliveryDistance) {
        int deliveryDays = 1;
        int distanceAddDays = 40; // Шаг расстояния, при котором увеличивается доставка на СУТКИ
        int remainingDistance = deliveryDistance - 20; // Если разница <= 0, то выведем СУТКИ на доставку, если больше, то ИНАЧЕ
        if (remainingDistance <= 0) {
        } else if (remainingDistance % distanceAddDays != 0) {
            deliveryDays += remainingDistance / distanceAddDays + 1;
        } else {
            deliveryDays += remainingDistance / distanceAddDays;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        //Задание 1
        checkLeapYear(2000);
    }

    public static void task2() {
        //Задание 2

        int currentYear = LocalDate.now().getYear();
        choiceApp(currentYear);
    }
    public static void task3() {

        //Задание 3
        int deliveryDays = calcDeliveryDays(40);
        System.out.printf("Потребуется дней: %d", deliveryDays);
    }
}