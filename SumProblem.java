import com.github.sh0nk.matplotlib4j.Plot;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.builder.ScaleBuilder;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class SumProblem {





    BigInteger startPoint = BigInteger.ONE;

    private int countEven = 0;
    private int countOdd = 0;
    public static void main(String[] args) throws PythonExecutionException, IOException {

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

        int i = 2;
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


    private void StartSequenz(BigInteger startPoint) throws PythonExecutionException, IOException {
        Plot plt = Plot.create();

        plt.xlabel("xlabel");
        plt.ylabel("ylabel");
        //plt.text(100, 100, "text");

        //plt.xscale(ScaleBuilder.Scale.valueOf("100"));
        plt.title("Title!");

        System.out.println(startPoint);
        this.startPoint = startPoint;

        while(startPoint.compareTo(BigInteger.ONE) > 0){
            if(startPoint.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0){

                startPoint = (startPoint.multiply(BigInteger.valueOf(3))).add(BigInteger.ONE);
                countOdd++;
            } else {

                startPoint = (startPoint.divide(BigInteger.TWO));
                countEven++;
            }


            System.out.println(startPoint);

        }

        System.out.println("overall even: " + countEven + " " + "overall odd: " + countOdd);


    }
}
