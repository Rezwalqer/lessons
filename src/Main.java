
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача для самостоятельной работы");
        float a = 2.5f;
        float b = 5.5f;
        int c = 8;
        boolean d = (b > a && a > c && b > c);
        if (d) {
            System.out.println("Ближайшее число к проверяемому " + b);
        } else if (a == b) {
            System.out.println("Введенные числа не должны биыть равны");
        } else if (a >= c || b >= c) {
            System.out.println("Введенное число не должно быть больше или равно проверяемого");
        } else {
            System.out.println("Ближайшее число к проверяемому " + a);
        }
    }

    public static void task2() {
        System.out.println("Домашнее задание");

        int start1 = 5;
        int end1 = 8;
        int start2 = 1;
        int end2 = 7;
        if (start1 < start2 && end1 == start2) {
            System.out.println("Точка пересечения двух отрезков: " + end1);
        }else if (start2 < start1 && end2 == start1){
            System.out.println("Точка пересечения двух отрезков: " + end2);
        }else if (start1 < start2 && end1 < start2) {
            System.out.println("Отрезки не пересекаются");
        }else if (start2 < start1 && end2 < start1) {
            System.out.println("Отрезки не пересекаются");
        }else if (start2 > start1 && end1 > end2){
            System.out.println("Начало отрезка: " + start2 + ". Конец отрезка: " + end2);
        }else  if (start1 > start2 && end1 < end2){
            System.out.println("Начало отрезка: " + start1 + ". Конец отрезка: " + end1);
        }else if (start2 > start1 && start2 < end1 && end1 < end2) {
            System.out.println("Начало отрезка: " + start2 + ". Конец отрезка: " + end1);
        }else if(start1 > start2 && start1 < end2 && end1 > end2){
            System.out.println("Начало отрезка: " + start1 + ". Конец отрезка: " + end2);
        }
    }
}