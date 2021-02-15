package level3;

public class Choose {
    public static void main(String[] args) {
        // write your code here
        int[] a = new int[]{40,34,21,54,65,78,12,9,1,2,36,76,100,15,235,33,23,20};
//        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {

            // предпологаем, что начальный элемент рассматриваемого фрагмента и будет минимальным

            int min = a[i]; // предполагаемый минимальный элемент
            int imin = i;   // индекс минимального жлемента

            // Просматриваем оставшийся фрагмент массива и ищем там элемент, меньший предположенного минимума.

            for (int j = i + 1; j < a.length; j++) {
                //Если находим новый минимум, то запоминаем его индекс
                //И обновляем значение минимума
                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }

            //Проверяем, нашелся ли элемент меньше, чем стоит на текущей позиции.
            // Если нашелся, то меняем элементы местами

            if (i != imin) {
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
            System.out.print(a[i] + " ");
        }
    }


//    public static void main(String[] args) {
//        int[] array = {1, 43, 23, 3, 5, 33, 55, 21};
//        for (int i = 0; i < args.length; i++) {
//            int index = i;
//            int min = array[i];
//
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                    index = j;
//                }
//            }
//            if (i != min) {
//                int temp = array[i];
//                array[i] = array[index];
//                array[index] = temp;
//            }
//        }
//    }
}
