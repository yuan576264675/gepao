package cn.yuan.gupao.designmode.factory.three.factory;

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
            pizza = new LongjingTeaPizza();
        } else if("veggie".equals(type)){
            pizza = new VeggiePizza();
        } else {
            throw new RuntimeException("未开发的品种");
        }
        return pizza;
    }
}
