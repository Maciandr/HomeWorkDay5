package ClassWork;

//Создать массив любой размерности и заполнить его.(можно в ручную любыми числами)
//На основании созданного массива создать 2 масива.
//Первый массив будет содержать все чётные элементы первого массива.
//второй массив все нечётные элементы первого массива.
//вывести все три массива
public class Task4 {
    public static void main(String[] args) {
        int mass[] = new int[100];
        int a[] = new int[100];
        int b[] = new int[100];
        int num = 0;
        System.out.println("просто массив ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
            System.out.print(mass[i] + " ");
        }
        System.out.println("\n Чётный массив : ");
        for (int x : mass) {
            if (x % 2 == 0) {
                a[num] = x;
                System.out.print(a[num] + "\t");
                num++;
            }
        }
        System.out.println("\n Нечётный массив");   //можно было легко сделать через иф елса. без вывода. и потом вывести по очереди.
        num = 0;                                    //но не хотелось создавать дополнительную переменную как num
        for (int x : mass) {
            if (x % 2 != 0) {
                b[num] = x;
                System.out.print(b[num] + "\t");
                num++;
            }
        }
    }
}
