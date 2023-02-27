package wo1261931780.stleetcode.practice.leetcode.a20230227;

public class aaa066反转 {
    public static void main(String[] args) {
        /*int[] xx={1,2,3,4,5};
        int[] x1=new int[5];
        int z=x1.length;
        for (int x=0;x<xx.length;x++){
            x1[z]=xx[x];
            z--;
        }
        System.out.println(x1[0]+","+x1[1]+","+x1[2]+","+x1[3]+","+x1[4]);*/
        //上面是自己写的。下面是标答
        int[] xx = {11, 22, 33, 44, 55};
        //中间值，用来接收x2位置的数据，然后赋值给x3位置
        int x1 = 0;
        for (int x2 = 0, x3 = xx.length - 1; x2 <= x3; x2++, x3--) {
            //首先x1接受0号的11
            x1 = xx[x2];
            //然后x2的0号11，改变为x3的4号55
            xx[x2] = xx[x3];
            //这时x3的4号55，变成x1的11
            xx[x3] = x1;
            //第一轮结束，数组变成{55，22，33，44，11}
            //---------------------------------------
            // 第二轮，x2变成1号，x3变成3号
            //x1接受x2的1号22，
            //x2接受x3的44，
            //x3接受x1的22
            //第二轮结束，数组变成{55，44，33，22，11}
            //---------------------------------------
            //第三轮开始，x2和x3数字相等，
            //但是为了处理有偶数个数字的数组，必须保留等号=
        }
        // System.out.print(xx[0]+","+xx[1]+","+xx[2]+","+xx[3]+","+xx[4]);
        // 调用可以直接用这个xx，不需要数字
        bl(xx);
    }

    public static void bl(int[] xx) {
        System.out.print("[");
        for (int ss = 0; ss < xx.length; ss++) {
            if (ss < xx.length - 1) {
                System.out.print(xx[ss] + ",");
            } else {
                System.out.print(xx[ss]);
            }
        }
        System.out.print("]");
        //引用类型，形参直接影响实参
    }
}
