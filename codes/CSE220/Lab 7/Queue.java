public interface Queue { 
    public int size();
    public void enqueue(Patient o) throws QueueOverflowException; 
    public Patient dequeue() throws QueueUnderflowException;
    public Patient peek() throws QueueUnderflowException;
}