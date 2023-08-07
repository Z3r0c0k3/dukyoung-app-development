class Kiosk_TUI {

    String hello_msg = "hi";
    int cash = 1000000;
    Menu[] menus = new Menu[5];

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();
        myKiosk.menus[0] = new Menu("아아");
        myKiosk.menus[1] = new Menu("뜨아",2900);
        myKiosk.menus[2] = new Beverage("레몬에이드",4000, true);
        myKiosk.menus[3] = new Coffee("카페모카",4500,false,false,"과테말라");
        myKiosk.menus[4] = new Coffee("카라멜마키야또",4500,false,false,"과테말라");

        System.out.println( myKiosk.menus[0].name );
        System.out.println( myKiosk.menus[0].price );
        System.out.println( myKiosk.menus[1] );
        System.out.println( myKiosk.menus[2] );
        System.out.println( myKiosk.menus[3] );
        System.out.println( myKiosk.menus[4] );
    }

    int pay(){
        return 500;
    }
    
}