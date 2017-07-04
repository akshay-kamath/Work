import java.util.*;
class PhoneMain{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rate");
		double rate=sc.nextDouble();
	
		Phone p=new Phone(rate);
		p.call(9999999);
		p.isMuted();
		p.toggleMute();
		p.isMuted();
		p.toggleMute();
		p.isMuted();
		p.hangUp();
	}
	
}
class Phone{
	double rate;
	boolean mute=false;
	long start,end;

	public Phone(double r){
		rate=r;
	}

	public void call(long phoneNo){
		start=System.currentTimeMillis();
		System.out.println("Calling "+phoneNo);
	}
	
	public void hangUp(){
		end=System.currentTimeMillis();
		System.out.println("Call HangedUp");
		getBill(rate);
	}

	public void toggleMute(){
		mute=!mute;
	}

	public void isMuted(){//isSomething:return Boolean
		if(mute==true){
			System.out.println("Call muted");
			return;
		}
		System.out.println("Call not muted");
	}
	
	public void getBill(double rate){
		System.out.println(rate*(end-start)/1000);
	}
}