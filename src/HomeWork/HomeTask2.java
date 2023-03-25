package HomeWork;

//Создать массив вручную. Замеменить максимальный и минимильный элемент массива;
public class HomeTask2 {
    public static void main(String[] args) {
        int min;
        int mass[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = mass[5];
        min = mass[6];
        for (int i = 0; i < mass.length; i++) {
            if (max <= mass[i]) {
                max = mass[i];
            }
            if (min > mass[i]) {
                min = mass[i];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (min == mass[i]) {
                mass[i] = max;
            } else if (max == mass[i]) {
                mass[i] = min;
            }
        }

        for (int i : mass) {
            System.out.print(i + "\t");
        }
    }


}

