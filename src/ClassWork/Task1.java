package ClassWork;

//Заполнить массив случайными числами и вывести полученный массив.
//Для заполнения случайными числами используйте Math.random()*20

public class Task1 {
    public static void main(String[] args) {
               int massive[]=new int[10];
        for (int i=0;i<massive.length; i++) {
            massive[i]=(int)(Math.random()*20);
            System.out.print( massive[i] + " ");
       }System.out.println("");
        for (int a: massive) {
            System.out.print( a + " ");
        }

    }
}
