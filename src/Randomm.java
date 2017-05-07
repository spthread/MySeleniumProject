import java.util.Random;


public class Randomm {




 static String number="";
 
 static String final1=""; 

static String generate(int length){

        Random r = new Random();

        int counter=0;

         while(counter++< length)
         { number+= r.nextInt(9);}

        return number;

    }


static  java.lang.String prefixString(String prefix,int length){

if(number.length()==length){
final1=final1+prefix+"-"+number;}

return final1;
}





public static void main(String[] args) {
 
 System.out.println(generate(8));

System.out.println(prefixString("Test",8));


}


}
