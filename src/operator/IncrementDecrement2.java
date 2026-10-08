package operator;

public class IncrementDecrement2 {
	public static void main(String[] args) {
        int i=5;
		int a=3;
	    i--;//4
	    a++;//4
	    System.out.println(i++ + --a);//p=7 u=8
	    --i;//4
	    a++;//4
	    System.out.println(i-- + ++i);//5
	    i--;//4
	    i++;//5
	    ++a;//4
	    System.out.println(i++ + --a);//8
	    ++i;//6
	    a++;//5
        --i;//5
        System.out.println(i-- + a + i + a-- + i++);//25
        i++;
        a--;
        System.out.println(i + a + i++ + a--);
	}
	
	



}
