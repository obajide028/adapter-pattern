import adapter.TurkeyAdapter;
import impl.MallardDuck;
import impl.WildTurkey;
import interfaces.Duck;

public class AdapterDemo {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says: ");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkeyAdapter says: ");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
