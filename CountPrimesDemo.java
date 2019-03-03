import java.util.ArrayList;
import java.util.List;

public class CountPrimesDemo {
    public static List<Integer> CountPrime(int n){
        if (n<3){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (int i=2; i < n; i++){
             boolean flag = true;
            for (int j=2; j <= Math.sqrt(n); j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        List<Integer> list = CountPrime(5);
        List<Integer> list2 = CountPrime(111);
        List<Integer> list3 = CountPrime(-1);
    }

}
