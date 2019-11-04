package com.alaa.mabaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alaa.mabaya.model.Campaign;

@Repository
public interface CampaignRespository extends JpaRepository<Campaign, Integer>{

	Campaign findFirst1ByOrderByIdDesc();

}
