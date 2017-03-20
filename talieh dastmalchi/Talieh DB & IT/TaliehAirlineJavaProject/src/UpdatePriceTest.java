import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdatePriceTest {
	public void updateBooking() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/taliehairline", "root", "root");
            String sql= "SELECT  flight.`Date`, flight.`Time`, flight.FlightNumber, `booking`.`BookingID`,`booking`.`TotalPrice`"+
            			"FROM flight INNER JOIN flightavailability ON (flight.FlightID = flightavailability.FlightID), `booking`" +
            			"WHERE `booking`.`FlightAvailabilityID` = `flightavailability`.`FlightAvailabilityID` AND flight.`date` > ' 2005-12-31'";
            Statement stmt=con.createStatement();
            PreparedStatement ps = null;
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
            	sql="UPDATE `booking` SET TotalPrice = ? WHERE BookingID = ?";
            	int price = rs.getInt("TotalPrice");
            	price = price - (price * 10/100);
            	ps = con.prepareStatement(sql);
            	ps.setInt(1, price);
            	ps.setInt(2, rs.getInt("BookingID"));
                ps.execute();
            }
            
            
            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                }
    }
	public static void main(String[] args) {
		UpdatePriceTest priceTest = new UpdatePriceTest();
		priceTest.updateBooking();
	}
}
