package decision_Statement;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int[] P = new int[N];
        int[] A = new int[N];
        
        // Reading P array
        for (int i = 0; i < N; i++) {
            P[i] = scan.nextInt();
        }
        
        // Reading A array
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        
        // DFS variables
        boolean[] visited = new boolean[N];
        
        // Function to perform DFS
        int maxComponentSize = 0;
        
        for (int start = 0; start < N; start++) {
            if (!visited[start]) {
                Stack<Integer> stack = new Stack<>();
                stack.push(start);
                visited[start] = true;
                
                // Track maximum strength found in the component
                int maxStrength = Integer.MIN_VALUE;
                int componentSize = 0;
                
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    componentSize++;
                    // Update max strength encountered so far
                    maxStrength = Math.max(maxStrength, A[node]);
                    
                    // Traverse all children
                    for (int child = 0; child < N; child++) {
                        if (!visited[child] && P[child] == node) {
                            visited[child] = true;
                            stack.push(child);
                        }
                    }
                }
                
                // Check if this component is good
                boolean goodComponent = true;
                for (int i = start; i < start + componentSize; i++) {
                    if (A[i] <= maxStrength) {
                        goodComponent = false;
                        break;
                    }
                }
                
                if (goodComponent) {
                    maxComponentSize = Math.max(maxComponentSize, componentSize);
                }
            }
        }
        
        System.out.println(maxComponentSize);
    }
}