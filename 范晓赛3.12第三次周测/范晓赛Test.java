package exam312;

public class Test {
	public static void main(String[] args) {
		Bird[] b = new Bird[5];
		b[0] = new Penguin();
		b[1] = new Penguin();
		b[2] = new Sparrow();
		b[0] = new Sparrow();
		b[0] = new Eagle();
		for(int i=0; i<b.length; i++) {
			if(b[i]==new Penguin() || b[i]==new Sparrow()) {	
			
			    ((Fly)b[i]).flying();		    
			}else {
				((Swim)b[i]).swimming();
			}	
			//System.out.println(b[i]);
		}	
	}
}

interface Swim{
	abstract void swimming();
}

interface Fly{
	abstract void flying();
}

class Bird{
	public static void layegg() {
		System.out.println("鸟会下蛋");
	}
	
}

class Penguin extends Bird implements Swim{
	public void swimming() {
		System.out.println("企鹅会游泳");
	}
}

class Sparrow extends Bird implements Fly{
	public void flying() {
		System.out.println("麻雀会飞");
	}
}

class Eagle extends Bird implements Fly{
	public void flying() {
		System.out.println("老鹰会飞");
	}
}



