
import javax.management.MBeanInfo;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Mobile> mobileslist = new ArrayList<Mobile>();
        try
        {
           // File fl = new File("input.txt");
            BufferedReader br = new BufferedReader(new FileReader("input.txt")) ;
            String str;

            while ((str=br.readLine())!=null)
            {
               String arr[]=str.split(", ");
               //System.out.println(arr[0] +" "+ arr[1] + "gitttt");
                mobileslist.add(new Mobile(arr[0],Integer.parseInt(arr[1])));
            }
            br.close();
            //fl.close();
        }
        catch(IOException  e) {
            e.printStackTrace();
        }

     /*   Mobile s10 = new Mobile("Samsung", 60000);
        Mobile iphoneX = new Mobile("Apple", 75000);
        Mobile op7Pro = new Mobile("OnePlus", 48000);
        Mobile mi9  = new Mobile("Xiaomi", 25000);
*/
       /* List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(s10);
        mobiles.add(iphoneX);
        mobiles.add(op7Pro);
        mobiles.add(mi9);*/
        System.out.println("----------------------------------------------");
        System.out.println("Arranging the Mobiles according to their Prices");
      /*  Collections.sort(mobileslist, (mobile1, mobile2) ->
                mobile1.getName().compareTo(mobile2.getName()));

        for(Mobile mobile : mobileslist) {
            System.out.println(mobile.getName());
        }
*/
        Collections.sort(mobileslist, (mobile1, mobile2) ->
                mobile1.getprice()-(mobile2.getprice()));
        System.out.println("----------------------------------------------");
        for(Mobile mobile : mobileslist) {
            //System.out.println();
            System.out.println(mobile.getName() +" -- "+ mobile.getprice());
        }
        System.out.println("----------------------------------------------");
        UpperConcat uc = (s1, s2) -> s1.toUpperCase() +" and "+  s2.toUpperCase();
        String sillyString = doStringStuff(uc, mobileslist.get(0).getName(), mobileslist.get(1).getName());
        System.out.println(sillyString + " are the two cheapest among all the mobiles" );
        System.out.println("----------------------------------------------");
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}






