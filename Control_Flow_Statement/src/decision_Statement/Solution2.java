package decision_Statement;
import java.util.*;

public class Solution2 {
    public static int get_ans(int N, List<Integer> P, List<Integer> A) {
        // Create adjacency list to represent the tree
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tree.add(new ArrayList<>());
        }
        
        // Build the tree
        for (int i = 1; i < N; i++) {
            tree.get(P.get(i)).add(i);
        }
        
        // Function to perform DFS and find the size of the largest good connected component
        return dfs(0, tree, A);
    }

    private static int dfs(int node, List<List<Integer>> tree, List<Integer> A) {
        int maxSize = 0;
        int maxStrength = 0;
        int size = 1; // The size of the current subtree
        
        for (int child : tree.get(node)) {
            int childSize = dfs(child, tree, A);
            if (A.get(child) > maxStrength) {
                maxStrength = A.get(child);
            }
            if (A.get(node) > maxStrength) {
                size += childSize;
            } else {
                maxSize = Math.max(maxSize, childSize);
            }
        }
        
        maxSize = Math.max(maxSize, size);
        return maxSize;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> P = new ArrayList<>(N);
        for(int j = 0; j < N; j++) {
            P.add(Integer.parseInt(scan.nextLine().trim()));
        }

        List<Integer> A = new ArrayList<>(N);
        for(int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = get_ans(N, P, A);

        System.out.println(result);
    }
}