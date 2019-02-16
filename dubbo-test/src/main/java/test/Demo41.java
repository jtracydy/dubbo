/*
*  2019 
*/
package test;

/**
 * @author wangdan Date: 2019/1/31 Time: 15:04
 * @version $Id$
 */
public class Demo41 {

    public static void main(String[] args) {

    }
}

interface Ctrip{
    void apply();
}

enum ReviewSyncStatus {
    DO_NOT_SYNC(-1, "不要进行同步操作"),
    SYNC_DONE(0, "同步完成"),
    NEED_INSERT(1, "插入"),
    NEED_UPDATE(2, "更新"),
    NEED_DELETE(3, "删除");

    private int code;

    private String desc;

    ReviewSyncStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ReviewSyncStatus getByCode(int code) {
        for (ReviewSyncStatus status : ReviewSyncStatus.values()) {
            if (code == status.getCode()) {
                return status;
            }
        }

        throw new IllegalArgumentException("Unknown ReviewSyncStatus code : " + code);
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
