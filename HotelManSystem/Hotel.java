package HotelManSystem;

public class Hotel{

    /**
     * 二维数组，酒店实体类
     */
    private Room[][] rooms;

    /**
     * 创建酒店房间
     */
    public Hotel() {
        /**
         * 创建一家三层十楼的酒店，第一层大床房，第二层标准间，第三层豪华套房。
         */
        rooms = new Room[3][10];

        /**
         * 创建三十个房间
         */
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                //第一层
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "大床房", Condition.ENABLE);
                    //第二层
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "大床房", Condition.ENABLE);
                } else if (i == 2) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "大床房", Condition.ENABLE);
                }
            }
        }
    }

    /**
     * 打印全部房间信息
     */
    public void print () {
        //遍历二维数组
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.println(room.toString());
            }
            System.out.println("\n");
        }
    }

    /**
     * 订房方法
     * @param roomNo 房间编号
     */
    public void order(int roomNo){
        //把房间状态改为DISABLE
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setCondition(Condition.DISANBLE);
    }

    /**
     * 订房方法
     * @param roomNo 房间编号
     */
    public void exit(int roomNo){
        //把房间状态改为DISABLE
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setCondition(Condition.ENABLE);
    }
}