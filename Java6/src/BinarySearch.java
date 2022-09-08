public class BinarySearch {
    public static int BinarySearch(int[] a, int key){
        int left = 0, right = a.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (a[mid] == key){
                return mid;
            }
            else if (a[mid] < key){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = BinarySearch(arr, 5);
        System.out.println(index);
    }
}
