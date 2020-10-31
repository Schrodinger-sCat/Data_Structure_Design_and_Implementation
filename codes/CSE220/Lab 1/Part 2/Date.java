public class Date{
    public int m,d,y;
    public Date(){
    }
    public Date(int m, int d, int y){
        this.m=m;
        this.d=d;
        this.y=y;
    }
    public void setMonth(int m){
        this.m=m;
    }
    public void setDay(int d){
        this.d=d;
    }
    public void setYear(int y){
        this.y=y;
    }
    public int getMonth(){
        return m;
    }
    public int getDay(){
        return d;
    }
    public int getYear(){
        return y;
    }
}