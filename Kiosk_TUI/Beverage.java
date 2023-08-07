class Beverage extends Menu{
    boolean ice;

    Beverage(String name, int price, boolean ice){
        super(name, price);
        this.name = super.name + (" 음료");
        this.ice = ice;
    }

    @Override
    public String toString(){
        return super.toString() + "|온도: " + (ice ? "아이스|" : "핫|");
    }
}