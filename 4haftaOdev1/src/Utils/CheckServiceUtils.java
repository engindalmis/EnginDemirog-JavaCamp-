package Utils;


public class CheckServiceUtils {
	public static boolean runCheckServices(boolean[] customerCheckServices) {
		for (boolean customerCheckService : customerCheckServices) {
			if(!customerCheckService) {
				return customerCheckService;
			}
		}
		return true;
	}
}
