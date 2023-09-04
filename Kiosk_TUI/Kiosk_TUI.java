import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.Style;

class Kiosk_TUI {

    Menu[] menus = new Menu[10];

    public static void main(String[] args){
        Kiosk_TUI myKiosk = new Kiosk_TUI();
        myKiosk.menus[0] = new Menu("honey bread", 5000);
        myKiosk.menus[1] = new Menu("macaron", 4500);
        myKiosk.menus[2] = new Beverage("lemonade",3000, true);
        myKiosk.menus[3] = new Beverage("greentea", 3600, false);
        myKiosk.menus[4] = new Coffee("hot americano",3000,true,false,"콜롬비아");
        myKiosk.menus[5] = new Coffee("ice americano",3500,true,false,"콜롬비아");
        myKiosk.menus[6] = new Coffee("hot americano",3000,true,false,"과테말라");
        myKiosk.menus[7] = new Coffee("ice americano",3500,true,false,"과테말라");
        myKiosk.menus[8] = new Coffee("cafe moca",4500,false,false,"콜롬비아");
        myKiosk.menus[9] = new Coffee("ceramel coffee",4500,false,false,"콜롬비아");

        myKiosk.showMenus();
        System.out.print("원하는 메뉴를 입력해주세요(1~10): ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(input);

        try{
            int selectedNumber = Integer.parseInt(input);
            if (selectedNumber > 0 && selectedNumber <= 10){
                System.out.println("선택하신 메뉴는 " + myKiosk.menus[selectedNumber-1]+" 입니다.");
                myKiosk.payment(selectedNumber);
            }

            else throw new Exception("그런 번호는 존재하지 않습니다.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    void showMenus(){
        System.out.println("<==Jay's Coffee kiosk==>");
        for(int i = 0 ; i < menus.length ; i++){
            System.out.println(menus[i]);
        }
    }

    void payment(int index) throws InterruptedException{
        System.out.println("결제할 금액: " + menus[index-1].price + "원 입니다.");
        System.out.print("현금을 넣어주세요: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        int insert_money = Integer.parseInt(input);
        
        try{
            if(insert_money >= menus[index-1].price){
                System.out.println("결제가 완료되었습니다.");
                System.out.println("거스름돈은 " + (insert_money - menus[index-1].price)+ "원 입니다.");
                Thread.sleep(2000);
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
                main(null);
            }
            else throw new Exception("금액이 부족합니다 :(");
        }
        catch(Exception e){
            e.printStackTrace();
            Thread.sleep(2000);
            try {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            main(null);
        }

    }
}