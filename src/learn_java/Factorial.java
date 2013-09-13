package learn_java;

/**
 * http://www.javatpoint.com/operators-in-java
 * factorial = n * (n-1) * (n-2) * ... * 1
 * fact(5) = 5 * 4 * 3 * 2 * 1 = 120
 * Created with IntelliJ IDEA.
 * User: sudheern
 * Date: 13/9/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Factorial {
    static int fact(int value){
       int f = 1;
        for (int i=1; i <=value; i++){
        f = f * i;
        }
        return f;
    }


    public static void main(String args[]){
        int value = -5;
        int result = fact(value);
        System.out.println("factorial result " + value+ " :"+ result);

    }
}