/**
 * 
 */
package com.sears.corps.model;

/**
 * @author athora0
 *
 */
public class ServiceDetails {
	private int serviceId;
	private SlipDetails slipDetail;
	private Category category;
	private String jobDesc;
	private int estimatedHrs;
	private String nextServiceDate;

	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @return the slipDetail
	 */
	public SlipDetails getSlipDetail() {
		return slipDetail;
	}

	/**
	 * @param slipDetail
	 *            the slipDetail to set
	 */
	public void setSlipDetail(SlipDetails slipDetail) {
		this.slipDetail = slipDetail;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param jobDesc
	 *            the jobDesc to set
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	/**
	 * @return the estimatedHrs
	 */
	public int getEstimatedHrs() {
		return estimatedHrs;
	}

	/**
	 * @param estimatedHrs
	 *            the estimatedHrs to set
	 */
	public void setEstimatedHrs(int estimatedHrs) {
		this.estimatedHrs = estimatedHrs;
	}

	/**
	 * @return the nextServiceDate
	 */
	public String getNextServiceDate() {
		return nextServiceDate;
	}

	/**
	 * @param nextServiceDate
	 *            the nextServiceDate to set
	 */
	public void setNextServiceDate(String nextServiceDate) {
		this.nextServiceDate = nextServiceDate;
	}

}
