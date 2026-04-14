/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題2 商品の展示
 *
 * [問題1]の表示を行った後で
 * 以下の実行例と同じものを表示してください。
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250
 * ショコラ      \280
 * ピスターシュ  \320
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge02;

public class Patisserie {
	public static void main(String[] args) {
		String[] names = { "シトロン", "ショコラ", "ピスターシュ" };
		int[] prices = { 250, 280, 320 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "   " + "\\" + prices[i]);
		}

	}

}
