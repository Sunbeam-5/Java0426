public class Test {

    import java.util.Scanner;
        public class Main {

            /* * 注意： * 最大句子，卡strcat：前500000个字母组成1个单词，后面每个单词1个字母 * （运行超时） */
            public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                //String str="hjki ";
                System.out.println( ReverseWord(str));

            }

            public static String ReverseWord(String str){

                //1.翻转整个字符串

                String string= ReverseString(str);

                //2.把单个单词翻转过来

                String[] words=string.split("\\s");//切割单词 "\\s"代表空格
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<words.length;i++){

                    if(words[i].equals("")){

                        continue;
                    }
                    sb.append(ReverseString(words[i])+" ");
                }
                //删除最后一个字符（空格）
                return sb.deleteCharAt(sb.length()-1).toString();
            }
            /* * 翻转整个字符串 */
            public static String ReverseString(String str){

                StringBuilder sb1 =new StringBuilder(str);
                return sb1.reverse().toString();
            }



        }


}
