
public class String2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="222binu11fsdgsdfgsdfgs1xvxd1xvbxvcb1xbvxcb1sbvdsfb1xbb1";
     char [] c=s.toCharArray();
     char one='1';
    
		char nine='9';
		
		String x="";
		
        int sum=0;
        
		for(int i=0;i<c.length;i++){
			
			
			if((c[i]>=one) && (c[i]<=nine)){
			
				x=x+c[i];
				
				if(i == c.length-1) {
					if(x.length() != 0){
						sum=sum+Integer.parseInt(x);
						 x="";
						}
				}
			}
			else{
				if(x.length() != 0){
				sum=sum+Integer.parseInt(x);
				 x="";
				}
			}
			
		}
		
		System.out.println(sum);
		
	}

}
