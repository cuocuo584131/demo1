package demo1;

import java.io.Serializable;
import java.util.Date;

public class EveryDayDetailsDO implements Serializable{

	private static final long serialVersionUID = 1L;

	/*
	 * �ϰ����
	 */
	private Date workDay;
	
	/*
	 * �°����
	 */
	private Date afterWorkDay;
	
	/*
	 * ������
	 */
	private String holidy;
	
	/*
	 * �ٵ����˿���
	 */
	private String late;
	
	/*
	 * ©������
	 */
	private String forgetCard;

	public Date getWorkDay() {
		return workDay;
	}

	public void setWorkDay(Date workDay) {
		this.workDay = workDay;
	}

	public Date getAfterWorkDay() {
		return afterWorkDay;
	}

	public void setAfterWorkDay(Date afterWorkDay) {
		this.afterWorkDay = afterWorkDay;
	}

	public String getHolidy() {
		return holidy;
	}

	public void setHolidy(String holidy) {
		this.holidy = holidy;
	}

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	public String getForgetCard() {
		return forgetCard;
	}

	public void setForgetCard(String forgetCard) {
		this.forgetCard = forgetCard;
	}
	
	
	
	
}
