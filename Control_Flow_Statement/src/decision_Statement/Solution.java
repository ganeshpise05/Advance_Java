package decision_Statement;
import java.util.*;

public class Solution {

    public static int solve(int N, List<Integer> A) {
        
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = A.get(i) == 0 ? -1 : 1;
        }
        
      
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int sum = 0;
        int maxLength = -1; 
        
        for (int i = 0; i < N; i++) {
            sum += nums[i];
            
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        
        return maxLength > 0 ? maxLength : -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextInt());
        }
        
        int result = solve(N, A);
        System.out.println(result);
    }
}