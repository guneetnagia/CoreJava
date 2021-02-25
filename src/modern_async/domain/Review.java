package modern_async.domain;

public class Review {
	private int noOfReviews;
	private double overallRating;
	public int getNoOfReviews() {
		return noOfReviews;
	}
	public void setNoOfReviews(int noOfReviews) {
		this.noOfReviews = noOfReviews;
	}
	public double getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
	}
	public Review(int noOfReviews, double overallRating) {
		super();
		this.noOfReviews = noOfReviews;
		this.overallRating = overallRating;
	}
	public Review() {
		super();
	}
	
	
}
