package Clients;

import java.util.List;
import Controller.IPLController;
import Entity.IPLPLayer;

public class IPLClients {

	public static void main(String[] args) {

		IPLController c1 = new IPLController();
		System.err.println("****************ALL Players*******************************");
		List<IPLPLayer> allPlayer = c1.getAllPlayer();

		List<IPLPLayer> cskplayer = c1.getcskallplyers();
		System.err.println("**************ALL Players CSK******************************");

		for (IPLPLayer csk : cskplayer) {
			System.out.println(csk);
		}

		List<IPLPLayer> above5000player = c1.getallPlayerabove5000runs();
		System.err.println("****************ALL Players 5000 above***********************");

		for (IPLPLayer high5000 : above5000player) {
			System.out.println(high5000);
		}

		List<IPLPLayer> below5000player = c1.getallPlayerbelow5000runs();
		System.err.println("**************ALL Players 5000 below***********************");

		for (IPLPLayer low5000 : below5000player) {
			System.out.println(low5000);
		}
		
		List<IPLPLayer> abovewickets5 = c1.getallPlayerabove5wickets();
		System.err.println("***************ALL Player above 5 wickets*******************************");

		for (IPLPLayer all5 : abovewickets5) {
			System.out.println(all5);
		}
		
		List<IPLPLayer> belowwickets5 = c1.getallPlayerbelow5wickets();
		System.err.println("***************ALL Player below 5 wickets*******************************");

		for (IPLPLayer all5 : belowwickets5) {
			System.out.println(all5);
		}

		List<IPLPLayer> jersey20below = c1.getallPlayerbelow20jer();
		System.err.println("***************ALL Player below 20 jersey*******************************");

		for (IPLPLayer all5 : jersey20below) {
			System.out.println(all5);
		}
		
		List<IPLPLayer> jersey20above = c1.getallPlayerabove20jer();
		System.err.println("***************ALL Player above 5 wickets*******************************");

		for (IPLPLayer all5 : jersey20above) {
			System.out.println(all5);
		}
		
		c1.insertplayer();
	}
}