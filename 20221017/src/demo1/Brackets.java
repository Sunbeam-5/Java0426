package demo1;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if (n % 2 == 1){
            return false;
        }else {
            char[] array = A.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '(' || array[i] == ')'){
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
}

public class Brackets {
    public static void main(String[] args) {

    }
}
