/**
 * This class manages the current deal prices for tickets from point of origin to destination cities.
 * 
 * @author ISU Professor
 *
 */
public class AirplaneDeals
{
	
	/**
	 * This method accepts the city of origin and the city of destination 
	 * and returns the current deal price for a one-way trip.
	 * 
	 * @param origin city where the ticket holder will board the plane
	 * @param destination city where the ticket holder is going to
	 * @return price of the ticket for the one way trip
	 */
	public static double getTicketPrice(String origin, String destination)
	{
		double cost = 0;
		
		if (origin.equalsIgnoreCase("BLM") && destination.equalsIgnoreCase("CHI"))
			cost = 243.25;
		else if (origin.equalsIgnoreCase("CHI") && destination.equalsIgnoreCase("YVR"))
			cost = 630.00;
		else if (origin.equalsIgnoreCase("LAX") && destination.equalsIgnoreCase("CHI"))
			cost = 458.50;
		else 
			cost = 265.45;
		return cost;
	}
}
