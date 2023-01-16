package headFirst.designPatterns.duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
