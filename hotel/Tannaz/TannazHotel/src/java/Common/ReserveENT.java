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
public class ReserveENT {
 private Date sDate;
 private Date eDate;
 private int numOfBeds;
 private String roomType;
 private int roomId;
 
 private int id;        
 

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

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getUserId() {
        return id;
    }

    public void setUserId(int id) {
        this.id = id;
    }
 
 
}
