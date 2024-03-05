package user;

public class Game {
    private int gameId;
    private String gameName;
    private String gameCategory;
    private double fileSize;
    private String image;
    
	public Game(int gameId, String gameName, String gameCategory, double fileSize, String image) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.fileSize = fileSize;
		this.image = image;
	}
	
	public int getGameId() {
		return gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public double getFileSize() {
		return fileSize;
	}
	public String getImage() {
		return image;
	}	
}
