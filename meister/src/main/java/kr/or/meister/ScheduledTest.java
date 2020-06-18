package kr.or.meister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class ScheduledTest {
	public ScheduledTest() {
		// TODO Auto-generated constructor stub
		System.out.println("t");
	}
	@Scheduled(fixedDelay=5000)
	public void scheduleTest3() {
	System.out.println("5초마다 동작");
	}
}

