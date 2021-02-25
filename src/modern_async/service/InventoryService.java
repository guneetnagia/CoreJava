package modern_async.service;

import java.util.concurrent.CompletableFuture;

import modern_async.domain.Inventory;
import modern_async.domain.ProductOption;
import modern_async.util.CommonUtil;

public class InventoryService {
	public Inventory addInventory(ProductOption productOption) {
        CommonUtil.delay(500);
        Inventory inv = new Inventory(2);
        return inv;
    }

    public CompletableFuture<Inventory> addInventory_CF(ProductOption productOption) {
        return CompletableFuture.supplyAsync(() -> {
            CommonUtil.delay(500);
            Inventory inv = new Inventory(2);
            return inv;
        });

    }
}
