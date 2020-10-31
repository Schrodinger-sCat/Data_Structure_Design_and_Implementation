public interface Queue { 
    public void enqueue(Patient o) throws QueueOverflowException; 
    public Patient dequeue() throws QueueUnderflowException;
    public Patient peek() throws QueueUnderflowException;
}