package review;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println("セルフエイドを発動！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	public int play(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int recover = new Random().nextInt(3) + sec; //0~2をランダムで
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover); //残りMPと回復するMPのうち小さい方を代入
		this.mp += recoverActual; //現在のMPに回復分をプラス
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual; //回復したMPを返す
	}
	
	public Cleric(String name) {
		this.name = name;
	}
}
