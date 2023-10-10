package rw.ac.org.learn;

public class Calculator {
      public int add(int n1 ,int n2){
        int Sum = n1 + n2;
        return Sum;
    }

    public int subtract(int number1 , int number2){
        int resultSub = number1 - number2;
        return resultSub ;
    }

    public int divide(int D1, Integer D2){
          int division= D1 * D2;
          return division;
    }

//    public static void  main(String[] args) {
//        Calculator calculator = new Calculator();

//        int addResult =calculator.add(4,81);
//        System.out.println("my sum result is :" + addResult);

//        int subResult = calculator.subtract(12 ,90);
//        System.out.println("my subtraction result is:" + subResult);

//        int divideResult = calculator.divide(90 ,3);
//        System.out.println("my division result is :" + divideResult);


//    }
}
