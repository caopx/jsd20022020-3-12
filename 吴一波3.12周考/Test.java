package Test312;

public class Test {
	public static void main(String[] args) {
		Bird[] bir = new Bird[5];
		bir[0] = new Penguin();
		bir[1] = new Penguin();
		bir[2] = new Sparrow();
		bir[3] = new Sparrow();
		bir[4] = new Eagle();
		for(int i = 0;i < bir.length;i++){
			if(i < 2){
				((Swim) bir[i]).swimming();
			}else{
				((Fly) bir[i]).flying();
			}
		}
	}

}
