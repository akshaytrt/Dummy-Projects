/**
 * 
 */
package com.sears.corps;

import java.util.Date;

/**
 * @author athora0
 *
 */
public interface OffersDetails {
	public double getPercentDiscount();

	public void setPercentDiscount(double percentDiscount);

	public Date getStartDate();

	public void setStartDate(Date startDate);

	public Date getEndDate();

	public void setEndDate(Date endDate);

}
