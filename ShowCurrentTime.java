package project1;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisecond=System.currentTimeMillis();
		long totalSecond=totalMillisecond/1000;//当前总秒数
		long currentSecond=totalSecond%60;//当前秒数
		long totalMinute=totalSecond/60;//当前总分钟数
		long currentMinute=totalMinute%60;//当前分钟数
		long totalHour=totalMinute/60;//当前总小时数
		long currentHour=totalHour%24+8;//当前小时数
		
		System.out.println("current time is "+currentHour+" : "+currentMinute+" : "+currentSecond+" GMT");
	}

}
