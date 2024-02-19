public class Main {
    public static void main(String[] args) {
        // Задание 1;
        int age = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен "+ age +", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+ age +", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задание 2;
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице "+ temperature +" градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице "+ temperature +" градусов, можно идти без шапки");
        }
        // Задание 3;
        int speed = 55;
        if (speed >= 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Если скорость …, то  придется заплатить штраф / можно ездить спокойно");
        // Задание 4;
        //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        // Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
        // Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
        // А если человеку больше 24, то ему пора ходить на работу.
        //Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)
        int age1 = 4;

        if (age1 >= 2 || age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 || age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 || age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университете");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Меньше 2 лет");
        }

        // Задание 5;
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет
        // , то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.

        // Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное:
        // нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)
        int age2 = 44;
        String conclusion;
        if (age2 <= 5) {
            conclusion = "нельзя кататься на аттракционе";
        } else if (age2 > 5 || age2 <= 14) {
            conclusion = "можно кататься на аттракционе в сопровождении";

        } else if (age2 > 14) {
            conclusion = "без сопровождения взрослого";

        } else {

        }

        System.out.println("Если возраст ребенка равен " + age2 + " то ему " + conclusion);

        // Задание 6;
        //Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        //
        //С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль
        // сообщение о том, есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.
        int totalPlaces = 102;
        int seatPlaces = 60;
        int strandingPlaces = totalPlaces - seatPlaces;
        int seatPlacesOccupied = 5;
        int strandingPlacesOccupied = 13;
        if (seatPlacesOccupied >= seatPlaces || strandingPlacesOccupied >= strandingPlaces) {
            System.out.println("Мест нет");
        } else if (seatPlacesOccupied < seatPlaces || strandingPlacesOccupied >= strandingPlaces) {
            System.out.println("Есть сидячие места");
        } else if (seatPlacesOccupied >= seatPlaces || strandingPlacesOccupied < strandingPlaces) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Места есть");
        }

        // Задание 7;
        int one;
        int two;
        int three;
        if (one > two || one > three) {
            System.out.println(one);
        } else if (two > one || two > three) {
            System.out.println(two);
        } else if (three > one || three > two) {
            System.out.println(three);
        } else {
            System.out.println("Какие-то числа равны");
        }

    }
}