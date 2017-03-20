/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.sql.Date;

/**
 *
 * @author Amirsaleh
 */
public class bookENT {
private Date sDate;
 private Date eDate;
 private int userId;
 private int roomId;

    public Date getSDate() {
        return sDate;
    }

    public void setSDate(Date sDate) {
        this.sDate = sDate;
    }

    public Date getEDate() {
        return eDate;
    }

    public void setEDate(Date eDate) {
        this.eDate = eDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
