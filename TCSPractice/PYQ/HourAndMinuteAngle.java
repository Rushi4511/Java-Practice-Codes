package Arrays.PYQ;
import java.util.*;

class HourMinAng{

	public static int diffBetweenAngles(int h ,int m){

		if(h<0 || h>12 || m <0 || m>6666660){
			System.out.println("Not Valid");
		}

		if(h==12){
			h =0;
		}
		else if(m==60){
			m =0;
			h= h+1;

			if(h>12){
				h=h -12;
			}
		}

		int hour_angle = (int) 0.5*(h*60 + m);
		int min_angle = (int) 6*m;

		int angle = Math.abs(hour_angle - min_angle);
		angle = Math.min(360-angle,angle);

		return angle;

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		System.out.println(diffBetweenAngles(hour,min));
	}
}

