

public class calcHand {
	
	public int rate_hand(Hand hand) {

		if( suit1 == suit2 && suit2 == suit3 && suit3 == suit4 && suit4 == suit5){

			//CONDITION: User has a straight flush
			if ( high1 == (high2 + 1) && high2 == (high3 + 1) && high3 == (high4 + 1) && high4 == (high5 + 1)){
				result = "Stright Flush";
				if ( high1 = 10 && high2 == 11 && high3 == 12 && high4 == 13 && high5 == 1){
					result = "Royal Flush";
				}
			}
			// CONDITION: User does not have straight
			else{
				result = "Flush";
			}
		}
		// CONDITION: User does not have flush, but has straight
		else if (( high1 == (high2 + 1) && high2 == (high3 + 1) && high3 == (high4 + 1) && high4 == (high5 + 1))){
			result = "Straight";
		}
		// CONDITION: User has pair or pairs
		else if ( card1 == (card1 || card2 || card3 || card4 || card5 || card6 || card7 || card8 || card9){
			if (pair == 1){
				result = "Two of a Kind";
			}
			else if (pair == 2){
				result = " Three of Kind";
			}
			else{
				result = "Four of a Kind";
			}
		}
		else{
			result = "High Card";
		}
	return 0;
}
