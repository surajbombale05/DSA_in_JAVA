public class Binary {

    int binarySearch(int[] arr, int key) {
        int top = 0, bottom = arr.length - 1, mid;
        while (top <= bottom) {
            mid = (top + bottom) / 2;
            if (arr[mid] == key) {
                return mid + 1;
            } else {
                if (key < arr[mid]) {
                    bottom = mid - 1;
                } else {
                    top = mid + 1;
                }
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Binary b = new Binary();
        int arr[] = { 56, 76, 765, 5444 };
        int key = 765;
        System.out.print("key is found at: " + b.binarySearch(arr, key));
    }
}
