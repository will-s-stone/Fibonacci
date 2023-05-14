public class FibThree {
    public static int fibThree(int input){
        if(input==0){
            return 0;
        }
        else if(input==1){
            return 1;
        }
        else if(input ==2){
            return 1;
        }
        else if(input == 3){
            return 1;
        }
        else{
            return (fibThree(input-1)+ fibThree(input-2)+ fibThree(input-3));
        }
    }
    public static void main(String[] args) {
        System.out.println(fibThree(1) + ", " + fibThree(2) + ", " +
                fibThree(3) + ", " + fibThree(4) + ", " +
                fibThree(5) + ", " + fibThree(6) + ", " +
                fibThree(7) + ", " + fibThree(8));

    }
}
