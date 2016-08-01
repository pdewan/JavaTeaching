package lectures.animation.threads.wait_notify;
/*
 A factory class - a class that instantiates another class.
 Thus, its users do not instantiate the second class directly, they use the factory class.
 */
public class ClearanceManagerFactory {
	static ClearanceManager singleton; // only one instance of ClearanceManager will be created
	public static  ClearanceManager getClearanceManager() {
		if (singleton == null) {
			singleton = new AClearanceManager();
		}
		return singleton;
	}
	public static void setClearanceManager(ClearanceManager newVal) {
		singleton = newVal;
		
	}

}
