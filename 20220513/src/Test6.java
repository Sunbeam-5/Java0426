import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, avg = 0, max = 0, min = 0;
        int n = sc.nextInt();
        String str = sc.nextLine();
        double[] score = new double[n];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
        }
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / n;
        max = score[0];
        min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]){
                max = score[i];
            }
            if (min > score[i]){
                min = score[i];
            }
        }
        System.out.println("average = "+avg);
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
