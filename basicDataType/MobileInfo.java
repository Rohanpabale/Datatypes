package basicDataType;

public class MobileInfo {
	public static void main(String[] args) {
		// define mobile
		String brandName = "Samsung";
		String model = "Galaxy J6+";
		double screenSize = 6.6;// in inches
		String operatingSystem = "android 8.1";
		String storage = "Internal 64 GB and 4 GB Ram";
		double cameraMegaPixel = 13.1;// rear camera
		char mobileGrade = 'A';
		int battery = 5000;// in mAh
		int price = 15000;

		System.out.println("Print mobile info");
		System.out.println("Mobile brand name: " + brandName);
		System.out.println("model of mobile: " + model);
		System.out.println("Screen size of mobile: " + screenSize);
		System.out.println("operating system of mobile: " + operatingSystem);
		System.out.println("storage of mobile: " + storage);
		System.out.println("camera: " + cameraMegaPixel);
		System.out.println("mobile grade: " + mobileGrade);
		System.out.println("battery of mobile: " + battery);
		System.out.println("price of mobile: " + price);

	}
}
