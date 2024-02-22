import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1;
        int clientOS;
        String checOS;
        if (checOS == "iOS"){
            clientOS = 0;
        } else if (checOS == "Android"){
            clientOS = 1;
        } else {
            System.out.println("Другая ОС");
        }
        // Задание 2;
        int clientOS2;
        String checOS2;
        int yearIssue;
        int clientDeviceYear = 2015;

        if (checOS2 == "iOS"){
            clientOS2 = 0;
            if (yearIssue < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения");
            }
        } else if (checOS2 == "Android"){
            clientOS2 = 1;
            if (yearIssue < clientDeviceYear){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("обычное предложение об установке приложения");
            }
        } else {
            System.out.println("Другая ОС");
        }

        // Задание 3;
        int year = 2021;

        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4;
        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);

        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);

        } else  { // для deliveryDistance > 100
            System.out.println("доставки нет.");
        }

        // Задание 5;
        int month = 1;
        switch (month){
            case 1 :
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
            case 7 :
            case 8 :
            System.out.println("Лето");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Осень");
                break;

            case 12 :
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }
}