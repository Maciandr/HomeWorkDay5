package ClassWork;

//Создать массив(вручную). отсортировать элементы массива по возростанию
// вывести полученный массив
public class Task5 {
    public static void main(String[] args) {
        int mass[] = {10, 13, 14, 15, 26, 36, 73, 74, 75, 52};
        boolean sort = false;
        int save;
        while (!sort) {
            sort = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    sort = false;
                    save = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = save;
                }
            }
        }
        for (int a : mass) {
            System.out.print(a + "\t");
        }
    }
}
