package Interface;

public class RooseveltHospital implements Hospital{

	@Override
	public void vaccinate() {
		System.out.println("Roosevelt can provide Vaccicate");
		
	}

	@Override
	public void Operation() {
		System.out.println("Roosevelt can provide Operation");
		
	}

	@Override
	public void Xray() {
		System.out.println("Roosevelt can provide XRay");
		
	}

}
