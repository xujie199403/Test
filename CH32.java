
public class CH3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int[] arr={1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]);
		}
		for(int element:arr)
			System.out.println(element);
		}
		*/
		/*
	    int[][] arr={{1,2,3},
	    		     {4,5,6},
	    		     {7,8,9}};
	    for(int[]row:arr){
	    	for(int element:row){
	    		System.out.println(element);
	    	}
	    }
	    */
		 Account account= new Account("123456",100);
		 System.out.println("帐户:"+account.getAccountNumber());
		 System.out.println("余额:"+account.getBalance());
		 account.deposit(1000);
		 System.out.println("帐户:"+account.getAccountNumber());
		 System.out.println("余额:"+account.getBalance());
	}}
