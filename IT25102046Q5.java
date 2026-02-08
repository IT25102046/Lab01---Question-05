class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int n) {
        return n * n;
    }
}

public class IT25102046Q5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int prod1 = calc.multiply(3, 4);      
        int prod2 = calc.multiply(5, 7);      
        int sum1  = calc.add(prod1, prod2);   
        int result1 = calc.square(sum1);      

        System.out.println("Result of (3 * 4 + 5 * 7)^2: " + result1);

        int sumA = calc.add(4, 7);            
        int sqA  = calc.square(sumA);         
        
        int sumB = calc.add(8, 3);            
        int sqB  = calc.square(sumB);         
        
        int result2 = calc.add(sqA, sqB);    

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2: " + result2);
    }
}