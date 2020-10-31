public class ComplexNumber extends RealNumber{
    public double imagValue;
    public ComplexNumber(){
        super.setRealValue(1.0);
        imagValue=1.0;
    }
    public ComplexNumber(int r, int i){
        super.setRealValue(r);
        imagValue=i;
    }
    public String toString(){
        return super.toString()+"\n"+"ImaginaryPart: "+imagValue;
    }
    public void check(){
        System.out.println("I'm in ComplexNumber class");
        super.ping();
        System.out.println("Checking ended");
    }
}