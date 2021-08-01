import java.lang.Number.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
public class main{
public static void main(String args[]){
    BigDecimal number = new BigDecimal("441234568.25555555");

    String pattern = " $ ###.###";
   
    print("Decimal Format Dollar is "+ formatNumber(number, pattern));

    pattern =" $ ###,###.##";
    print("Decimal 2 decimals: "+formatNumber(number, pattern));

    pattern= "$ #,###.#";
    print("Decimal 1 , dollar, separator point decimal: "+formatNumber(number,pattern));



    print(" code runing... sr");
    print("BigDecimal is : "+number);
}
// method print
public static void print(String m){
    System.out.println("\t \t"+ m);
}
// method format
public static String formatNumber(BigDecimal number, String pattern){
  
    DecimalFormat decimalFormat  = new DecimalFormat(pattern);
    return (""+decimalFormat.format(number));

}



}
