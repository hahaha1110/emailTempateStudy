package groovy_ch01;
import java.util.Date;
public class DateTest{
    static Object date = new Date();
    public static void main(String[] args) {
        System.out.println(((Date)date).getTime());
    }
    

}