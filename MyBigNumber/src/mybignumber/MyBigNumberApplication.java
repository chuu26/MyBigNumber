/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybignumber;

/**
 *
 * @author Box
 */
public class MyBigNumberApplication implements IReceiver{

	public static void main(String[] args){
		try {
			MyBigNumberApplication myclass = new MyBigNumberApplication();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String s1 ="", s2 ="";
			if(args.length > 0) {
				s1 = args[0];
				s2 = args[1];
			}else {
				s1 = "0";
				s2 = "0";
			}
			String sum = mybignumber.sum(s1, s2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static int i = 1;
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Case :" + i + msg + "\n");
		i++;
	}

}
