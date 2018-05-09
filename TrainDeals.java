/**
 * This static class manages the current deal prices for different types of tickets
 * for trains.
 * 
 * @author ISU Professor
 *
 */
public class TrainDeals
{
	private static final double COACH_PRICE = 12.50;
	private static final double SLEEPER_PRICE = 35;
	
	/**
	 * This method returns the current deal price for a train ticket
	 * for either the coach seat or the sleeper section.
	 * 
	 * @param ticketType code for the type of seat/section on the train
	 * @return returns the price of current deal on the type of train seat
	 */
	public static double getTicketPrice(char ticketType)
	{
		if(ticketType == 'C' || ticketType == 'c')
		{
			return COACH_PRICE;
		}
		else 
		{
			return SLEEPER_PRICE;
		}
	}
}
