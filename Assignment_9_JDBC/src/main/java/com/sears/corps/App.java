package com.sears.corps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sears.corps.dao.SlipDetailsDao;
import com.sears.corps.fileRead.CSVReader;
import com.sears.corps.helper.ApplicationConstants;
import com.sears.corps.model.Category;
import com.sears.corps.model.MarinaDetails;
import com.sears.corps.model.OwnerDetails;
import com.sears.corps.model.ServiceDetails;
import com.sears.corps.model.SlipDetails;
import com.sears.corps.services.CategoryService;
import com.sears.corps.services.LocationService;
import com.sears.corps.services.MarinaService;
import com.sears.corps.services.OwnerDetailsService;
import com.sears.corps.services.ServicesDetailsService;
import com.sears.corps.services.SlipDetailsService;
import com.sears.corps.services.impl.CategoryImpl;
import com.sears.corps.services.impl.LocationImpl;
import com.sears.corps.services.impl.MarinaImpl;
import com.sears.corps.services.impl.OwnerDetailsImpl;
import com.sears.corps.services.impl.ServicesDetailsImpl;
import com.sears.corps.services.impl.SlipDetailsImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ch = 0;
		while (ch < 4) {
			System.out.println("1.Add data to master tables");
			System.out.println("2.Get the details of owner");
			System.out.println("3.Generate work order");
			System.out.println("Enter yor choice");
			ch = Integer.parseInt(in.nextLine());
			switch (ch) {
			case 1:
				new App().addMasterData();
				break;
			case 2:
				new App().createWorkOrder();
				break;

			case 3:
				System.out.println("Enter the owner number: ");
				int number=Integer.parseInt(in.nextLine());
				SlipDetailsService slipDetailsService = new SlipDetailsImpl();
				slipDetailsService.getSlipDetails(number);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}

		}

	}

	private void createWorkOrder() {
		OwnerDetails ownerDetails = new OwnerDetails();
		MarinaDetails marinaDetails = new MarinaDetails();
		SlipDetails slipDetails = new SlipDetails();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter owner number ");
		ownerDetails.setOwnerNum(Integer.parseInt(in.nextLine()));
		System.out.println("Enter the marina number ");
		marinaDetails.setMarinaNum(Integer.parseInt(in.nextLine()));
		slipDetails.setMarinaDetail(marinaDetails);
		slipDetails.setOwnerDetail(ownerDetails);

		SlipDetailsService slipDetailsService = new SlipDetailsImpl();
		int slipId = slipDetailsService.insertData(slipDetails);
		slipDetails.setSlipId(slipId);

		Category category = new Category();
		ServiceDetails serviceDetails = new ServiceDetails();
		System.out.println("Enter the category number: ");
		category.setCategoryNum(Integer.parseInt(in.nextLine()));
		serviceDetails.setCategory(category);
		System.out.println("Enter the job description: ");
		serviceDetails.setJobDesc(in.nextLine());
		System.out.println("Enter estimated hours: ");
		serviceDetails.setEstimatedHrs(Integer.parseInt(in.nextLine()));
		System.out.println("Enter next service date (YYYY-MM-DD)");
		serviceDetails.setNextServiceDate(in.nextLine());
		serviceDetails.setSlipDetail(slipDetails);

		ServicesDetailsService servicesDetailsService = new ServicesDetailsImpl();
		servicesDetailsService.insertData(serviceDetails);
	}

	private void addMasterData() {
		CSVReader csvFileReader = new CSVReader();
		List<String[]> resultList = new ArrayList<String[]>();

		resultList = csvFileReader.getCSVData(ApplicationConstants.LOCATION_PATH);
		LocationService locationService = new LocationImpl();
		locationService.insertData(resultList);

		resultList.clear();
		resultList = csvFileReader.getCSVData(ApplicationConstants.CATEGORIES_PATH);
		CategoryService categoriesService = new CategoryImpl();
		categoriesService.insertData(resultList);

		resultList.clear();
		resultList = csvFileReader.getCSVData(ApplicationConstants.MARINA_DETAILS_PATH);
		MarinaService marinaService = new MarinaImpl();
		marinaService.insertData(resultList);

		resultList.clear();
		resultList = csvFileReader.getCSVData(ApplicationConstants.OWNER_DETAILS_PATH);
		OwnerDetailsService ownerDetailsService = new OwnerDetailsImpl();
		ownerDetailsService.insertData(resultList);

		/*
		 * resultList.clear();
		 * resultList=csvFileReader.getCSVData(ApplicationConstants.
		 * SLIP_DETAILS_PATH); SlipDetailsService slipDetailsService=new
		 * SlipDetailsImpl(); slipDetailsService.insertData(resultList);
		 * 
		 * resultList.clear();
		 * resultList=csvFileReader.getCSVData(ApplicationConstants.
		 * SERVICES_PATH); ServicesDetailsService servicesDetailsService=new
		 * ServicesDetailsImpl(); servicesDetailsService.insertData(resultList);
		 */

	}

}
