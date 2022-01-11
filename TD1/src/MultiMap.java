import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {

    public HashMap<Integer, List<Integer>> MultiMap;

    public MultiMap() {
        this.MultiMap = new HashMap<Integer, List<Integer>>();
    }

    public boolean containsOneValue(Integer a) {
        for (Map.Entry m : MultiMap.entrySet()) {
            if (m.getValue() == a) {
                return true;
            }
        }
        return false;
    }


    public void putOneValue(Integer a,List<Integer> b){
        this.MultiMap.put(a, b);
    }
}
