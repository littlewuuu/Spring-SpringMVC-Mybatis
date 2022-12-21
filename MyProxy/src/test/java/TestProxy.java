import org.example.Calculator;
import org.example.CalculatorImpl;
import org.example.ProxyFactory;

import java.lang.annotation.Target;

public class TestProxy {
    public void test(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,1);
    }
}
