package ClassWork;

//создать массив из чисел. Заполнить его в ручную.
//вывести макс и мин число.
public class Task2 {
    public static void main(String[] args) {
        int max=5, min=5;
    int mass[]={1,2,3,4,5,6,7,8,9,10};
        for (int a:mass) {
        if(max<a){
            max=a;
        }if(min>a){
            min=a;
            }
        }
        System.out.println("минимальное число:"+ min + "\tМаксимальное число:" +max);
    }
}
