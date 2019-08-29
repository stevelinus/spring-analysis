package base.aop;

/**
 * @author skywalker
 */
public class AopDemo implements AopDemoInter {

    public void send() {
        System.out.println("send from aop demo");
    }

    public void receive() {
        System.out.println("receive from aop demo");
    }

    @Override
    public void inter() {
        System.out.println("inter");
    }

}
