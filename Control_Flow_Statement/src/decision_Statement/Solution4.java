package decision_Statement;

import java.util.*;


public class Solution4 {
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
        int[] result = new int[1];
        dfs(0, tree, A, result);
        return result[0];
    }

    private static int dfs(int node, List<List<Integer>> tree, List<Integer> A, int[] result) {
        int size = 1; // The size of the current subtree
        int maxStrength = A.get(node);
        
        for (int child : tree.get(node)) {
            int childSize = dfs(child, tree, A, result);
            if (A.get(child) < maxStrength) {
                size += childSize;
            } else {
                result[0] = Math.max(result[0], childSize);
            }
        }
        
        result[0] = Math.max(result[0], size);
        return size;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read number of nodes
        int N = Integer.parseInt(scan.nextLine().trim());

        // Read parent array P (assuming 0-based indexing)
        List<Integer> P = new ArrayList<>();
        for (int j = 0; j < N; j++) {
            P.add(scan.nextInt());
        }

        // Read strength array A
        List<Integer> A = new ArrayList<>();
        for (int j = 0; j < N; j++) {
            A.add(scan.nextInt());
        }

        // Call the function to get the result
        int result = get_ans(N, P, A);

        // Output the result
        System.out.println(result);
    }
}