public class singly_selection{
    public static void main(String[]args){
        int[] array={5, 7, 3, 10, 2, 1, 11};
        Node head=new Node(array[0],null);
        Node n=head;
        for(int i=1;i<array.length;i++){
            Node m=new Node(array[i],null);
            n.next=m;
            n=n.next;
        }
        for(Node m=head;m.next!=null;m=m.next){
            Node minNode=m;
            for(Node l=m.next;l!=null;l=l.next){
                if(minNode.elem>l.elem){
                    int temp=l.elem;
                    l.elem=minNode.elem;
                    minNode.elem=temp;
                }
            }
        }
        for(Node m=head;m!=null;m=m.next){
            System.out.print(m.elem+" ");
        }
    }
}