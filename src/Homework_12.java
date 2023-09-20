public class Homework_12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArr(arr, 1, 100);
        printArr(arr);

        int indexMax = getIndexMax(arr);
        System.out.println("Max index = " + indexMax);
        System.out.println("=======================================");

        double average = getAverage(arr);
        System.out.println("Average = "+average);
        System.out.println("===========================================");

        printArr(arr);
        int [] arrMix = unfoldingArray(arr);
        printArr(arrMix);



    }

    //    Задача 1. Создать метод, принимающий массив целых чисел,
//    и возвращающий индекс максимального элемента.
    public static int getIndexMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


//    Задача 2. Создать метод, принимающий массив целых чисел,
//    и возвращающий среднее арифметическое всех его элементов.

    public static double getAverage (int[]arr){
        int sum =0;
        double average=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        average=sum/arr.length;
        return average;
    }
//    Задача 3. Создать метод, принимающий массив целых чисел,
//    и разворачивающий его. Последний элемент становится нулевым,
//    предпоследний, первым, и т. д.
//            Подсказка: этот метод должен изменить полученный массив.
    public static int[] unfoldingArray(int[]arr){
        int t = arr[0];
        for (int i = 0; i < arr.length/2; i++) {
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=t;
            t=arr[i+1];


        }

        return arr;
    }

    public static void fillArr(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}
