
public class LargeFactorial {

    public static void main(String[] args) {

        int n = 20;

        int[] result = new int[1000];

        result[0] = 1;
        int size = 1;

        for (int x = 2; x <= n; x++) {

            int carry = 0;

            for (int i = 0; i < size; i++) {

                int product = result[i] * x + carry;

                result[i] = product % 10;

                carry = product / 10;
            }

            while (carry > 0) {

                result[size] = carry % 10;

                carry = carry / 10;

                size++;
            }
        }

        System.out.print(n + "! = ");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}

