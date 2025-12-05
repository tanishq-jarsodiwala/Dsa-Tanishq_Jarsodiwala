/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        // this can solve through bfs also 
        if(root ==null) return 0;
        // here i have to creae treenode in the format of queue
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root); // here addding the first root
        int count= 0; // this is the count index who incresing with the value 
        while(!q.isEmpty()){
            // here basically the pop the first tree node
            //adding node to store q.poll value 
            TreeNode node= q.poll();
            // if you pop the value increese
            count++;
            // see i m putting the root node in array now i m checking the left and right 
            if(node.left != null)  q.add(node.left);
            //not null then adding the value in queue
            if(node.right != null)  q.add(node.right);
            // same for root 


        }
        return count;
    }
}
