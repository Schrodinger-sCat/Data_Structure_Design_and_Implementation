public class task7{
    public static void printAllReverse(Node n){
        if(n!=null&&n.next!=null) printAllReverse(n.next);
        System.out.println(n.element);
    }
    public static void main(String[]args){
        int[] a={1, 2, 3, 4, 5, 6};
        LinkedList list=new LinkedList(a);
        printAllReverse(list.head);
    }
}