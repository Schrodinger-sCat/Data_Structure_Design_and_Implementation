public class task6{
    public static int addAll(Node n){
        if(n==null)return 0;
        return n.element+addAll(n.next);
    }
    public static void main(String[]args){
        int[] a={1, 2, 3, 4, 5, 6};
        LinkedList list=new LinkedList(a);
        System.out.println(addAll(list.head));
    }
}