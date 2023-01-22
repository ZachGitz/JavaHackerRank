import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat u= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i= NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat f= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat c= NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        
        
        System.out.println("US: " + u.format(payment));
        System.out.println("India: " + i.format(payment));
        System.out.println("China: " + c.format(payment));
        System.out.println("France: " + f.format(payment));
    }
}
