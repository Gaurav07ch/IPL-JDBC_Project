package Service;

import java.util.ArrayList;
import java.util.List;
import Dao.Dao;
import Entity.IPLPLayer;

public class Service {
	Dao dao = null;

	public List<IPLPLayer> getAllPlayer() {

//		System.out.println("we are in getAllPlayer( Service -> getAllPlayer");
		dao = new Dao();

		List<IPLPLayer> allPlayer = dao.getAllPlayer();

		for (IPLPLayer iplpLayer : allPlayer) {
			System.out.println(iplpLayer);
		}
		return allPlayer;
	}

	public List<IPLPLayer> getcskallplyers() {
		dao = new Dao();

		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> cskplayer = new ArrayList<IPLPLayer>();
		for (IPLPLayer cskpLayer : allPlayer) {
			if (cskpLayer.getTeamnm().equals("CSK")) {
				cskplayer.add(cskpLayer);
			}
		}
		return cskplayer;
	}

	public List<IPLPLayer> getallPlayerabove5000runs() {
		dao = new Dao();

		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> above5000player = new ArrayList<IPLPLayer>();
		for (IPLPLayer above5000player1 : allPlayer) {
			if(above5000player1.getRuns() > 5000) {
				above5000player.add(above5000player1);
			}
		}

		return above5000player;
	}
	
	public List<IPLPLayer> getallPlayerbelow5000runs() {
		dao = new Dao();

		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> below5000player = new ArrayList<IPLPLayer>();
		for (IPLPLayer below5000player1 : allPlayer) {
			if(below5000player1.getRuns() < 5000) {
				below5000player.add(below5000player1);
			}
		}

		return below5000player;
	}

	public List<IPLPLayer> getallPlayerabove5wickets() {
		dao = new Dao();
		
		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> above5player = new ArrayList<IPLPLayer>();
		for (IPLPLayer above5player1 : allPlayer) {
			if(above5player1.getWickets() > 5) {
				above5player.add(above5player1);
			}
		}
		return above5player;
	}

	public List<IPLPLayer> getallPlayerbelow5wickets() {
        dao = new Dao();
		
		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> below5player = new ArrayList<IPLPLayer>();
		for (IPLPLayer below5player1 : allPlayer) {
			if(below5player1.getWickets() < 5) {
				below5player.add(below5player1);
			}
		}
		return below5player;
	}

	public List<IPLPLayer> getallPlayerbelow20jer() {
		 dao = new Dao();
			
			List<IPLPLayer> allPlayer = dao.getAllPlayer();
			List<IPLPLayer> below20player = new ArrayList<IPLPLayer>();
			for (IPLPLayer below20player1 : allPlayer) {
				if(below20player1.getJern() < 20) {
					below20player.add(below20player1);
				}
			}
			return below20player;
	}

	public List<IPLPLayer> getallPlayerabove20jer() {
		dao = new Dao();
		
		List<IPLPLayer> allPlayer = dao.getAllPlayer();
		List<IPLPLayer> above20player = new ArrayList<IPLPLayer>();
		for (IPLPLayer above20player1 : allPlayer) {
			if(above20player1.getJern() > 20) {
				above20player.add(above20player1);
			}
		}
		return above20player;
	}
	
	public void insertDB() {
		dao = new Dao();
		dao.InsertIPLPLayer();
	}

}
