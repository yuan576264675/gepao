package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description: 西湖区披萨原料工厂
 * @Date : 2019/3/18 07 28
 */
public class YHPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public String createDough() {
        return "面团";
    }

    @Override
    public String createSauce() {
        return "土豆酱";
    }

    @Override
    public String createCheese() {
        return "奶酪";
    }

    @Override
    public String createClam() {
        return "冷冻海鲜";
    }
}
