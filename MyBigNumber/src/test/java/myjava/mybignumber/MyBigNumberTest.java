package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest implements IReceiver {

	private static int i = 1;
	
	@Test
	void testMyBigNumber() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("212", "2323");
		System.out.println(sum);
	}

	@Test
	void testMyBigNumber1() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("1", "-6");
		System.out.println(sum);
	}
	
	@Test
	void testMyBigNumber2() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("1a", "6");
		System.out.println(sum);
	}
	
	@Test
	void testMyBigNumber3() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("1", "@12");
		System.out.println(sum);
	}
	
	@Test
	void testMyBigNumber4() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("1", "1111122121231312312312312321312312312312312323");
		System.out.println(sum);
	}
	
	@Test
	void testMyBigNumber5() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("11212ds1ds", "122123121321312asdadasda");
		System.out.println(sum);
	}
	

	@Test
	void testMyBigNumber6() {
		MyBigNumberTest sr = new MyBigNumberTest();
		MyBigNumber myclass  = new MyBigNumber(sr);
		String sum = myclass.sum("11212ds1ds^&", "1$22123121321312asdadasda");
		System.out.println(sum);
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Case : " + i + "\t" + msg + "\n");
		i++;
	}

}
