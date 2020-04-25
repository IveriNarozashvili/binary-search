public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {100,300,500,700,900,1100,1300,1500,1700,}, 700 ));

    }
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]){
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;

            }
        }
        return  -1;
    }
}
