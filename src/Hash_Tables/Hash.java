package Hash_Tables;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<String,Integer>();
        student.put("peter",4);
        student.put("maina",5);
        student.put("john",7);

        Set<String> data = student.keySet();
        for (String i : data){
            System.out.println(student.get(i));
            System.out.println(i.hashCode());
        }
        Set<Map.Entry<String,Integer>> data1 = student.entrySet();
        for(Map.Entry<String,Integer> i : data1){
            System.out.println(i.getKey()+ "  " + i.getValue());
        }
    }
}
