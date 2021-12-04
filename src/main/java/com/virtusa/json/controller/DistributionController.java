package com.virtusa.json.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.json.model.DistributionPipeline;
import com.virtusa.json.model.FacilityDistributionPipeline;
import com.virtusa.json.model.FeeRecognition;
import com.virtusa.json.model.Investors;

@RestController
public class DistributionController {

	@RequestMapping("/addvalues")
	public DistributionPipeline addpipeline() {
		
		DistributionPipeline distributionpipeline = new DistributionPipeline();
		
		FeeRecognition feerecognition = new FeeRecognition();
		
		List<FeeRecognition> feerecognitionList = new ArrayList<FeeRecognition>();
		feerecognitionList.add(feerecognition);
		Investors investors = new Investors();
		investors.setFeerecognition(feerecognitionList);
		
		List<Investors> investorslist = new ArrayList<Investors>();
		investorslist.add(investors);
		distributionpipeline.setInvestors(investorslist);
		
		
		FacilityDistributionPipeline facilitydistributionpipeline = new FacilityDistributionPipeline();
		List<FacilityDistributionPipeline> facilitydistributionpipelinelist = new ArrayList<FacilityDistributionPipeline>();
		facilitydistributionpipelinelist.add(facilitydistributionpipeline);
		
		distributionpipeline.setFacilitydistributionpipeline(facilitydistributionpipelinelist);
		
		return distributionpipeline;
	}
	
	
	
	
}
