public class Square{
    public double h,w;
    public void setHeight(double h){
        this.h=h;
    }
    public double getHeight(){
        return h;
    }
    public void setWidth(double w){
        this.w=w;
    }
    public double getWidth(){
        return w;
    }
    public double getArea(){
        return h*w;
    }
}