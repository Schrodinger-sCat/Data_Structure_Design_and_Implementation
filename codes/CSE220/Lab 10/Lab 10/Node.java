public class Node{
  public int element;
  public Node right;
  public Node left;
  public Node(int e){
    element=e;
  }
  public Node(int e, Node m, Node n){
    element=e;
    left=m;
    right=n;
  }
}