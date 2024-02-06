package practice;

public class PracticeForEach {

	public static void main(String[] args) {
		String name[] = { "周東", "川瀬", "柳田", "近藤", "中村", "柳町", "今宮", "三森", "甲斐", "和田" };

		for (String startingMember : name) {
			System.out.println("ソフトバンクホークス:" + startingMember);
			// 社員名が浮かばなかったので、ソフトバンクホークスのスタメンを記述
		}
	}

}
