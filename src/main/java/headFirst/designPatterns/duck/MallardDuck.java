package headFirst.designPatterns.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
