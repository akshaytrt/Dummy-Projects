/**
 * 
 */
package com.sears.corps;

import java.util.Date;

/**
 * @author athora0
 *
 */
public class CategoriesOffers implements OffersDetails {
	private double percentDiscount;
	private Date startDate;
	private Date endDate;

	public double getPercentDiscount() {
		return percentDiscount;
	}

	public void setPercentDiscount(double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
