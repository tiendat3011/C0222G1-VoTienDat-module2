package _10_dsa_list.exercise.arraylist;

public class MainList {
    public static void main(String[] args) {
        Object[] newMyArray = new Object[10];
        newMyArray[0] = 1;
        newMyArray[1] = 2;
        newMyArray[2] = 3;
        newMyArray[3] = 4;
        MyList<Integer> myList = new MyList<>();
        myList.add(0,1);
        myList.add(1,10);
        myList.add(2,100);
        myList.add(3,1000);
        myList.add(4,10000);
        System.out.println(myList.toString());
        System.out.println(myList.remove(1));
        System.out.println("99999");
        System.out.println(myList.toString());
        System.out.println(myList.size());
        myList.add(0,999);
        System.out.println(myList.toString());
        myList.clone(newMyArray);
        System.out.println(myList.toString());
        myList.clear();
        System.out.println(myList.toString());
        System.out.println(myList.size());

    }
}
