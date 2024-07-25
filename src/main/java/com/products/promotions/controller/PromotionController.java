package com.products.promotions.controller;

import com.products.promotions.model.Promotion;
import com.products.promotions.model.PromotionRequest;
import com.products.promotions.services.PromotionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/promotions")
public class PromotionController {

	@Autowired
	private PromotionService promotionService;

	@GetMapping("/welcome")
	public String getWelcome(){
		return "Welcome";
	}
	@PostMapping("/calculate")
	public ResponseEntity<List<Promotion>> calculatePromotions(@RequestBody PromotionRequest request) {
		List<Promotion> promotions = promotionService.calculatePromotions(request.getProducts(), request.getClientType());
		return ResponseEntity.ok(promotions);
	}

}
