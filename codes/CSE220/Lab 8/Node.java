public class Node{
    int elem;
    Node next;
    Node prev;
    public Node(int e,Node n){
        elem=e;
        next=n;
    }
    public Node(int e,Node n,Node p){
        elem=e;
        next=n;
        prev=p;
    }
}