// Program to generate 6-digit OTP numbers and check uniqueness


public class OTPGenerator {
	
	// Method to generate a 6-digit OTP 
    public static int generateSixDigitOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
	

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
	
	

    public static void main(String[] args) {

        // Array to store 10 OTP numbers
        int[] otpArray = new int[10];

        // Generate OTPs and store in array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateSixDigitOTP();
            System.out.println("OTP " + (i + 1) + " = " + otpArray[i]);
        }

        // Check if all OTPs are unique
        boolean result = areOTPsUnique(otpArray);

        // Print the result
        if (result) {
            System.out.println("all otp are unique");
        } else {
            System.out.println("not unique");
        }
    }

    
}
