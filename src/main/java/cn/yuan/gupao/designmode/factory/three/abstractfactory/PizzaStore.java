package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/17 15 41
 */
public abstract class PizzaStore {

    public Pizza orderPizze(String pizzaType) throws RuntimeException{
        try {
            Pizza pizza = createPizza(pizzaType);
            pizza.prepeare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return  pizza;
        } catch (Exception e){
           throw  new RuntimeException("本店未提供该披萨",e);
        }
    }

    protected abstract Pizza createPizza(String type) throws RuntimeException;

}
