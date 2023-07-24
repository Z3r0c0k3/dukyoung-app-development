class Beverage extends Menu{
    boolean ice;

    Beverage(String name, int price, boolean ice){
        super(name, price);
        this.ice = ice;
    }
}