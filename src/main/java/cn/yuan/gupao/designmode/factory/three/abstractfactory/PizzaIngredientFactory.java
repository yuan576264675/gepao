package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description: 披萨原料工厂接口
 * @Date : 2019/3/18 07 25
 */
public interface PizzaIngredientFactory {
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String createClam();
}
