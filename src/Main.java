public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("итерация " + i);
        }
    }

    public static void task2() {
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println("2итерация " + i);
        }
    }

    public static void task3() {
        for (int i = 0; i < 11; i = i + 1) {
            System.out.println("3итерация " + i);
        }
    }

    public static void task4() {
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("4итерация " + i);
        }
    }

    public static void task5() {
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным ");
        }
    }

    public static void task6() {
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println("последовательность сумма " + i);
        }
    }

    public static void task7() {
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println("последовательность умножения " + i);
        }
    }

    public static void task8() {
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9() {
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
         }
    }
}