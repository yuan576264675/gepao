package cn.yuan.gupao.designmode.factory.three.factory;

/**
 * @author chenjiangfeng
 * @Description: 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类
 * @Date : 2019/3/17 15 53
 */
public class Client {

    public static void main(String[] args) {

        String pizzaType = "tea";
        // 这里也是需要用工厂来实现的，只是为展示，略过
        PizzaStore pizzaStore = new XiHUPizzaStore();
        try {
            Pizza pizza = pizzaStore.orderPizze(pizzaType);
            System.out.println("到西湖区披萨店吃西湖龙井披萨");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
