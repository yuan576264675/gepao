package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description: 余杭区披萨店
 * @Date : 2019/3/17 15 44
 */
public class YuHangPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) throws RuntimeException{
        Pizza pizza = null;
        if("potato".equals(type)){
            pizza = new PotatoPizza(new YHPizzaIngredientFactory());
        } else if("veggie".equals(type)){
            pizza = new VeggiePizza(new YHPizzaIngredientFactory());
        } else {
            throw new RuntimeException("未开发的品种");
        }
        return pizza;
    }
}
