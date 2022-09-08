import java.util.*;
public class 合并两个有序数组 {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            A[k--] = (A[i] > B[j]) ? A[i--] : B[j--];
        }
        System.arraycopy(B,0,A,0,j+1);
    }
}
