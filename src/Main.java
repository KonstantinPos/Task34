public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i <=9 ; i++) {
            arr[i]=(i+1)*2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
