package Lv0;

public class Lv0_33 {

	public static void main(String[] args) {
		solution(1212);

	}
	
	 public static int solution(int chicken) {

//	        int coupon = -1;
//	        int serviceChicken = 0;
//	        int restCoupon = 0;
//	        int tempChicken = 0;
//	        
//	        coupon = chicken;
//	        while(coupon != 0) {
//	        	tempChicken = coupon / 10;
//	        	serviceChicken += tempChicken;
//	        	System.out.println("serviceChicken : " + serviceChicken);  
//	        	restCoupon += coupon % 10;
//	        	
//	        	coupon = tempChicken;
//	        	tempChicken = 0;
//	        	if(restCoupon >= 10) {
//	        		serviceChicken += restCoupon / 10;
//	        		restCoupon %= 10;
//	        	}
//	        }
//
//	        System.out.println(serviceChicken);
//	        return serviceChicken;
		 
		 int serviceChicken = 0;
		 int coupon = chicken;
		 
		 while (coupon >= 10) {
			 serviceChicken += coupon / 10;
			 coupon = coupon / 10 + coupon % 10;
		 }
		 
		 return serviceChicken;
	    }

}
