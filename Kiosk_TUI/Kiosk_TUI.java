class Kiosk_TUI {

    String hello_msg = "hi";
    int cash = 1000000;
    Menu menu1;

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();
        myKiosk.menu1 = new Menu("아아", 3300);
        System.out.println( myKiosk.menu1.name );
        System.out.println( myKiosk.menu1.price );
    }

    int pay(){
        return 500;
    }
    
}