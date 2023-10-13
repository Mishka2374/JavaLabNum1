package mishka;

public class Main {
    public static void main(String[] args) {

        NewLinkedList<Integer> F=new NewLinkedList<>();
        System.out.println("size = " + F.size() + ", isEmpty = " + F.isEmpty());

        Integer []a=new Integer[]{1,2,3,4,5};
        NewLinkedList<Integer> L1=new NewLinkedList<>(a);
        System.out.println("size = " + L1.size() + ", \n"+L1.toString());

        L1.push(5,2);
        System.out.println(L1.toString() +"\n"+L1.check(2)+ "\t" +L1.search(1));
    }
}
