
public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(1) + ", " + fib(2) + ", " +
                fib(3) + ", " + fib(4) + ", " +
                fib(5) + ", " + fib(6) + ", " +
                fib(7) + ", " + fib(8));
    }

    public static int fib(int x) {
        if(x == 1 | x ==2){
            return 1;
        }
        return fib(x-2) + fib(x-1);
    }
}
