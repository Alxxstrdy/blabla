public class Array {
    public static void main(String[] args) {
       int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4,
2, 10}};
        for (int[] data1 : data) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data1[b] + " ");
            }
            System.out.print("\n");
        }
  }
}
