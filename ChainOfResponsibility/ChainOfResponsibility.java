package DesignPatterns.ChainOfResponsibility;

/**
 * Created by rkhurana on 1/22/19.
 */
public class ChainOfResponsibility {
    public static void main(){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
    }
}
