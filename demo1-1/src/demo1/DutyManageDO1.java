package demo1;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DutyManageDO1 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String telCom;
	
	private String area;
	
	private String depart;
	
	private String group;
	
	private String userId;
	
	private String name;
	
	private String tsaleGradeName;
	
	private String tsaleState;
	
	private Date outWorkDate;
	
	/*
	 * ����ʵ�ʳ�������
	 */
	private String monthRealDutyDay;
	
	/*
	 * �ٵ������� �������ϼ�
	 */
	private String lateDay;
	
	/*
	 * ��н��������
	 */
	private String withSalaryHolidy;
	
	/*
	 * ����Ӧ���ڹ���������
	 */
	private String dutyDay;
	
	/*
	 * ���·�����������
	 */
	private String holidyDay;
	
	/*
	 * ©�������ϼ�
	 */
	private String forgetCard;
	
	/*
	 * ���������ϼ�
	 */
	private String neglectWork;
	
	/*
	 * �Ǵ�н���������ϼ�
	 */
	private String withoutSalaryHolidy;
	
	/*
	 * �ͷ����¼������ϼ�
	 */
	private String punishedDay;
	
	/*
	 * �¼������ϼ�
	 */
	private String absenceDay;
	
	/*
	 * �ͷ����¼�1���ٵ�������30���ӵ�3Сʱ��
	 */
	private String punishedDayOne;
	
	/*
	 * �ͷ����¼�2���ٵ�������3Сʱ���ϣ�
	 */
	private String punishedDayTwo;
	
	/*
	 * �ɱ�����
	 */
	private List<EveryDayDetailsDO> days;

	public String getTelCom() {
		return telCom;
	}

	public void setTelCom(String telCom) {
		this.telCom = telCom;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTsaleGradeName() {
		return tsaleGradeName;
	}

	public void setTsaleGradeName(String tsaleGradeName) {
		this.tsaleGradeName = tsaleGradeName;
	}

	public String getTsaleState() {
		return tsaleState;
	}

	public void setTsaleState(String tsaleState) {
		this.tsaleState = tsaleState;
	}

	public Date getOutWorkDate() {
		return outWorkDate;
	}

	public void setOutWorkDate(Date outWorkDate) {
		this.outWorkDate = outWorkDate;
	}

	public String getMonthRealDutyDay() {
		return monthRealDutyDay;
	}

	public void setMonthRealDutyDay(String monthRealDutyDay) {
		this.monthRealDutyDay = monthRealDutyDay;
	}

	public String getLateDay() {
		return lateDay;
	}

	public void setLateDay(String lateDay) {
		this.lateDay = lateDay;
	}

	public String getWithSalaryHolidy() {
		return withSalaryHolidy;
	}

	public void setWithSalaryHolidy(String withSalaryHolidy) {
		this.withSalaryHolidy = withSalaryHolidy;
	}

	public String getDutyDay() {
		return dutyDay;
	}

	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay;
	}

	public String getHolidyDay() {
		return holidyDay;
	}

	public void setHolidyDay(String holidyDay) {
		this.holidyDay = holidyDay;
	}

	public String getForgetCard() {
		return forgetCard;
	}

	public void setForgetCard(String forgetCard) {
		this.forgetCard = forgetCard;
	}

	public String getNeglectWork() {
		return neglectWork;
	}

	public void setNeglectWork(String neglectWork) {
		this.neglectWork = neglectWork;
	}

	public String getWithoutSalaryHolidy() {
		return withoutSalaryHolidy;
	}

	public void setWithoutSalaryHolidy(String withoutSalaryHolidy) {
		this.withoutSalaryHolidy = withoutSalaryHolidy;
	}

	public String getPunishedDay() {
		return punishedDay;
	}

	public void setPunishedDay(String punishedDay) {
		this.punishedDay = punishedDay;
	}

	public String getAbsenceDay() {
		return absenceDay;
	}

	public void setAbsenceDay(String absenceDay) {
		this.absenceDay = absenceDay;
	}

	public String getPunishedDayOne() {
		return punishedDayOne;
	}

	public void setPunishedDayOne(String punishedDayOne) {
		this.punishedDayOne = punishedDayOne;
	}

	public String getPunishedDayTwo() {
		return punishedDayTwo;
	}

	public void setPunishedDayTwo(String punishedDayTwo) {
		this.punishedDayTwo = punishedDayTwo;
	}

	public List<EveryDayDetailsDO> getDays() {
		return days;
	}

	public void setDays(List<EveryDayDetailsDO> days) {
		this.days = days;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
