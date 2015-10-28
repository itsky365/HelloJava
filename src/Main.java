import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String str1 = "浙江wifi电信爱wifi";
        String str2 = str1.replaceAll("wifi", "WiFi");
        System.out.println(str2);
        String[] str3 = str1.split("wifi");
        System.out.println(str3);

        for (String s: str3) {
            System.out.println(s);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add("aa");
        arrayList.add("bb");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        for (int i=0, len=arrayList.size(); i<len; i++) {
            System.out.println(arrayList.get(i));
        }

        LinkedList linkedList = new LinkedList();
        linkedList.add("aa");
        linkedList.add("bb");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        for (int i=0, len=linkedList.size(); i<len; i++) {
            System.out.println(linkedList.get(i));
        }

        Vector vector = new Vector();
        vector.add("vvv");
        System.out.println(vector.size());

        HashSet hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add("b");
        System.out.println(hashSet.size());

        System.out.println("=======");

        TreeSet treeSet = new TreeSet();
        treeSet.add("tt");
        treeSet.add("rr");
        treeSet.add("ee");

        for (int i = 0, len = 10; i<len; i++) {
            treeSet.add("set" + i);
        }

        System.out.println(treeSet.size());
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("====");

        HashMap hashMap = new HashMap();
        hashMap.put("a", "aaa");
        hashMap.put("b", "bbb");
        System.out.println(hashMap.size());
    }
}
