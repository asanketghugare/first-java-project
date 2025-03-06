class Calculator {

    public int add(int a , int b){
        return a+b;
    }
}
class CalcualatorTest{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result : "+ calculator.add(10,20));
    }
}