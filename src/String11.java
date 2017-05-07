
public class String11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s="123BINU56";
		char[] c=s.toCharArray();
		
		char one='1';
		char nine='9';
		int sum=0;
		
		for(int i=0;i<c.length;i++){
			
			if((c[i]>=one) && (c[i]<=nine)){
			
				sum=sum+Character.getNumericValue(c[i]);;
				
			}
			
		}
		
		System.out.println(sum);
		
		
		
	}

}
