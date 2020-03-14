package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format("{%d}, %s", index,object.toString()));
    }
    public static void demoString(){
        String str = "hello newcoder";
        print(1,str.indexOf('e'));
        print(3,str.codePointAt(1));
        print(4,str.compareTo("hello mcoder"));
        print(4,str.compareTo("hello pcoder"));
        print(5,str.lastIndexOf('o'));
        print(6,str.replace('o','a'));
        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        print(7,sb.toString());
    }
    public static void domeList(){
        List<String> strList = new ArrayList<>();
        for(int i=0;i<4;++i){
            strList.add(String.valueOf(i));
        }
        print(1,strList);
        List<String> strListB = new ArrayList<>();
        Collections.sort(strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.reverse(strList);
    }
    public static void demoCommon(){
        //salt uuid
        Random random = new Random();
        //假随机数，根据种子决定，每个种子所生产的随机序列式相同的。
        random.setSeed(1);//即使多次运行用相同种子也是相同的。
        for(int i=0;i<4;i++)
        random.nextInt(100);
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        print(3,array);
        Collections.shuffle(array);//集合重新排列
        print(4,array);

        Date date = new Date();
        print(5,date);
        print(7,date.getTime());//与1900的时间差
        //已知今天周几，未来的日期
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(8,df.format(date));
        print(9,UUID.randomUUID());
        print(10,Math.log(2.71));
    }
    public static void domeSet(){//去重
        Set<String>  strSet = new HashSet<String>();
        for(int i=0;i<3;i++){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        print(2,strSet.contains(4));
        strSet.addAll(Arrays.asList(new String[]{"A","b"}));
        print(3,strSet);
    }
    public static void domeMap(){
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        map.entrySet();//是<key,value>的集合
        print(1,map);
        map.put("1","10");
        print(2,map);
    }
    public static void demoOperation(){
        print(1,5/2);
        print(2,5>>1);
        print(3,1^5);
    }
    public static void demoClass(){
        Animal animal = new Animal("JIM",1);
        animal.say();
        animal = new Dog("Lei",11,"CN");
        animal.say();
    }
    public static void main(String[] args) {
	// write your code here
        //print(1,"hello world");
        demoClass();
    }
}
