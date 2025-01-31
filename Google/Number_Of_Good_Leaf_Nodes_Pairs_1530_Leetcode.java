package Google;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Number_Of_Good_Leaf_Nodes_Pairs_1530_Leetcode {

        public int countPairs(TreeNode root, int distance) {
            int[] ans = new int[1]; // Using an array to allow updates within the dfs function
            dfs(root, distance, ans);
            return ans[0];
        }
    
        private int[] dfs(TreeNode node, int distance, int[] ans) {
            // If the node is null, return an empty array
            if (node == null) {

                return new int[0];
            }
    
            if (node.left == null && node.right == null) { // If it's a leaf node
            // Return a single element array containing 0
                return new int[]{1};
            }
    
            // Recurse on the left and right subtrees
            int[] leftDistances = dfs(node.left, distance, ans); // Count pairs within the left subtree
            
            int[] rightDistances = dfs(node.right, distance, ans); // Count pairs within the right subtree
    
            // Count pairs across left and right subtrees
            for (int ld: leftDistances) {
                // If the sum of distances is less than or equal to the target distance
                for (int rd: rightDistances) {
                    // If the sum of distances is less than or equal to the target distance
                    if (ld + rd <= distance) {
                         // Increment the answer
                        ans[0]++;
                    }
                }
            }
    
            // Prepare and return distance list for the current node
            int[] distances = new int[leftDistances.length + rightDistances.length]; // Initialize an array to store distances
            int index = 0;
            // Add 1 to each distance and store it in the distances array
    
            for (int ld: leftDistances) {
                // If the distance is less than the target distance
                if (ld + 1 < distance) { // Only consider up to `distance-1`
                    distances[index++] = ld + 1;  // Increment the index
                }
            }
    
            for (int rd: rightDistances) { // If the distance is less than the target distance
                if (rd + 1 < distance) { // Only consider up to `distance-1`
                    distances[index++] = rd + 1; // Increment the index
                }
            }
    
            return Arrays.copyOf(distances, index);  // Return the distances array
        }
}
