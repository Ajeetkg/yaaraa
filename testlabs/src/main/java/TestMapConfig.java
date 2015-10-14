
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by agupta2 on 10/8/15.
 */
public class TestMapConfig {

    public static void main(String[] args){
        Map<String, Set<Long>> map1= new HashMap<String, Set<Long>>();
        Set<Long> l = new HashSet<Long>();
        map1.put("Hi", l);
        for(Map.Entry<String, Set<Long>> entry: map1.entrySet()){
            System.out.println("----"+entry.getValue().size());
        }
    }
}
