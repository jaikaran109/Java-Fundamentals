class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        List<Integer> l = inorderTraversal(root.left);
        List<Integer> r = inorderTraversal(root.right);
        list.addAll(l);
        list.add(root.val);
        list.addAll(r);
        return list;
    }
}
