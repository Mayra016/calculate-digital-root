	public static void main(String[] args) {
		System.out.println(digital_root(3542));
	}
	
	public static int digital_root(int n) {
        String digit = String.valueOf(n);
        
        while (digit.length() > 1) {
            int sum = 0;
            for (int i = 0; i < digit.length(); i++) {
                sum += Character.getNumericValue(digit.charAt(i));
            }
            digit = String.valueOf(sum);
        }
        return n<10?n:Integer.valueOf(digit);
    }
