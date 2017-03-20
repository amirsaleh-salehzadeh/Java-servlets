/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

/**
 *
 * @author Amirsaleh
 */
public class roomENT {
private int roomId;
private int price;
private int availabile;
private int numOfBeds;
private String image;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailabile() {
        return availabile;
    }

    public void setAvailabile(int availabile) {
        this.availabile = availabile;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
