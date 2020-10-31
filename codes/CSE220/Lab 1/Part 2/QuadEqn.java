public class QuadEqn{
    public int a,b,c;
    public QuadEqn(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String firstRoot(){
        return (a==1? "x^2":(a==0? "":a+"x^2"))+(b==0? "":(b<0? b+"x":(b==1? "+x":"+"+b+"x")))+(c==0? "":(c<0? c:"+"+c));
    }
}