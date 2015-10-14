import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kdsouza on 8/28/15.
 */
public class ListInOne {

    public static void main(String args[]){

        BufferedReader in = null;
        List<String> bigger = new ArrayList<String>();
        List<String> smaller = new ArrayList<String>();
        List<String> app = new ArrayList<String>();
        //List<String> al = new ArrayList<>();
        // add elements to al, including duplicates

        try {
            in = new BufferedReader(new FileReader("/Users/kdsouza/Documents/comparision/somatic_tp53.txt"));
            String str;
            //String str1;
            while ((str = in.readLine()) != null) {
                str = str.replace("\"", "");
                bigger.add(str);
            }

            in = new BufferedReader(new FileReader("/Users/kdsouza/Documents/comparision/rna_flt1.txt"));

            while ((str = in.readLine()) != null) {
                str = str.replace("\"", "");
                smaller.add(str);
            }

            //flt1tp53_fromapp

            in = new BufferedReader(new FileReader("/Users/kdsouza/Documents/comparision/flt1tp53_fromapp.txt"));
            String str1;
            while ((str1 = in.readLine()) != null) {
                // str = str.replace("\"", "");
                //System.out.println(str1);
                app.add(str1);
            }

            System.out.print("Size of from app should be 179: "+ app.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("" + "\n Size of bigger: "+bigger.size()+ "\nSize of smaller: " + smaller.size());

        List<String> fromdb = new ArrayList<String>();
        int count = 0;
        for (String eachg : bigger){
            if(smaller.contains(eachg)){
                //System.out.print("," + eachg);
                fromdb.add(eachg);
                count++;
            }
        }

        System.out.println("\nThe number of overlapping records: "+ count);

        count = 0;
        for (String eachg : fromdb){
            if(!app.contains(eachg)){
                System.out.print("," + eachg);
                count++;
            }
        }

        System.out.println("\nThe number of missing records: "+ count);

        System.out.println("\n\n\n");

        count = 0;
        for (String eachg : smaller){
            if(!bigger.contains(eachg)){
                System.out.print("," + eachg);
                count++;
            }
        }

        System.out.println("\nThe number of extra/missing records: "+ count);
        /*

        HashSet<String> hs = new HashSet<String>();
        //hs.addAll(gender);

        System.out.println("duplicates");
        System.out.println("Missing patients" + "\n Size of gender: "+gender.size()+ "\nSize of hashset: " + hs.size());

        for(String str : gender){
            if(hs.contains(str)){
                System.out.print(" " + str);
            }else{
                hs.add(str);
            }
        }
*/
    }

}

