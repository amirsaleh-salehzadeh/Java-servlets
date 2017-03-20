/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

import java.sql.Date;

/**
 *
 * @author Amirsaleh
 */
public class reserveENT {
private Date fromDate;
 private Date toDate;
 private String userName;
 private int roomId;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
