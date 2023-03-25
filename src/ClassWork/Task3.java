package ClassWork;

//создать массив чисел от 1 до 100.
//вывести полученный массив

public class Task3 {
    public static void main(String[] args) {
        int mass[] = new int[100];
        int a=1;
        for (int i = 0;i<mass.length;i++ ){
            mass[i]=a++;
        }
        System.out.println();
        for (int b: mass) {
            System.out.print(b+" ");
        }
    }
}
