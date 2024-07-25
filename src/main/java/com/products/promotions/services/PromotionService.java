package com.products.promotions.services;


import com.products.promotions.model.Product;
import com.products.promotions.model.Promotion;
import java.util.List;

public interface PromotionService {
	List<Promotion> calculatePromotions(List<Product> products, String clientType);
}
