package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/12 17 28
 */
public class Client {
    public static void main(String args[]){
        String pizzaType = "tea";
        // 这里也是需要用工厂来实现的，只是为展示，略过
        PizzaStore pizzaStore = new XiHUPizzaStore();
        try {
            Pizza pizza = pizzaStore.orderPizze(pizzaType);
            System.out.println("到西湖区披萨店吃西湖龙井披萨");
            System.out.println(pizza.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
