public class Node{
    public int element;
    public Node next, previous;
    public Node(int e, Node n, Node p){
        element=e;
        next=n;
        previous=p;
    }
}