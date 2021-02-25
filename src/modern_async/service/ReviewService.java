package modern_async.service;

import modern_async.domain.Review;
import modern_async.util.CommonUtil;

public class ReviewService {
	public Review retrieveReviews(String productId){
		CommonUtil.delay(1000);
		return new Review(200,4.5);
	}
}
