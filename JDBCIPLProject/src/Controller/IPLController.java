package Controller;

import java.util.List;

import Entity.IPLPLayer;
import Service.Service;

public class IPLController {

	Service service = null;

	public List<IPLPLayer> getAllPlayer() {
//		System.out.println("we are ingetAllPlayer( IPLController -> getAllPlayer");

		service = new Service();
		List<IPLPLayer> allPlayer = service.getAllPlayer();

		return allPlayer;
	}

	public List<IPLPLayer> getcskallplyers() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getcskallplyers();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerabove5000runs() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerabove5000runs();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerbelow5000runs() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerbelow5000runs();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerabove5wickets() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerabove5wickets();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerbelow5wickets() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerbelow5wickets();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerbelow20jer() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerbelow20jer();
		return allPlayer;
	}

	public List<IPLPLayer> getallPlayerabove20jer() {
		service = new Service();
		List<IPLPLayer> allPlayer = service.getallPlayerabove20jer();
		return allPlayer;
	}
	
	public void insertplayer() {
		service = new Service();
		service.insertDB();
	}
}
