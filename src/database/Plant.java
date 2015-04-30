package database;
import java.sql.Time;
import java.util.Date;


public class Plant {

	String name;
	String purchasedAt;
	Date purchaseDate;
	Time sowTime;
	Date sproutDate;
	String location;
	int grade;
	String information;
	String imagePath;

	public Plant(String name) {
		this.name = name;
		System.out.println("Mehehehe :3");
	}

	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setSowTime(Time sowTime) {
		this.sowTime = sowTime;
	}

	public void setSproutDate(Date sproutDate) {
		this.sproutDate = sproutDate;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setInformation(String information) {
		this.information = information;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public String getInformation() {
		return information;
	}
	
	public String getPurchasedAt() {
		return purchasedAt;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public Time getSowTime() {
		return sowTime;
	}

	public Date getSproutDate() {
		return sproutDate;
	}

	public String getLocation() {
		return location;
	}

	public int getGrade() {
		return grade;
	}

}
