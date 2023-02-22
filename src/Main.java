public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

         }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 39;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " + age + " он совершеннолетний");
        }
        if (age <= 18)
            System.out.println("Если возвраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать ");
    }
    public static void task2() {
            System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println( "На улице " + temperature + " градуса нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 35;
        if (speed > 60) {
            System.out.println( "Если скорость  " + speed + " придется заплатить штраф");
        }
        if (speed < 60 ) {
            System.out.println("Скорость " + speed + " можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 22;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в детский сад");
        }else if (age >= 7 && age <18) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в школу");
        }else if (age > 18 && age <=24) {
            System.out.println("Если человеку " + age + " то его место в университете");
        }else if (age>24){
            System.out.println("Если человеку " + age + " то пора ходить на работу");

        }

    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возвраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
    }else if (age >= 5 && age < 14) {
            System.out.println("Если возвраст ребенка равен " + age + " то можно кататься на аттракционе в сопровождении взрослого");
        }else if (age >= 14) {
            System.out.println("Если возвраст ребенка равен " + age + " то можно кататься без сопровождении взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
    int wagonCapacity = 100;
    if (wagonCapacity <= 59) {
        System.out.println("В вагоне сидячих мест " + (60 - wagonCapacity) + " и 42 стоячих");
    }else if (wagonCapacity >= 60 && wagonCapacity <= 101) {
        System.out.println("В вагоне нет сидячих мест, стоячих мест осталось " + (102 - wagonCapacity));
    } else {
        System.out.println( " Вагон уже полностью забит");
    }
    }


    public static void task7() {
        System.out.println("Задача 7");
        int one = 88;
        int two = 14;
        int three = 55;
        if (one >= two) {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else  {
                System.out.println("Максимальное число - " + three);}
            } else  if (one > three) {
                    System.out.println("Максимальное число - " + one);
                } else if (three > one) {
                    System.out.println("Максимальное число- " + three);
                } else {
                    System.out.println("Все  3 числа равны");
                }
            }


        }


