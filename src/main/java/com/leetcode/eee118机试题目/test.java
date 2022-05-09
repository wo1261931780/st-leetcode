package leetcode.eee118机试题目;

//应用计算机处理日常事务或者是编写程序的时候，经常需要用到带有通配符的字符串匹配。
// 比如：linux命令行下输入，ls *.txt 就是列出当前目录下所有的结尾是.txt的文件。
// 下面一段函数实现了带有$和*两种通配符的字符串的匹配功能。
// 其中：$表示长度大于0的数字串,*表示任意长度的字符串。
// 要求：按照自己对于算法的理解填写该函数的5个空白。
// 请注意：必须是完全匹配才能返回true，比如
// 1.txt, a.txt可以匹配*.txt,
// 2.tx或者txta不能匹配*.txt。函数的参数与返回值的说明请参见函数的注释。
public class test {
    // 功能描述: 表达式是否匹配成功, $表示长度大于 0 的数字串，*表示任意长的字符串
// 输入参数: @pRule, 以'\0'结束的字符串，表示规则;
// @pStr, 以'\0'结束的待匹配的字符串;
// 返回值:true:匹配成功; false: 匹配失败
    public static boolean isRegularMatching(String text, String number) {
        int text_length = text.length();
        int number_length = number.length();
        int istext = 0;
        int isnumber = 0;
        // while (istext < text_length && isnumber < number_length) {
        //     switch () {// _____(1) _____
        //         //区分是字符串还是数字串
        //         case '*': {
        //             //如果是字符串
        //             istext += 1;
        //             if (istext >= text_length) {
        //                 return true;
        //             } else {
        //                 for (int i = isnumber; i < number_length; i++) {
        //                     if (istext >= text_length) {// _____(2) _____//istext >= text_length
        //                         return true;
        //                     }
        //                 }
        //             }
        //             break;
        //         }
        //         case '$': {
        //             //如果是数字串
        //             if (isnumber <= number_length) {// _____(3) _____//isnumber <= number_length
        //                 return false;
        //             }// 0表示48
        //             while ((isnumber < number_length) && (number.charAt(isnumber) >= '0') && (number.charAt(isnumber) <= '9')) {
        //                 isnumber += 1;
        //             }
        //             istext += 1;
        //             break;
        //         }
        //         default: {
        //             // charAt返回指定索引处的字符
        //             if (text.charAt(istext) != number.charAt(isnumber)) {
        //                 return false;// _____(4) _____// return false
        //             }
        //             istext += 1;
        //             isnumber += 1;
        //             break;
        //         }
        //     }
        // }
        if (istext < text_length && isnumber >= number_length) {
            return text.charAt(istext) == '*';
        } else {
            return false;//_____(5) _____//false
        }
    }
}
