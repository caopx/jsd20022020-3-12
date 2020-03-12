package ceshi;

public class ceshi1 {
public static void main(String[] args) {

	Bird[] birds={new Penguin(),new Penguin(),new Eagle(),new Sparrow(),new Sparrow()};
	for(int i=0;i<birds.length;i++){
		if(birds[i].getClass()==Penguin.class){
			
			birds[i].swimming();
			
		}else{
			
			birds[i].flying();
		}
	}
	}	
}
interface fly{
	void flying();
}

interface swim{
	void swimming();
}

class Bird implements fly,swim{
	void layegg(){
		System.out.println("鸟会下蛋");
		}

	
	public void swimming() {
	}


	public void flying() {
	}
	}


class Eagle extends Bird implements fly{
	
	public void flying(){
		System.out.println("老鹰会飞");
	}
	void lay(){
		System.out.println("鸟会下蛋");
	}
}


class Penguin extends Bird implements swim{
	
	public void swimming(){
		System.out.println("企鹅会游泳");
	}
	void lay(){
		System.out.println("鸟会下蛋");
	}
}


class Sparrow extends Bird implements fly{
	
	public void flying(){
		System.out.println("麻雀会飞");
	}
	void lay(){
		System.out.println("鸟会下蛋");
	}
}
