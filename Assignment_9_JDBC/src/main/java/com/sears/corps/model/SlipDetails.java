/**
 * 
 */
package com.sears.corps.model;

/**
 * @author athora0
 *
 */
public class SlipDetails {
	private int slipId;
	private OwnerDetails ownerDetail;
	private MarinaDetails marinaDetail;

	/**
	 * @return the slipId
	 */
	public int getSlipId() {
		return slipId;
	}

	/**
	 * @param slipId
	 *            the slipId to set
	 */
	public void setSlipId(int slipId) {
		this.slipId = slipId;
	}

	/**
	 * @return the ownerDetail
	 */
	public OwnerDetails getOwnerDetail() {
		return ownerDetail;
	}

	/**
	 * @param ownerDetail
	 *            the ownerDetail to set
	 */
	public void setOwnerDetail(OwnerDetails ownerDetail) {
		this.ownerDetail = ownerDetail;
	}

	/**
	 * @return the marinaDetail
	 */
	public MarinaDetails getMarinaDetail() {
		return marinaDetail;
	}

	/**
	 * @param marinaDetail
	 *            the marinaDetail to set
	 */
	public void setMarinaDetail(MarinaDetails marinaDetail) {
		this.marinaDetail = marinaDetail;
	}

}
