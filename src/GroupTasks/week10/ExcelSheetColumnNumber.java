package GroupTasks.week10;
/*
Question-2 Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 ...

Example 1:
Input: columnTitle = "A"  Output: 1
Example 2:
Input: columnTitle = "AB" Output: 28
Example 3:
Input: columnTitle = "ZY" Output: 701

Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters. columnTitle is in the range ["A", "FXSHRXW"].
Please, test your solution here: https://leetcode.com/problems/excel-sheet-column-number/
 */

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String str = "A";
        String str2 = "AB";
        String str3 = "ZY";

        System.out.println(titleToNumber_Ivan(str));
        System.out.println(titleToNumber_Ivan(str2));
        System.out.println(titleToNumber_Ivan(str3));

    }

    public static int titleToNumber_Ivan(String str) {

        int num = str.length();
        int result = 0;

        for (int i = num - 1; i >= 0; i--) {
            result += Math.pow(26, num - i - 1) * (str.charAt(i) - 64);
        }
        return result;
    }

}
