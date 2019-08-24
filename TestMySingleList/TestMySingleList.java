package cn.dataStructure.com;

public class TestMySingleList {
    public static void main(String[] args) {
        List list = new MySingleList();
        list.add(1);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(0);
        list.add(6,66);

        System.out.println(list);
//        list.addAfter(66,"99");
//        System.out.println(list);

        list.addBefore(66,20);
        System.out.println(list);


        list.remove("15");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove("15");
        System.out.println(list);

        System.out.println(list.indexOf(66));
        System.out.println(list.contains(67));
        System.out.println(list.get(6));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
