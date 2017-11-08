/** 
*@Project:SLTS(阳光寿险电销系统) 
*@FileName: UserDutyManageDO.java
*@Date: 2017年9月22日
*@Attention：本内容仅限于阳光内部传阅，禁止外泄以及用于其他的商业目的 
*/
package demo1;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: UserDutyManageDO 
 * @Description: 差勤信息
 * @author liudawei-lhq
 * @date 2017年9月22日 下午5:15:05 
 *
 */
public class UserDutyManageDO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 电销中心
	 */
	private String telComName;

	/**
	 * 区
	 */
	private String areaName;

	/**
	 * 部
	 */
	private String departName;

	/**
	 * 组
	 */
	private String groupName;

	/**
	 * 坐席工号
	 */
	private String userId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 级别
	 */
	private String tsaleGradeName;

	/**
	 * 在职状态
	 */
	private String tsaleState;

	/**
	 * 离职日期
	 */
	private Date outWorkDate;

	/**
	 * 本月实际出勤天数
	 */
	private String monthRealDutyDay;

	/**
	 * 迟到（早退 ）天数合计
	 */
	private String lateDay;

	/**
	 * 带薪假期天数
	 */
	private String withSalaryHolidy;

	/**
	 * 本月应出勤工作日天数
	 */
	private String dutyDay;

	/**
	 * 本月法定假期天数
	 */
	private String holidyDay;

	/**
	 * 漏打卡天数合计
	 */
	private String forgetCard;

	/**
	 * 旷工天数合计
	 */
	private String neglectWork;

	/**
	 * 非带薪假期天数合计
	 */
	private String withoutSalaryHolidy;

	/**
	 * 惩罚性事假天数合计
	 */
	private String punishedDay;

	/**
	 * 事假天数合计
	 */
	private String absenceDay;

	/**
	 * 惩罚性事假1（迟到或早退30分钟到3小时）
	 */
	private String punishedDayOne;

	/**
	 * 惩罚性事假2（迟到或早退3小时以上）
	 */
	private String punishedDayTwo;

	/**
	 * 上班出勤
	 */
	private Date workDay;

	/**
	 * 下班出勤
	 */
	private Date afterWorkDay;

	/**
	 * 请假情况
	 */
	private String holidy;

	/**
	 * 迟到早退旷工
	 */
	private String late;

	/**
	 * 漏打卡申请
	 */
	private String forgetCardApply;

	/**
	 * 统计日期
	 */
	private Date currentDate;


	public String getTelComName() {
		return telComName;
	}

	public void setTelComName(String telComName) {
		this.telComName = telComName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public String getForgetCardApply() {
		return forgetCardApply;
	}

	public void setForgetCardApply(String forgetCardApply) {
		this.forgetCardApply = forgetCardApply;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

}
