public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    
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
        if(size==data.length){
            throw new QueueOverflowException();
        }
        int s=front+size+1%data.length;
        data[s]=o;
        size++;
    }
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }else{
            int s=(front+1)%data.length;
            Object o=data[s];
            front++;
            size--;
            
            return o;
        }
    }
// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        return data[(front+1)%data.length];
    }
    
// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){
        String s="";
        if(size==0){
            return "Empty Queue ";
        }
        int x=(front+1)%data.length;
        for(int i=0;i<size;i++){
            s=s+data[x]+" ";
            x=(x+1)%data.length;
        }
        return s;
    }
    
// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){
        int s=(front+1)%data.length;
        Object n[]=new Object[size];
        for(int i=0;i<n.length;i++){
            n[i]=data[s];
            s=(s+1)%data.length;
        }
        return n;
    }
    
// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){
        int x=(front+1)%data.length;
        int c=0;
        for(int i=0;i<size;i++){
            if(data[x]==o){
                return c;
            }else{
                c++;
            }
            x=(x+1)%data.length;
        }
        return -1;
    }
}