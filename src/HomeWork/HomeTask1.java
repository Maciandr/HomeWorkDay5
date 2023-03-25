package HomeWork;

//Создать массив из 10 элементов. Заполнить массив рандомными числами и вывести их
//Заменить каждый элемент с нечётным индексом на 0
public class HomeTask1 {
    public static void main(String[] args) {
        int massiv10[] = new int[10];
        for (int i = 0; i < 10; i++) {
            massiv10[i] = (int) (Math.random() * 30);
        }
        System.out.println("Массив с рандомными числами ");
        for (int i : massiv10) {
            System.out.print(i + "\t");
        }System.out.println("при выводе нечётные числа заменены на 0");
        for (int i : massiv10) {
            if (i % 2 != 0) {
                i=0;
                System.out.print(i+"\t");
            }else System.out.print(i+"\t");
        }
    }
}

