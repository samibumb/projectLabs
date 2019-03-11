import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner ;

public class CarsGame {

    public static void main(String[] args){

       // Scanner sc = new Scanner(System.in) ;

        String car1 = new String("Audi") ;
        String car2 = new String("Mercedes") ;
        String car3= new String("Skoda") ;

        String[] myCars = new String[3];
        myCars[0] = car1 ;
        myCars[1] = car2 ;
        myCars[2] = car3 ;

        for (int i = 0 ; i<=2 ; i++){
            System.out.println("Masina : " +myCars[i]);
        }

        System.out.println(" ");

        for(String car:myCars) {
            System.out.println("Masina for each : "+car);
        }

        System.out.println(" ");

            int i = 0;
            while (i<myCars.length && myCars[i].charAt(0) != 'f' && myCars[i].charAt(0) != 'F') {
                System.out.println("Cu while masina este : " + myCars[i]);
                i++;
            }

        System.out.println(" ");

            int indexDo = 0 ;
            do{
                System.out.println("Do/while : "+ myCars[indexDo]);
                indexDo++ ;
            }while(indexDo<myCars.length);



    }
}
