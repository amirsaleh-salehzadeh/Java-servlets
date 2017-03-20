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
public class TicketENT {
    private String interval;
    private String userName;
    private String filmName;
    private Date date;
    private int numOfTickets;
    private MovieENT movieENT = new MovieENT();

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public MovieENT getMovieENT() {
        return movieENT;
    }

    public void setMovieENT(MovieENT movieENT) {
        this.movieENT = movieENT;
    }
}
