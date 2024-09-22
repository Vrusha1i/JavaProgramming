package computer;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		Eployee em=new Eployee(1,"vp",678844);
		Eployee em1=new Eployee(2,"krp",200000);
		Eployee em2=new Eployee(1,"rp",600000);
		
		ArrayList<Eployee> obj=new ArrayList<>();
		obj.add(em);
		obj.add(em1);
		obj.add(em2);
		
		for(Eployee e:obj) {
			System.out.println(e);
		}
	}
}
