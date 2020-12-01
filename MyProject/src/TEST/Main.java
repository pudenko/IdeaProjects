package TEST;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> my = new ArrayList<>();
        my.add("Kiev");
        my.add("Lviv");
        my.add("Odessa");
        my.add("Kharkov");
        System.out.println(my);
//        int t = 0;
//        for (String i : my) {
//            i = i + "UA";
//            my.set(t, i);
//            t = t+1;
////            if (t == 1){
//////                my.add("Poltava");
////            my.remove(1);
////            }
//
//        }
//        System.out.println(my);
        String iii;
        Iterator<String> ouy = my.iterator();
        while (ouy.hasNext()) {
            iii = ouy.next();
            iii +="UA";
            System.out.println("Sustem " + iii);
            //if(((String)(iii)).equals("Kiev"));
                //my.add("f");
        }
        System.out.println(my);
    }
}
