class Kiosk_TUI {

    String hello_msg = "hi";
    int cash = 1000000;
    Menu menu1, menu2, menu3, menu4;

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();
        myKiosk.menu1 = new Menu("아아");
        myKiosk.menu2 = new Menu("뜨아",2900);
        myKiosk.menu3 = new Beverage("레몬에이드",4000, true);
        myKiosk.menu4 = new Coffee("카페모카",4500,false,false,"과테말라");
        myKiosk.menu4 = new Coffee("카라멜마키야또",4500,false,false,"과테말라");
        System.out.println( myKiosk.menu1.name );
        System.out.println( myKiosk.menu1.price );
    }

    int pay(){
        return 500;
    }
    
}