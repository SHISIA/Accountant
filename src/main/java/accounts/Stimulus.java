package accounts;

import javafx.fxml.Initializable;
import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Stimulus {

    public Integer generate(){
        System.out.println("Enter Upper Number :::");
        Scanner sc=new Scanner(System.in);
        int up=sc.nextInt();
        System.out.println("Enter Upper Number :::");
        int low=sc.nextInt();
        return ThreadLocalRandom.current().nextInt(low,up+1);

    }
    public void compute(){
        int get=generate();
        double []ape=new double[3];
         for (int i=0;i<=2;i++){
             double randomValue=ThreadLocalRandom.current().nextDouble(0,.25);
             double percent=randomValue* get;
             ape[i]=percent;
             System.out.println(randomValue);
         }
         System.out.println(ape[0]+" "+ape[1]+" "+ape[2]);

         System.out.println(get-(ape[0]+ape[1]+ape[2]));

    }



    public static void main(String []args){
        Stimulus stimulus=new Stimulus();
        stimulus.compute();
    }

}
