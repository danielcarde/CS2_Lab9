class BinaryTree{
    BTNode root; // The binary tree root
    
    int count; // Number of elements currently in the node
    
    BinaryTree(){
    }
    
    BinaryTree(String str){
      root = new BTNode(str);
    }
    
    /**
     * @return Number of elements in the binary 
     * search tree.
     */
    public int size(){
      int size = size(root);
      return size;
    }
    
    private int size(BTNode node){
      if(node==null){
          return 0;//node is empty
      }
      int leftAmount = size(node.left);//amount of nodes on the left
      int rightHeight = size(node.right);//amount of nodes on the right
      int total = leftAmount+rightHeight+1;//adds them together and curr node
      return total;
  }

    /**
     * Insert the string in the parameter into
     * the Binary Search Tree.
     * @param str
     * @return true if insertion is successful.
     */
    public boolean insertBST(String str){
      BTNode newNode = new BTNode(str);
      if (root == null) {//if empty
        root = newNode;
        return true;
      } else {
        if(insertBST(root, newNode)){//then try to insert
          return true;
        }
        return false;
      }
    }

    private boolean insertBST(BTNode root, BTNode insert) {
      String rootData = (String) root.data;//converts the data into a string in order to make the comparisons easier
      String insertData = (String) insert.data;
       
      if (rootData.equals(insertData)) {//no duplicates in the tree
        return false;
      }

      if (insertData.compareTo(rootData) < 0) {//if string is smaller than root
        if (root.left == null) {
          root.left = insert;
          return true;
        } else {
            return insertBST(root.left, insert);
        }
      } else {//if string is bigger than root
        if (root.right == null) {
          root.right = insert;
          return true;
        } else {
          return insertBST(root.right, insert);
        }
      }
    }

    
    /**
     * Return an array of strings containing the 
     * string content elements of the tree.
     * Order of the strings in the array does not matter.
     * @return a String array 
     */
    public String[] getAsArray(){
      String [] dataArr = new String[size(root)];//make the array
      convertArray(root,dataArr,0);
      return dataArr;
    }

    private int convertArray(BTNode root,String[] dataArr, int i){//does in order traversal in order to make tha array
      if(root==null){
        return i;
      }
      i = convertArray(root.left, dataArr, i);
      dataArr[i++] = (String) root.data;
      i = convertArray(root.right, dataArr, i);
      return i;

    }
    
    
    /**
     * Print the binary tree in the format
     * shown in the output.
     */
    
    public void printBT(){
      printBT(root); 
    }

    private void printBT(BTNode node){
      if(node == null){//if its empty print out empty dash
        System.out.println("-");
        return;
      }
      System.out.println("-" + node.data);//print curr node
      printBT(node.left);//goes to the left node
      printBT(node.right);//goes to the right node
  }
    
    /**
     * Print the elements of the binary
     * tree in ascending order.
     */
    public void printAscending(){
      printAscending(root);
    }

    private void printAscending(BTNode node){
      if (node == null) return;
      printAscending(node.left); // left subtree
      System.out.println(node.data); // print node data
      printAscending(node.right); // right subtree
    }
     
    
    /**
     * Print the elements of the binary
     * tree in descending order.
     */  
    public void printDescending(){
      printDescending(root);
    }

    private void printDescending(BTNode node){
      if (node == null) return;
      printDescending(node.right); // right subtree
      System.out.println(node.data); // print node data
      printDescending(node.left); // left subtree
    }
      
    /**
    * Return the longest string of the binary
    * tree.
    * @return the longest string
    */  
    
    public String getLongestString(){
      String string = getLongestString(root);  
      return string;
    }

    private String getLongestString(BTNode root){
      if (root == null) {//if empty return empty string
        return "";
      }
      String left = getLongestString(root.left);//check the left
      String right = getLongestString(root.right);//check the right
      String longest = (String) root.data;//sets a temporary longestt
      if (left.length() > longest.length()) {//compares it to the longest from the left
          longest = left;
      }
      if (right.length() > longest.length()) {//compares it to the longest from the right
         longest = right;
      }
      return longest;
      }
}
  