
public class VolumeMain {

	public static void main(String[] args) {
		// 인터페이스는 new를 할 수 없다.
		// Volume volume = new Volume();
		
		Radio radio = new Radio();
		TV tv = new TV();
		HandPhone handPhone = new HandPhone();
		
		radio.volumeUp(3);
		radio.volumeUp(4);
		radio.volumeDown(5);
		
		tv.volumeUp(19);
		tv.volumeUp(200);
		tv.volumeUp(90);
		tv.volumeDown(-100);
		
		handPhone.volumeUp(11);
		handPhone.handshow();
		
		System.out.println("======================================");
		//인터페이스도 다형성 지원함
		
		Volume volume = radio; //업캐스팅
		volume.volumeUp(1);
		
		volume = tv;
		volume.volumeUp(1);
		volume.volumeDown(1);
		
		volume = handPhone;
		volume.volumeUp(10);
		volume.volumeDown(3);
		//volume.handShow();
		System.out.println();
		System.out.println("======================================");
		
		Volume v[] = new Volume[3];
		v[0] = radio;
		v[1] = tv;
		v[2] = handPhone;
		
		for(int i = 0; i<v.length; i++) {
			v[i].volumeUp(3);
		}
		
		// 향상된 for문
		for(Volume vol : v) {
			vol.volumeUp(5);
		}
	}//main
}
