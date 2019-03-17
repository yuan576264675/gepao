package cn.yuan.gupao.designmode.factory.three.factory;

/**
 * @author chenjiangfeng
 * @Description:
 * @Date : 2019/3/17 14 21
 */
public abstract class Pizza {
     protected  String pizzseType;
     public void prepeare() {
          System.out.println("准备"+ pizzseType +"材料");
     }

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
}
