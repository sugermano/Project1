package project1;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisecond=System.currentTimeMillis();
		long totalSecond=totalMillisecond/1000;//��ǰ������
		long currentSecond=totalSecond%60;//��ǰ����
		long totalMinute=totalSecond/60;//��ǰ�ܷ�����
		long currentMinute=totalMinute%60;//��ǰ������
		long totalHour=totalMinute/60;//��ǰ��Сʱ��
		long currentHour=totalHour%24+8;//��ǰСʱ��
		
		System.out.println("current time is "+currentHour+" : "+currentMinute+" : "+currentSecond+" GMT");
	}

}
