package cn.funga.guava;

import com.google.common.base.Strings;

/**
 * com.google.common.base.Strings 类:处理字符串工具类，全部为静态方法，可直接调用。
 *
 *      String nullToEmpty(String string);
 *          如果字符串为null，会转为空字符串,如果不为null,保持原值。
 *
 *      String emptyToNull(String string);
 *          如果字符串为空字符串，则转为null，如果不是空字符，保持原值。
 *
 *      boolean isNullOrEmpty(@Nullable String string);
 *          判断字符串是不是空字符串或者null,只有null或""时才返回true
 *
 *      String padStart(String string, int minLength, char padChar);
 *          使string最小长度为minLength，如果长度不足，在string前面添加padChar凑。
 *
 *      String padEnd(String string, int minLength, char padChar);
 *          使string最小长度为minLength，如果长度不足，在string后面添加padChar凑。
 *
 *      String repeat(String string, int count);
 *          将字符串重复count遍，拼接返回。
 *
 *      String commonPrefix(CharSequence a, CharSequence b);
 *          两个字符串最短相同前缀,如果没有返回空字符串。
 *
 *      String commonSuffix(CharSequence a, CharSequence b);
 *          两个字符串最短相同后缀，如果没有返回空字符串。
 *
 */
public class StringsDemo {

    public static void main(String[] args) {
        // nullToEmpty()
        String a = null;
        String b = " ";
        String c = "";
        String d = "dddd";
        System.out.println(Strings.nullToEmpty(a)); // 结果是""
        System.out.println(Strings.nullToEmpty(b)); // 结果是" "
        System.out.println(Strings.nullToEmpty(c)); // 结果是""
        System.out.println(Strings.nullToEmpty(d)); // 结果是"dddd"

        // emptyToNull()
        System.out.println(Strings.emptyToNull(a)); // 结果是 null
        System.out.println(Strings.emptyToNull(b)); // 结果是" "
        System.out.println(Strings.emptyToNull(c)); // 结果null
        System.out.println(Strings.emptyToNull(d)); // 结果是"dddd"

        // isNullOrEmpty()
        System.out.println(Strings.isNullOrEmpty(a)); // true
        System.out.println(Strings.isNullOrEmpty(b)); // flase
        System.out.println(Strings.isNullOrEmpty(c)); // true
        System.out.println(Strings.isNullOrEmpty(d)); // false

        // padStart()
        System.out.println(Strings.padStart(d,10,'k')); // 结果 "kkkkkkdddd"

        // padEnd()
        System.out.println(Strings.padEnd(d,10,'k'));  // 结果是"ddddkkkkkk"

        // repeat()
        System.out.println(Strings.repeat("abcde",5));  // 结果"abcdeabcdeabcdeabcdeabcde"

        // commonPrefix
        System.out.println(Strings.commonPrefix("站在船上的那个人是谁啊？","站在船上的人我也不认识？")); // 结果是"站在船上的"

        // commonSuffix
        System.out.println(Strings.commonSuffix("你们说谁最帅？","我觉得我最帅？")); // 结果"最帅？"

    }
}
