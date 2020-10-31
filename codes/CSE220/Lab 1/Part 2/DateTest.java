public class DateTest{
    public static void main(String[]args){
        Date d1=new Date(1,21,2018);
        Date d2=new Date(9,1,1997);
        Date d3=new Date();
        d1.setMonth(9);
        d1.setDay(1);
        d1.setYear(1997);
        d3.setMonth(9);
        d3.setDay(1);
        d3.setYear(1997);
        System.out.println(d1.getMonth()+"/"+d1.getDay()+"/"+d1.getYear());
        System.out.println(d2.getMonth()+"/"+d2.getDay()+"/"+d2.getYear());
        System.out.println(d3.getMonth()+"/"+d3.getDay()+"/"+d3.getYear());
    }
}