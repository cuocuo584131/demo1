package demo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DutyTest {

	public static void main(String[] args) {
		List<UserDutyManageDO> orgionList = new ArrayList<UserDutyManageDO>();
		UserDutyManageDO orgion =  new UserDutyManageDO();
		orgion.setWorkDay(new Date());
		orgion.setAfterWorkDay(new Date());
		orgion.setUserId("111");
		orgion.setCurrentDate(new Date());
		orgionList.add(orgion);
		
		UserDutyManageDO orgion1 =  new UserDutyManageDO();
		orgion1.setWorkDay(new Date());
		orgion1.setAfterWorkDay(new Date());
		orgion1.setUserId("111");
		orgion1.setCurrentDate(new Date());
		orgionList.add(orgion1);
		
		UserDutyManageDO orgion4 =  new UserDutyManageDO();
		orgion4.setWorkDay(new Date());
		orgion4.setAfterWorkDay(new Date());
		orgion4.setUserId("222");
		orgion4.setCurrentDate(new Date());
		orgionList.add(orgion4);
		
		UserDutyManageDO orgion5 =  new UserDutyManageDO();
		orgion5.setWorkDay(new Date());
		orgion5.setAfterWorkDay(new Date());
		orgion5.setUserId("222");
		orgion5.setCurrentDate(new Date());
		orgionList.add(orgion5);
		List<DutyManageDO1> dutyList = new ArrayList<>();
		List<EveryDayDetailsDO> dayList = new ArrayList<>();
		
		for (int i = 1; i <= orgionList.size(); i++) {
			DutyManageDO1 duty = new DutyManageDO1();
			EveryDayDetailsDO day = new EveryDayDetailsDO();
			day.setAfterWorkDay(orgionList.get(i-1).getAfterWorkDay());
			day.setWorkDay(orgionList.get(i-1).getWorkDay());
			dayList.add(day);
			int step = 2;
			while(i%step == 0) {
				duty = new DutyManageDO1();
				duty.setUserId(orgionList.get(i-1).getUserId());
				List<EveryDayDetailsDO> dayList1 = new ArrayList<>();
				for (int j = 1; j <= step; j++ ) {
					dayList1.add(dayList.get(i-j));
				}
				duty.setDays(dayList1);
				dutyList.add(duty);
				break;
			}
			
		}
		
		System.out.println(dutyList.size());
		System.out.println(dutyList.get(0).getDays().size());
		System.out.println(dutyList.get(1).getDays().size());
		
		
	}
	
}
