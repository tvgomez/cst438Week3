package cst438.domain;

public class TempAndTime {
	
	private double temp;
	private long time;
	private int timezone;
	
	public TempAndTime() {
		
	}

	public TempAndTime(double temp, long time, int timezone) {
		super();
		this.temp = temp;
		this.time = time;
		this.timezone = timezone;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public long getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempAndTime other = (TempAndTime) obj;
		if (Double.doubleToLongBits(temp) != Double.doubleToLongBits(other.temp))
			return false;
		if (time != other.time)
			return false;
		if (timezone != other.timezone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TempAndTime [temp=" + temp + ", time=" + time + ", timezone=" + timezone + "]";
	}


	
	
	
}