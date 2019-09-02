package entry;

import java.sql.Date;

/**
 * 房源信息实体类
 * @author 
 *
 */
public class HouseSource {
	private int EATATE_ID; //楼盘ID
	private String EATATE_NAME;//楼盘名称
	private String ENTERPRISE_NAME;//开发企业
	private String PHONE;//电话
	private String BUILDING_NO;//预（现）售楼栋号
	private Date RECEIVE_METERIAL_TIME;//现场接受资料时间
	private Date PURPOSE_REGISTER_START_TIME;//意向登记开始时间
	private Date PURPOSE_REGISTER_END_TIME;//意向登记结束时间
	private int IDENTIFICATION_ID; //预（现）售证号
	private String RECEIVE_METERIAL_ADDRESS;//现场接受资料地点
	private Date LOTIERY_START_TIME;//摇号开始时间
	private Date LOTIERY_END_TIME;//摇号结束时间	
	private Date  SELECT_HOUSE_START_TIME;//选房开始时间
    private Date  SELECT_HOUSE_END_TIME;//选房结束时间
    private String ISPASS;//是否通过审核
	public int getEATATE_ID() {
		return EATATE_ID;
	}
	public void setEATATE_ID(int eATATE_ID) {
		EATATE_ID = eATATE_ID;
	}
	public String getISPASS() {
		return ISPASS;
	}
	public void setISPASS(String eISPASS) {
		ISPASS = eISPASS;
	}
	public String getEATATE_NAME() {
		return EATATE_NAME;
	}
	public void setEATATE_NAME(String eATATE_NAME) {
		EATATE_NAME = eATATE_NAME;
	}
	public String getENTERPRISE_NAME() {
		return ENTERPRISE_NAME;
	}
	public void setENTERPRISE_NAME(String eNTERPRISE_NAME) {
		ENTERPRISE_NAME = eNTERPRISE_NAME;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getBUILDING_NO() {
		return BUILDING_NO;
	}
	public void setBUILDING_NO(String bUILDING_NO) {
		BUILDING_NO = bUILDING_NO;
	}
	public Date getRECEIVE_METERIAL_TIME() {
		return RECEIVE_METERIAL_TIME;
	}
	public void setRECEIVE_METERIAL_TIME(Date rECEIVE_METERIAL_TIME) {
		RECEIVE_METERIAL_TIME = rECEIVE_METERIAL_TIME;
	}
	public Date getPURPOSE_REGISTER_START_TIME() {
		return PURPOSE_REGISTER_START_TIME;
	}
	public void setPURPOSE_REGISTER_START_TIME(Date pURPOSE_REGISTER_START_TIME) {
		PURPOSE_REGISTER_START_TIME = pURPOSE_REGISTER_START_TIME;
	}
	public Date getPURPOSE_REGISTER_END_TIME() {
		return PURPOSE_REGISTER_END_TIME;
	}
	public void setPURPOSE_REGISTER_END_TIME(Date pURPOSE_REGISTER_END_TIME) {
		PURPOSE_REGISTER_END_TIME = pURPOSE_REGISTER_END_TIME;
	}
	public int getIDENTIFICATION_ID() {
		return IDENTIFICATION_ID;
	}
	public void setIDENTIFICATION_ID(int iDENTIFICATION_ID) {
		IDENTIFICATION_ID = iDENTIFICATION_ID;
	}
	public String getRECEIVE_METERIAL_ADDRESS() {
		return RECEIVE_METERIAL_ADDRESS;
	}
	public void setRECEIVE_METERIAL_ADDRESS(String rECEIVE_METERIAL_ADDRESS) {
		RECEIVE_METERIAL_ADDRESS = rECEIVE_METERIAL_ADDRESS;
	}
	public Date getLOTIERY_START_TIME() {
		return LOTIERY_START_TIME;
	}
	public void setLOTIERY_START_TIME(Date lOTIERY_START_TIME) {
		LOTIERY_START_TIME = lOTIERY_START_TIME;
	}
	public Date getLOTIERY_END_TIME() {
		return LOTIERY_END_TIME;
	}
	public void setLOTIERY_END_TIME(Date lOTIERY_END_TIME) {
		LOTIERY_END_TIME = lOTIERY_END_TIME;
	}
	public Date getSELECT_HOUSE_START_TIME() {
		return SELECT_HOUSE_START_TIME;
	}
	public void setSELECT_HOUSE_START_TIME(Date sELECT_HOUSE_START_TIME) {
		SELECT_HOUSE_START_TIME = sELECT_HOUSE_START_TIME;
	}
	public Date getSELECT_HOUSE_END_TIME() {
		return SELECT_HOUSE_END_TIME;
	}
	public void setSELECT_HOUSE_END_TIME(Date sELECT_HOUSE_END_TIME) {
		SELECT_HOUSE_END_TIME = sELECT_HOUSE_END_TIME;
	}
	@Override
	public String toString() {
		return "HouseSource [EATATE_ID=" + EATATE_ID + ", EATATE_NAME=" + EATATE_NAME + ", ENTERPRISE_NAME="
				+ ENTERPRISE_NAME + ", PHONE=" + PHONE + ", BUILDING_NO=" + BUILDING_NO + ", RECEIVE_METERIAL_TIME="
				+ RECEIVE_METERIAL_TIME + ", PURPOSE_REGISTER_START_TIME=" + PURPOSE_REGISTER_START_TIME
				+ ", PURPOSE_REGISTER_END_TIME=" + PURPOSE_REGISTER_END_TIME + ", IDENTIFICATION_ID="
				+ IDENTIFICATION_ID + ", RECEIVE_METERIAL_ADDRESS=" + RECEIVE_METERIAL_ADDRESS + ", LOTIERY_START_TIME="
				+ LOTIERY_START_TIME + ", LOTIERY_END_TIME=" + LOTIERY_END_TIME + ", SELECT_HOUSE_START_TIME="
				+ SELECT_HOUSE_START_TIME + ", SELECT_HOUSE_END_TIME=" + SELECT_HOUSE_END_TIME + ", ISPASS=" + ISPASS
				+ ", getEATATE_ID()=" + getEATATE_ID() + ", getISPASS()=" + getISPASS() + ", getEATATE_NAME()="
				+ getEATATE_NAME() + ", getENTERPRISE_NAME()=" + getENTERPRISE_NAME() + ", getPHONE()=" + getPHONE()
				+ ", getBUILDING_NO()=" + getBUILDING_NO() + ", getRECEIVE_METERIAL_TIME()="
				+ getRECEIVE_METERIAL_TIME() + ", getPURPOSE_REGISTER_START_TIME()=" + getPURPOSE_REGISTER_START_TIME()
				+ ", getPURPOSE_REGISTER_END_TIME()=" + getPURPOSE_REGISTER_END_TIME() + ", getIDENTIFICATION_ID()="
				+ getIDENTIFICATION_ID() + ", getRECEIVE_METERIAL_ADDRESS()=" + getRECEIVE_METERIAL_ADDRESS()
				+ ", getLOTIERY_START_TIME()=" + getLOTIERY_START_TIME() + ", getLOTIERY_END_TIME()="
				+ getLOTIERY_END_TIME() + ", getSELECT_HOUSE_START_TIME()=" + getSELECT_HOUSE_START_TIME()
				+ ", getSELECT_HOUSE_END_TIME()=" + getSELECT_HOUSE_END_TIME() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
    
    


}
