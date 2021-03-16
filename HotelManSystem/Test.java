package HotelManSystem;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        while (true){
            System.out.println("欢迎使用酒店管理系统，请认真阅读以下说明：");

            System.out.println("请输入功能编号：【1】表示查看房间列表。【2】表示订房。【3】表示退房");

            Scanner scanner = new Scanner(System.in);

            System.out.println("请出入功能编号：");
            int i = scanner.nextInt();

            if(i == 1){
                //查看房间列表
                hotel.print();
            }else if(i == 2){
                //订房
                System.out.println("请输入房间编号：");
                int roomId = scanner.nextInt();
                hotel.order(roomId);
            }else if(i == 3){
                //退房
                System.out.println("请输入房间编号：");
                int roomId = scanner.nextInt();
                hotel.exit(roomId);
            }else if(i == 0){
                //推出系统
                System.out.println("欢迎下次使用，再见！");
                return;
            }else {
                //报错
                System.out.println("输入的编号有误，请重新输入");
            }
        }

    }
}
