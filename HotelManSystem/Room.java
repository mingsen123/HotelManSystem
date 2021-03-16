package HotelManSystem;

import java.util.Objects;

/**
 * 房间实体类
 */
public class Room {

    /**
     * 房间编号
     */
    private int roomId;

    /**
     * 房间类型
     */
    private String roomType;

    /**
     * 房间状态（是否被订）
     */
    private Condition condition;

    //无参构造方法
    public Room() {
    }

    //有参构造方法
    public Room(int roomId, String roomType, Condition condition) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.condition = condition;
    }

    /**
     * gey & set 方法
     * @return
     */
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId == room.roomId && Objects.equals(roomType, room.roomType) && condition == room.condition;
    }

    @Override
    public String toString() {
        return "房间编号：" + roomId + "，房间类型：" + roomType +"，房间状态：" + condition;
    }
}
