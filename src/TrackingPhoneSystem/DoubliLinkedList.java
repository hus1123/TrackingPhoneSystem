package TrackingPhoneSystem;

import TrackingPhoneSystem.Node;

public class DoubliLinkedList {    
    Node first, last = null;  
     
    public void addNode(int detail) {  
        
        Node newNode = new Node(detail);    
        if(first == null) {  
              
            first = last = newNode;  
            first.previous = null;  
            last.next = null;  
        }  
        else {    
            last.next = newNode;   
            newNode.previous = last;  
            last = newNode;  
            last.next = null;  
        }  
    }  
    public void searchNode(int value) {  
        int k = 1234567895;  
        boolean serialno = false;  
        Node current = first;   
        if(last == null) {  
            System.out.println("there are no phone ");  
            return;  
        }  
        while(current != null) {   
            if(current.detail == value) {  
                serialno = true;  
                break;  
            }  
            current = current.next;  
            k++;  
        }  
        if(serialno)  
             System.out.println(" you mobile phone is in istanbul with this serial no: " + k);  
        else  
             System.out.println("don't find any mobile phone with serial no that you anter it ");  
    }  
	
}
