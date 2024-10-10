package Entity;

public class IPLPLayer {
	private int jersn;
	private String name;
	private int runs;
	private int wickets;
	private String tname;
	
	public IPLPLayer() {
		super();
	}

	public IPLPLayer(int jern, String name, int runs, int wickets, String tname) {
		super();
		this.jersn = jern;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}

	public int getJern() {
		return jersn;
	}

	public void setJern(int jern) {
		this.jersn = jern;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTeamnm() {
		return tname;
	}

	public void setTeamnm(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "IPLPLayer [jern=" + jersn + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", teamnm="
				+ tname + "]";
	}
	
	
}
