public class ArrayAdvAppl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray(arr);
        fillArray(arr, 10, 99);
        printArray(arr);

        swapFirstLast(arr);
        printArray(arr);

        int index = search(arr, arr[7]);
        System.out.println("Index "+index+"="+arr[index]);

        int max=maxArray(arr);
        System.out.println("Max="+max);


    }

    public static int maxArray(int[]arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void swapFirstLast(int[] arr) {
        int t = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = t;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));

        }
    }
}
