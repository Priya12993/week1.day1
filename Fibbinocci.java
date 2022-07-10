package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int firstnum=0;
  int secnum=1;
    System.out.println(firstnum);
  for (int i = 0; i <= 11; i++) {
	 int sum=firstnum+secnum;
	  firstnum=secnum;
	  secnum=sum;
	  System.out.println(sum);
	  
	
}
	  
	
}
  
	}


