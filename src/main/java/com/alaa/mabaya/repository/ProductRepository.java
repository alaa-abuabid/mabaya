package com.alaa.mabaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alaa.mabaya.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value="SELECT * FROM product INNER JOIN campaign ON product.seller_id=campaign.seller_id where campaign.status='active' and category=:category order by campaign.bid DESC limit 1", nativeQuery = true)
	Product  adWithCategoryHighestCampaignBid(@Param("category") String category);
	
	@Query(value="SELECT * FROM product INNER JOIN campaign ON product.seller_id=campaign.seller_id where campaign.status='active' order by campaign.bid DESC limit 1", nativeQuery = true)
	Product  adWithHighestCampaignBid();
}





