class Calculator {

    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }
}
    

class CalculatorTest{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result : "+ calculator.add(10,20));
        System.out.println("Result : "+ calculator.sub(30,10));
    }
}