package com.products.promotions.services.impl;


import com.products.promotions.model.Product;
import com.products.promotions.model.Promotion;
import com.products.promotions.services.PromotionService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements PromotionService {

	@Override
	public List<Promotion> calculatePromotions(List<Product> products, String clientType) {
		List<Promotion> discounts = new ArrayList<>();

		int discountX=0;
		int discountY=0;
		boolean hasProductA = false;
		int productBCCount = 0;
		int productDCount = 0;

		// Iterate through products to count occurrences
		for (Product product : products) {
			switch (product.getId()) {
				case "A":
					hasProductA = true;
					break;
				case "B":
				case "C":
					productBCCount++;
					break;
				case "D":
					productDCount++;
					break;
				default:
					break;
			}
		}

		// Applying business rules to count discounts
		if(hasProductA){
			if(productBCCount==0){
				if (productDCount==1) {
					discountY=+productDCount;
				}else {
					discountY=+productDCount;
				}
			}
			if(productBCCount==1){
				if (productDCount==0) {
					discountX=+productBCCount;
				}else if (productDCount==1){
					discountX=+productBCCount;
					discountY=+productDCount;
				}else{
					discountX=+productBCCount;
					discountY=+productDCount;
				}

			}
			if(productBCCount>1){
				if (productDCount==0) {
					discountX=+productBCCount;
				}else if (productDCount==1){
					discountX=+productBCCount;
					discountY=+productDCount;
				}else{
					discountX=+productBCCount;
					discountY=+productDCount;
				}
			}
		}else{
			if(productBCCount>1){
				discountX=+productBCCount;
			}
		}

		discounts.add(new Promotion("X",discountX));
		discounts.add(new Promotion("Y",discountY));
		return discounts;
	}
	}

