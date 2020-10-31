
public class Main {
    public static int max(int a, int b) {
        if(a>b) return a;
        else return b;
    }
    public static int height(Node h) {
        if ( h== null)
        {
            return 0;
        }
        return max(height(h.left),height(h.right))+1;
        
    }
    public static int getLevel(Node h,Node n, int lvl) {
        if (h==null)
        {
            return 0;
        }
        if(h==n)
        {
            return lvl+1;
        }
        return max(getLevel(h.left,n,lvl+1),getLevel(h.right,n,lvl+1));
        
        
    }
    public static void preorder(StringBuilder s,Node h) {
        if(h==null)
        {
            return ;
        }
        else
        {
            s.append(h.element+" ");
            preorder(s,h.left);
            preorder(s,h.right);
        }
        
        
        
    }
    public static void postorder(StringBuilder s,Node h) {
        
        if(h==null)
        {
            return ;
        }
        else
        {
            
            postorder(s,h.left);
            postorder(s,h.right);
            s.append(h.element+" ");
        }
        
    }
    public static void inorder(StringBuilder s,Node h) {
        
        if(h==null)
        {
            return ;
        }
        else
        {
            
            inorder(s,h.left);
            s.append(h.element+" ");
            inorder(s,h.right);
        }
        
    }
    public static boolean same(Node h1, Node h2) {
        if (h1==null && h2==null)
        {
            return true;
        }
        
        if(h1!=null && h2!=null)
        {
            return h1.element==h2.element && same(h1.left,h2.left) && same(h1.right,h2.right);
        }
        return false;
    }
    
    
    
    
    public static Node copy(Node n) {
        if(n==null) return null;
        return new Node(n.element, copy(n.left), copy(n.right));
    }
    
    public static void main(String[] args) {
        Node a=new Node(28);
        Node b=new Node(20);
        Node c=new Node(10);
        Node d=new Node(34);
        Node e=new Node(30);
        Node f=new Node(29);
        Node g=new Node(40);
        Node h=new Node(32);
        StringBuilder sbPre = new StringBuilder();
        StringBuilder sbPost = new StringBuilder();
        StringBuilder sbIn = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        a.left=b;
        a.right=d;
        
        b.left=c;
        
        d.left=e;
        d.right=g;
        
        e.left=f;
        e.right=h;
        
        System.out.println(height(a));
        System.out.println(getLevel(a,b,0));
        preorder(sbPre,a);
        System.out.println(sbPre);
        
        
        postorder(sbPost,a);
        System.out.println(sbPost);
        inorder(sbIn,a);
        System.out.println(sbIn);
        Node cp=copy(a);
        preorder(sb1,cp);
        System.out.println(sb1);
        
        
    }
    
}
