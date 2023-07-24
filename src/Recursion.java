public class Recursion {

    public void countdown (int n) {
        if(n == 0) {
            System.out.println("Blast off!");
        } else {
            System.out.println(n);
            countdown(n-1);

        }
    }

    public int factorial(int n) {
        if(n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        int digit = n % 10;
        return digit + sumDigits(n / 10);

    }

    public int summation(int n) {
        if(n == 1) {
            return n;
        }

        return n + summation(n-1);
    }

    public int power(int base, int exp) {
        if(exp == 0) {
            return 1;
        }

        return base * power(base, exp-1);

    }

    public int gcd(int a, int b) {
        int low = Math.min(a, b);
        int high = Math.max(a, b);

        if(low == 0) {
            return high;
        }
        if(low == 1) {
            return 1;
        }

        return gcd(low, high % low);
    }

}
