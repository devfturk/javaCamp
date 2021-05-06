package Entities;

public class Game {
	private int id;
	private String name;
	private double gamePrice;
	private String category;
	
	public Game() {
	}

	public Game(int id, String name, double gamePrice, String category) {
		
		this.id = id;
		this.name = name;
		this.gamePrice = gamePrice;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
}
