package cn.yuan.gupao.designmode.factory.three.abstractfactory;

/**
 * @author chenjiangfeng
 * @Description: pizza抽象类，没种披萨自己去定义pizza材料的准备
 * @Date : 2019/3/17 14 21
 */
public abstract class Pizza {
     protected  String pizzseType;

     //原材料
     protected String dough;
     protected String sauce;
     protected String cheese;
     protected String clam;

     //准备材料接口
     protected abstract void prepeare();

     public void bake() {
          System.out.println("烘焙"+ pizzseType);
     }

     public void cut() {
          System.out.println("切割"+ pizzseType);
     }

     public void box() {
          System.out.println("包装"+ pizzseType);
     }

     public String getPizzseType() {
          return pizzseType;
     }

     @Override
     public String toString() {
          return "Pizza{" +
                  "pizzseType='" + pizzseType + '\'' +
                  ", dough='" + dough + '\'' +
                  ", sauce='" + sauce + '\'' +
                  ", cheese='" + cheese + '\'' +
                  ", clam='" + clam + '\'' +
                  '}';
     }
}
