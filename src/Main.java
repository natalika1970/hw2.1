public class Main {
    public static void main(String[] args) {

        // условный оператор задание 1
        System.out.println("условный оператор задание 1");


        int age = 13;
        if (age >= 18) {
            System.out.println("поздравляю с совершеннолетием");
        } else if (age < 18) {
            System.out.println("твой возраст совершеннолетия ещё не наступил");
        }
        // условный оператор задание 2
        System.out.println("условный оператор задание 2");


        if (age >= 7 && age <= 18) {
            System.out.println("Человек ходит в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age > 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу,");
        }
        // условный оператор задание 3
        System.out.println("условный оператор задание 3");
        int capacityVagon = 102;
        int sittingPlaces = 60;
        int passengers = 13;
        if (passengers < 60) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (passengers > 60 && passengers <= 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else if (passengers >= 102) {
            System.out.println("Вагон переполнен");

        }
        // условный оператор задание 4
        System.out.println("условный оператор задание 4");

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен 3 , то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен 8 , то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен 19 , то ему нужно учиться в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен 25, то ему нужно ходить на работу");
        }
        // условный оператор задание 5
        System.out.println("условный оператор задание 5");
        if (age <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
        // условный оператор задание 6
        System.out.println("условный оператор задание 6");

        int one = 10;
        int two = 15;
        int three = 13;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше " + two + "и больше, чем " + three);
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " больше " + one + "и больше, чем " + three);
        }
        if (three > one && one > two) {
            System.out.println("Число " + three + " больше " + one + "и больше, чем " + two);
        }
    }
}