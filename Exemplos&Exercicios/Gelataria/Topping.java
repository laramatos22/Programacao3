package Gelataria;

public class Topping extends Decorator{
    private String Toping;

    public Topping(Gelado ice, String t) {
        super(ice);
        Toping=t;

    }

    @Override
    public void base(int i) {
        g.base(i);
        System.out.println(" com " + Toping);
    }
}
