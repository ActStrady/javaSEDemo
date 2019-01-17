package day05;

import java.util.*;

public class Containers {
    public static void main(String[] args) {
        // Set操作
        Set<String> sets = new HashSet<>();
        // 存
        sets.add("ee");
        sets.add("cc");
        //取
        sets.size();
        for (String set : sets) {
            System.out.println(set);
        }

        // Map 操作
        Map<String, String> stringStringHashMap = new HashMap<>(16);
        stringStringHashMap.put("s", "snack");
        stringStringHashMap.put("d", "dog");
        Collection<String> values = stringStringHashMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        /*
        使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
        添加几条信息
        列出所有的员工姓名
        列出所有员工姓名及其工资
        删除名叫 Tom 的员工信息
        输出 Jack 的工资，并将其工资改为 1500 元
        将所有工资低于 1000 元的员工的工资上涨 20%
        * */
        Map<String, Double> wages = new HashMap<>(16);
        wages.put("Bean", 880.0);
        wages.put("Mack", 850.0);
        wages.put("Tom", 360.0);
        wages.put("Jack", 652.0);
        wages.put("Marry", 1300.0);
        wages.put("Lind", 1200.0);
        System.out.print("员工有：");
        for (String s : wages.keySet()) {
            System.out.print(s + "  ");
        }
        System.out.println();
        System.out.println("员工及其对应的工资是:");
        for (Map.Entry<String, Double> entry : wages.entrySet()) {
            System.out.println(entry.getKey() +"  " + entry.getValue());
        }
        wages.remove("Tom");
        System.out.println("删除Tom后");
        System.out.println("员工及其对应的工资是:");
        for (Map.Entry<String, Double> entry : wages.entrySet()) {
            System.out.println(entry.getKey() +"  " + entry.getValue());
        }
        System.out.println("Jack的工资是" + wages.get("Jack"));
        wages.put("Jack", 1500.0);
        System.out.println("改后的工资是" + wages.get("Jack"));

        for (String s : wages.keySet()) {
            Double aDouble = wages.get(s);
            if (aDouble < 1000) {
                aDouble *= 1.2;
                wages.put(s, aDouble);
            }
        }
        System.out.println("加工资后");
        System.out.println("员工及其对应的工资是:");
        for (Map.Entry<String, Double> entry : wages.entrySet()) {
            System.out.println(entry.getKey() +"  " + entry.getValue());
        }
    }
}
