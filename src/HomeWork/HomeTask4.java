package HomeWork;

//Создать массив (вручную) Отсортировать эементы в порядке возрастания;
//Вывести полученный массив с помощью цикла While;
public class HomeTask4 {
    public static void main(String[] args) {
        int mass[] = {10, 13, 14, 15, 26, 36, 73, 74, 75, 52};
        boolean sort = false;
        int save,out=0;
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
        while( out<mass.length ){
            System.out.print(mass[out]+"\t");
            out++;
        }
        }
    }


