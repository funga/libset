package cn.funga.guava;

import com.google.common.base.Strings;

/**
 *  Guava庫中`com.google.common.base`包下各种工具类示例
 *  @author FunGa
 */
public class BaseTools {
    public static void main(String[] args) {


        /**
         * Strings类:处理字符串工具类，全部为静态方法，可直接调用。
         *      String nullToEmpty(String string);
         *          如果字符串为null，会转为空字符串,如果不为null,保持原值。
         *      String emptyToNull(String string);
         *          如果字符串为空字符串，则转为null，如果不是空字符，保持原值。
         *      boolean isNullOrEmpty(@Nullable String string);
         *          判断字符串是不是空字符串或者null,只有null或""时才返回true
         *      String padStart(String string, int minLength, char padChar);
         *
         *      String padEnd(String string, int minLength, char padChar);
         *
         *      String repeat(String string, int count);
         *          将字符串重复count遍，拼接返回。
         *      String commonPrefix(CharSequence a, CharSequence b);
         *
         *      String commonSuffix(CharSequence a, CharSequence b);
         *
         *      boolean validSurrogatePairAt(CharSequence string, int index);
         *
         *
         */

        //　字符串重复ｎ遍
        String nstr = Strings.repeat("抄写１００遍。\r\n",100);
        System.out.println(nstr);

        System.out.println(Strings.isNullOrEmpty(null));

    }
}
