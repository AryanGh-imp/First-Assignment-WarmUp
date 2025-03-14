public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {

        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= n/2; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {

        if (n == 0) {return 0;}
        if (n == 1) {return 1;}

        long a = 0;
        long b = 1;
        long index = 1;

        while (b <= n) {

            if (b == n) {return index;}

            long temp = a + b;
            a = b;
            b = temp;
            index++;
        }

        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {

        char[][] shape = new char[n][];

        for (int i = 0; i < n; i++) {
            shape[i] = new char[i + 1];
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || i == n - 1 || j == i){
                    shape[i][j] = '*';
                }
                else{
                    shape[i][j] = ' ';
                }
            }
        }

        return shape;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
