package modern_async.domain;

import java.util.List;

public class ProductInfo {
	private String productId;
	private List<ProductOption> productOptions;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<ProductOption> getProductOptions() {
		return productOptions;
	}
	public void setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}
	public ProductInfo(String productId, List<ProductOption> productOptions) {
		super();
		this.productId = productId;
		this.productOptions = productOptions;
	}
	public ProductInfo() {
		super();
	}
	
	
}
