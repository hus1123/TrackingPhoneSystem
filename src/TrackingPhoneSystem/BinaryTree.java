package TrackingPhoneSystem;

public class BinaryTree {
	
	Node root;	 
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }
 
   
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;     
        x.right = y;
        y.left = T2;      
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;     
        return x;
    }
 
    
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;      
        y.left = x;
        x.right = T2;      
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;     
        return y;
    }
 
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }
 
    Node insert(Node node, Information key) {
        
        if (node == null)
            return (new Node(key));
        if (key.getName().compareTo(node.key.getName()) < 0 )
            node.left = insert(node.left, key);
        else if (key.getName().compareTo(node.key.getName()) > 0 )
            node.right = insert(node.right, key);
        else 
            return node;        
        node.height = 1 + max(height(node.left),
                              height(node.right));
        
        int balance = getBalance(node);
        
        if (balance > 1 && key.getName().compareTo(node.left.key.getName()) < 0)
            return rightRotate(node);
        
        if (balance < -1 && key.getName().compareTo(node.right.key.getName()) > 0)
            return leftRotate(node);
       
        if (balance > 1 && key.getName().compareTo(node.left.key.getName()) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
       
        if (balance < -1 && key.getName().compareTo(node.right.key.getName()) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
         
        return node;
    }
      
    Node minValueNode(Node node) 
    { 
        Node current = node; 
        
        while (current.left != null) 
        current = current.left; 
        return current; 
    } 
  
    Node deleteNode(Node root, Information key) 
    { 
         
        if (root == null) 
            return root;        
        if (key.getSerialNo().compareTo(root.key.getSerialNo()) < 0) 
            root.left = deleteNode(root.left, key);         
        else if (key.getSerialNo().compareTo(root.key.getSerialNo()) > 0) 
            root.right = deleteNode(root.right, key);          
        else
        { 
             
            if ((root.left == null) || (root.right == null)) 
            { 
                Node temp = null; 
                if (temp == root.left) 
                    temp = root.right; 
                else
                    temp = root.left;   
               
                if (temp == null) 
                { 
                    temp = root; 
                    root = null; 
                } 
                else  
                    root = temp;  
            } 
            else
            { 
  
                
                Node temp = minValueNode(root.right);             
                root.key = temp.key;            
                root.right = deleteNode(root.right, temp.key); 
            } 
        } 
  
       
        if (root == null) 
            return root;    
        root.height = max(height(root.left), height(root.right)) + 1;        
        int balance = getBalance(root);        
        if (balance > 1 && getBalance(root.left) >= 0) 
            return rightRotate(root);        
        if (balance > 1 && getBalance(root.left) < 0) 
        { 
            root.left = leftRotate(root.left); 
            return rightRotate(root); 
        }        
        if (balance < -1 && getBalance(root.right) <= 0) 
            return leftRotate(root);         
        if (balance < -1 && getBalance(root.right) > 0) 
        { 
            root.right = rightRotate(root.right); 
            return leftRotate(root); 
        } 
  
        return root; 
    } 
    
    
    void preOrder(Node node) {
        if (node != null) {        	
            System.out.print(node.key.getName() + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    
    Information find(Node node, String serialNo) {
        if (node != null) {
            if(node.key.getSerialNo() == serialNo) {
            	return node.key;
            }
            preOrder(node.left);
            preOrder(node.right);
        }
        return null;
    }
}

	


