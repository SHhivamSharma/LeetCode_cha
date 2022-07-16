
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return buildTree(preorder,0,n-1,inorder,0,n-1);
    }
//     public static TreeNode preInTree(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei) {
//         if (psi > pei)
//             return null;

//         TreeNode node = new TreeNode(preorder[psi]);

//         int idx = isi;
//         while (inorder[idx] != preorder[psi])
//             idx++;

//         int tnel = idx - isi; // total no of elements.

//         node.left = preInTree(preorder, psi + 1, psi + tnel, inorder, isi, idx - 1);
//         node.right = preInTree(preorder, psi + tnel + 1, pei, inorder, idx + 1, iei);

//         return node;
  //  }

    
    public TreeNode buildTree(int[] preorder, int psi , int pei ,int[] inorder , int isi , int iei) {
      //   if(isi > iei) return null;
       if(psi > pei) 
           return null;
        TreeNode node = new TreeNode (preorder[psi]);
        
        int idx = isi;
        while (inorder[idx] != preorder[psi]) 
            idx++;
        
        int tel = idx - isi;
        
        node.left = buildTree(preorder, psi+1, psi+tel ,inorder, isi, idx-1);
        node.right = buildTree(preorder, psi+tel+1, pei,inorder,idx+1,iei);

        
        
        return node ;
    } 
}