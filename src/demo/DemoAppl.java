package demo;

public class DemoAppl {

    public static int sumArray (int[] arr) {

        int sum=0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static double average(int[] arr) {

        if (arr.length == 0) {
            return 0.;
        }
        int sum = sumArray(arr);

        return (double)(sum / arr.length);
    }

    public static double averageBug(int[] arr) {

        if (arr.length == 0) {
            return 0.;
        }

        int sum=0;

        for (int j = 1; j < arr.length; j++) {
            sum += arr[j];
        }

        return (double)(sum / (arr.length));
    }

    public static int maxValue (int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }



}
