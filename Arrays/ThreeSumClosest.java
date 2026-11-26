
public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        int closest = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (Math.abs(target - sum) < Math.abs(target - closest)) {
                        closest = sum;
                    }
                }
            }
        }

        System.out.println(closest);
    }
}

