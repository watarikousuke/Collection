package practice;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Map<LocalDate, String> map = new TreeMap<LocalDate, String>();
		
		Task task1 = new Task(LocalDate.of(2021, 10, 21),"牛乳を買う");
		Task task2 = new Task(LocalDate.of(2021, 9, 15),"○○社面談。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4),"手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10),"散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9),"スクールの課題を解く。");
		
		map.put(task1.date, task1.task);
		map.put(task2.date, task2.task);
		map.put(task3.date, task3.task);
		map.put(task4.date, task4.task);
		map.put(task5.date, task5.task);
		

		
		for (LocalDate key : map.keySet()) {
			System.out.println( key + ":" + map.get(key));
		}

	}

}
