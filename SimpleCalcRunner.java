public class SimpleCalcRunner {
    
    public static void main(String[] args) {
        int n1 = 480;
        int n2 = 452;
        SimpleCalc calc = new SimpleCalc(n1, n2);
        
        System.out.println("Numbers: " + n1 + ", and " + n2);
        System.out.println("Sum: " + calc.add());
        System.out.println("Difference: " + calc.sub());
        System.out.println("Product: " + calc.mult());
        System.out.println("Quotient: " + calc.div());
    }
}