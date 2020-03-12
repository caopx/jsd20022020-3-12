package test2;

public class Test {

	public static void main(String[] args) {
		Bird[] b=new Bird[5];
		b[0]=new Penguin();
		b[1]=new Penguin();
		b[2]=new Sparrow();
		b[3]=new Sparrow();
		b[4]=new Eagle();
		for(int i=0;i<b.length;i++) {
			if(i==4) {
				Fly f=new Eagle();
				f.flying();
			}
			else if(i==2||i==3) {
				Fly s=new Sparrow();
				s.flying();
			}
			else {
				Swim p=new Penguin();
				p.swimming();
			}
		}

	}

}
