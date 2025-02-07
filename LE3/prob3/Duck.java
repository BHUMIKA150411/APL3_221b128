
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

interface SwimBehavior {
    void swim();
}

interface SqueakBehavior {
    void squeak();
}

interface MuteBehavior {
    void mute();
}


class RubberDuck implements SwimBehavior, SqueakBehavior {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming!");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}

class WoodenDuck implements SwimBehavior, MuteBehavior {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming!");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute!");
    }
}

class RedHeadDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }
}

class LakeDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks!");
    }
}


public class Duck {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        woodenDuck.mute();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
