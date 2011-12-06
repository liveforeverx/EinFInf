package exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time implements Comparable<Time>{
	private int hour;
	private int min;
	
	public Time(int hour, int min){
		this.hour = hour;
		this.min = min;
		normal();
	}
	
	public Time(int min){
		this.hour = 0;
		this.min = min;
		normal();
	}
	
	public Time(String time){
		Pattern x = Pattern.compile("^([0-9]{2})(:)([0-9]{2})$");
		Matcher matcher = x.matcher(time);
		if (matcher.find()){
        this.hour = Integer.parseInt(matcher.group(1));
        this.min = Integer.parseInt(matcher.group(3));}
		normal();
	}
	
	public static void main(String[] args) {
			System.out.println("Start");
			Time x = new Time((int)(24*Math.random()), (int)(60*Math.random()));
			Time y = new Time((int)(24*Math.random()), (int)(60*Math.random()));
			int z = (int)(60*Math.random());
			System.out.println(x.toString());
			System.out.println(y.toString());
			x.add(y);
			System.out.println(x.toString());
			System.out.println(z);
			x.add(z);
			System.out.println(x.toString());
			x.sub(y);
			System.out.println(x.toString());
			x.sub(z);
			System.out.println(x.toString());
			System.out.println("end");
			System.out.println((new Time("12:05")).toString());
			Time[] array = new Time[15];
			for(int i=0; i<15; i++)
				array[i] = new Time((int)(24*Math.random()), (int)(60*Math.random()));
			java.util.Arrays.sort(array);
			for(int i=0; i<15; i++)
				System.out.println((array[i]));
			
	}

		public Time add(int min){
			Time newtime = new Time(this.hour, this.min+min);
			return newtime;		
		}

		public Time add(Time t){
			Time newtime = new Time(this.hour+t.hour, this.min+t.min);
			return newtime;
		}

		public Time sub(int min){
			Time newtime = new Time(this.hour, this.min-min);
			return newtime;
		}

		public Time sub(Time t){
			Time newtime = new Time(this.hour-t.hour, this.min-t.min);
			return newtime;
		}
		
		public int compareTo(Time t){
			if(hour*60+min < t.hour*60+t.min)return -1;
			if(hour*60+min > t.hour*60+t.min)return 1;
			else return 0;
			
		}
		
		public String toString(){
			String houers = Integer.toString(hour);
			if(houers.length() == 1)houers = "0" + houers;
			String minutes = Integer.toString(min);
			if(minutes.length() == 1)minutes = "0" + minutes;
			return "Time = " + houers + ":" + minutes;
		}
		
		public void normal(){
			while(!(min >= 0 && min < 60))
				if(min > 0){min-=60; hour+=1;}
				else {min+=60; hour-=1;}

			while(!(hour >= 0 && hour < 24))
				hour += hour > 0 ? -24 : +24;
		}
}
