package Gelataria;

public class Copo extends Decorator{
    private String ingrediente;

    public Copo(Gelado ice,String ingrediente) {
        super(ice);
        this.ingrediente = ingrediente;
    }

    public Copo(Gelado g){
        this(g,null);
    }

    @Override
    public void base(int i) {
        g.base(i);
        System.out.println(" em copo"+ (ingrediente==null?"":" com "+ ingrediente));
    }
}
