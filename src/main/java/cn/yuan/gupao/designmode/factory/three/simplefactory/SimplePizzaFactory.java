package cn.yuan.gupao.designmode.factory.three.simplefactory;

/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/17 14 23
 */
public class SimplePizzaFactory {
    public  Pizza createPizza(String type) throws RuntimeException{
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        } else if("veggie".equals(type)){
            pizza = new VeggiePizza();
        } else {
            throw new RuntimeException("未开发的品种");
        }
        return pizza;
    }
}
