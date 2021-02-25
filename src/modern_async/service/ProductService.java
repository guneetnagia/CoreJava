package modern_async.service;

import modern_async.domain.Product;
import modern_async.domain.ProductInfo;
import modern_async.domain.Review;

public class ProductService {
	private ProductServiceInfo productServiceInfo;
    private ReviewService reviewService;
    
    public ProductService(ProductServiceInfo productServiceInfo, ReviewService reviewService) {
        this.productServiceInfo = productServiceInfo;
        this.reviewService = reviewService;
    }
    
    public Product retrieveProductDetails(String productId) {
    	long start_time = System.currentTimeMillis();
    	ProductInfo productInfo = productServiceInfo.retrieveProductInfo(productId);
    	Review review = reviewService.retrieveReviews(productId);
    	long end_time = System.currentTimeMillis();
    	System.out.println("total time taken " + (end_time-start_time));
    	return new Product(productId, productInfo, review);
    }
    
	public static void main(String args[]){
		ProductServiceInfo productInfoService = new ProductServiceInfo();
        ReviewService reviewService = new ReviewService();
        ProductService productService = new ProductService(productInfoService, reviewService);
        String productId = "ABC123";
        Product product = productService.retrieveProductDetails(productId);
        System.out.println("Product is " + product);
	}
}
