package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description: 西湖区披萨店
 * @Date : 2019/3/17 15 44
 */
public class XiHUPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) throws RuntimeException{
        Pizza pizza = null;
        if("tea".equals(type)){
            pizza = new LongjingTeaPizza(new XHPizzaIngredientFactory());
        } else if("veggie".equals(type)){
            pizza = new VeggiePizza(new XHPizzaIngredientFactory());
        } else {
            throw new RuntimeException("未开发的品种");
        }
        return pizza;
    }
}
