package cn.yuan.gupao.designmode.factory.three.simplefactory;

/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/17 14 33
 */
public class Client {


    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        String pizzaType = "veggie";
        try {
            Pizza pizza = factory.createPizza(pizzaType);

            pizza.prepeare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
