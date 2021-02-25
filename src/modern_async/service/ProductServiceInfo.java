package modern_async.service;

import java.util.Arrays;
import java.util.List;

import modern_async.domain.ProductInfo;
import modern_async.domain.ProductOption;
import modern_async.util.CommonUtil;

public class ProductServiceInfo {
	public ProductInfo retrieveProductInfo(String productId){
		CommonUtil.delay(1000);
		
		List<ProductOption> productOptions = Arrays.asList(new ProductOption(1, "64GB", "Black", 699.99),
				new ProductOption(1, "128GB", "Black", 749.99));
		
		ProductInfo pi = new ProductInfo(productId, productOptions);
		return pi;
	}

}
