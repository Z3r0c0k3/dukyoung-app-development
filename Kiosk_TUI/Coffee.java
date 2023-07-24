class Coffee extends Beverage{
    boolean decaffenine;
    String origin;

    Coffee(String name, int price, boolean ice,
        boolean decaffenine, String origin){
        super(name, price, ice);
        this.decaffenine = decaffenine;
        this.origin = origin;
    }
}
