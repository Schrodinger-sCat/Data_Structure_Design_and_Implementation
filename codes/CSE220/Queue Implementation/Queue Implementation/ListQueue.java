public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    // The number of items in the queue
    public int size(){
        return size;
    } 
    
// Returns true if the queue is empty
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException{
        Node n=new Node(o,null);  
        if(size==0){
            front=n;
            rear=front;
        }else{
            
            
            rear.next=n;
            rear=n;
        }
        size++;
    }
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        Object o=front.val;
        front=front.next;
        size--;
        return o;
    }
    
// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        Object o=front.val;
        
        return o;
    }
    
// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){
        String s="";
        if (size!=0){
            for(Node n=front;n!=null;n=n.next){
                s=s+n.val+" ";
            }
            return s;
        }else{
            return "Empty Queue";
        }
        //return s;
        
    }
    
// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){
        Object [] n=new Object[size];
        if(size!=0){
            Node x=front;
            int c=0;
            
            for(Node i=front;i!=null;i=i.next){
                n[c]=i.val;
                c++;
//          x=x.next;
            }
            return n;
        }else{
            return n;
        }
        
    }
    
// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){
        int count=0;
        for(Node n=front;n!=null;n=n.next){
            if(n.val==o){
                return count;
            }
            count++;
        }
        return -1;
    }
//TO DO
}