import java.math.BigInteger;
import java.util.*;
public class SumProblem {





    BigInteger startPoint = BigInteger.ONE;


    public static void main(String[] args) {

        SumProblem sum = new SumProblem();
        System.out.println("Hello, you math freak!");
        System.out.println("Enter a huge number to let 3x+1 do its job!");
        Scanner sc=new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        sum.processing();


        sum.StartSequenz(a);

    }


    private void processing(){

        System.out.print("Processing");
        String out = "";

        int i = 5;
        while (i>0){
            try {
                i--;
                out= "";
                Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
                out = ".";

            }
            catch (InterruptedException e) {
                //I don't think you need to do anything for your particular problem
            }

            System.out.print(out);

        }


    }


    private void StartSequenz(BigInteger startPoint){

        System.out.println(startPoint);
        this.startPoint = startPoint;

        while(startPoint.compareTo(BigInteger.ONE) > 0){
            if(startPoint.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0){

                startPoint = (startPoint.multiply(BigInteger.valueOf(3))).add(BigInteger.ONE);

            } else {

                startPoint = (startPoint.divide(BigInteger.TWO));
            }
            System.out.println(startPoint);

        }

    }
}
