
import java.util.Arrays;

class Lab9_Runner{
  public static void main(String[] args){
    System.out.println("---------------------------");       
    BinaryTree bst = new BinaryTree();
    bst.insertBST("Mango");    
    bst.insertBST("Jackfruit");        
    bst.insertBST("Rambutan");    
    bst.insertBST("Peach");  
    bst.insertBST("Grapes");    
    bst.insertBST("Kiwi");            
    bst.insertBST("Vanilla");    
    bst.insertBST("Quince");    
    
    System.out.println(bst.insertBST("Mango"));

    System.out.println("---------------------------");        
    System.out.println("Printing BST:");    
    bst.printBT();
    System.out.println("---------------------------");
        
    System.out.print("Total number of nodes: ");    
    System.out.println(bst.size());            
    System.out.println("---------------------------");        
    
    System.out.println("Printing BST in ascending order:");
    bst.printAscending();    
    System.out.println("---------------------------"); 
    
    System.out.println("Printing BST in descending order:");
    bst.printDescending();
    System.out.println("---------------------------");    
        
    System.out.print("The longest string is: ");    
    System.out.println(bst.getLongestString());    
 
    System.out.println("---------------------------");      
    System.out.println("Retrieving the tree content in a String array: ");
    String[] strArray = bst.getAsArray();
    System.out.println( Arrays.toString(strArray));

    System.out.println("---------------------------");     
    
  }  
}

