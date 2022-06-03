//package Main;

/**
 *
 * @Explain(说明)：字符串首字母大小写转换工具类
 * @time(时间)：2019/04/17
 * @role(谁)：杨木发
 * @modify(修改)
 * @time：
 * @role：
 */


public class InitialsTransformation {
    public static void main(String[] args) {
        System.out.println(StringUtilMax.initcap("yangmufa")) ;
        System.out.println(StringUtilMin.initcap1("YANGMUFA")) ;
    }
}




class StringUtilMax{
    public static String initcap(String str){
        //如果字符串str为null和""则返回原数据
        if (str==null||"".equals(str)){
            return str ;
        }

        if(str.length()==1){
            //如果字符串str的长度为1，则调用专门把字符串转换为大写的string方法tuUpperCase()
            return str.toUpperCase() ;
        }
        //用字符串截取方法subString()截取第一个字符并调用toUpperCase()方法把它转换为大写字母
        //再与从str第二个下标截取的字符串拼接
        return str.substring(0,1).toUpperCase()+str.substring(1) ;
    }
}


class StringUtilMin{
    public static String initcap1(String str){
        //如果字符串str为null和""则返回原数据
        if (str==null||"".equals(str)){
            return str ;
        }

        if(str.length()==1){
            //如果字符串str的长度为1，则调用专门把字符串转换为小写的string方法tuUpperCase()
            return str.toLowerCase() ;
        }
        //用字符串截取方法subString()截取第一个字符并调用toUpperCase()方法把它转换为小写字母
        //再与从str第二个下标截取的字符串拼接
        return str.substring(0,1).toLowerCase()+str.substring(1) ;
    }
}