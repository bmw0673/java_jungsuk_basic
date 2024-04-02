class Ex2_11 {
	public static void main(String[] args) {
		//정수형의 오버플로우 예제
		//최소값에서 -1 = 최댓값
		//최댓값에서 +1 = 최솟값
		
		//부호있는정수
		short sMin = -32768,  sMax = 32767;
		//부호없는정수
		char  cMin = 0,       cMax = 65535;

		System.out.println("sMin  = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		System.out.println("sMax  = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		System.out.println("cMin  = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax  = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
	}
}