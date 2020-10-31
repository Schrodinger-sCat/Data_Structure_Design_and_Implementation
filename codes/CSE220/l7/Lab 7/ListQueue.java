public class ListQueue{
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
  public void enqueue(Patient o) throws QueueOverflowException{
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
  public Patient dequeue() throws QueueUnderflowException{
    if(size==0){
      throw new QueueUnderflowException();
    }
    Patient o=front.val;
    front=front.next;
    size--;
    return o;
  }
  
    public Patient peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        Patient o=front.val;
        
        return o;
    }
}