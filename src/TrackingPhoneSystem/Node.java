package TrackingPhoneSystem;


public class Node {
	 int detail;  
     Node previous, next;  
     public Node(int detail) {  
         this.detail = detail;  
         
     }    
 	
 	Information key;
 	int height;
     Node left, right;
  
     Node(Information d) {
         key = d;
         height = 1;

}}
