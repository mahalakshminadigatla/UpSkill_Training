import java.util.Scanner;

public class XToAnyPower {
    public static void main(String[] args) {
        System.out.println(Power(2, -3));
//         int x=-2, y=-3;
//         if(y>0){
//             int b = Power(x,y);
      //  System.out.println();
//         }
//         else{

//             int b =  1/Power(x,-y);
//         }
    }


    public static double Power(double x, double y) {
        double z = 1;
//        if (y < 0) {
            // y = -y;
//            for (int i = 1; i <= y; i++) {
//
//                z = z * x;
//            }
//            z = 1 / z;

//        } else {
            for (int i = 1; i <= y; i++) {

                z = z * x;


            }    return z;



    }
}

