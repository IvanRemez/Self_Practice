package CodingWithMosh;

public class ArrayTest {

    public static void main(String[] args) {

        Array nums = new Array(3);
        nums.insert(10);
        nums.insert(20);
        nums.insert(30);
        nums.insert(40);
        nums.removeAt(3);
        System.out.println(nums.indexOf(10));   // 0
        System.out.println(nums.indexOf(15));   // -1 (item doesn't exist)
        nums.print();
    }
}
