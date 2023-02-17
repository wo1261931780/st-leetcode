package com.stleetcode.github.io.junw.practice.eee116复制单级文件夹;
/*
    需求：
        把E:\\itcast 这个文件夹复制到模块目录下

    思路：
        1:创建数据源目录File对象，路径是E:\\itcast
        2:获取数据源目录File对象的名称(itcast)
        3:创建目的地目录File对象，路径名是模块名+itcast组成(myCharStream\\itcast)
        4:判断目的地目录对应的File是否存在，如果不存在，就创建
        5:获取数据源目录下所有文件的File数组
        6:遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
            数据源文件：E:\\itcast\\mn.jpg
        7:获取数据源文件File对象的名称(mn.jpg)
        8:创建目的地文件File对象，路径名是目的地目录+mn.jpg组成(myCharStream\\itcast\\mn.jpg)
        9:复制文件
            由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author junw
 */
public class eee117 {
	public static void main(String[] args) throws IOException {
		File x = new File("l:\\java\\demo");
		String zfloder = x.getName();
		File s = new File("l:\\22", zfloder);
		if (!s.exists()) {
			s.mkdirs();
		}
		// File s = new File("l:\\22");
		File[] x1 = x.listFiles();
		assert x1 != null;// 补充断言，避免出现空指针问题
		for (File i : x1) {
			// 这里直接获取到文件夹内所有的文件名称
			String ii = i.getName();
			// 获取到名称以后，在目标文件夹内创建对应的同名对象
			File file = new File(s, ii);
			// 执行创建文件操作
			crfile(i, file);
			// -----------------------------------------------
			// while (i.isDirectory()) {
			//     File[] x2 = i.listFiles();
			//     for (File i2 : x2) {
			//         byte[] x3 = new byte[1024];
			//         BufferedReader x4 = new BufferedReader(new FileReader(i2));
			//         BufferedWriter x5 = new BufferedWriter(new FileWriter(s));
			//         String x6;
			//         while ((x6 = x4.readLine()) != null) {
			//             x5.write(x6);
			//             x5.newLine();
			//             x5.flush();
			//         }
			//         x4.close();
			//         x5.close();
			//     }
			// }
		}

	}

	/**
	 * alt+enter直接创建方法
	 */
	private static void crfile(File i, File file) throws IOException {
		//         BufferedReader x4 = new BufferedReader(new FileReader(i2));
		//         BufferedWriter x5 = new BufferedWriter(new FileWriter(s));
		// 首先，这里是字节流形式的输入输出，所以不能使用buffer命令
		BufferedInputStream x = new BufferedInputStream(new FileInputStream(i));
		BufferedOutputStream x1 = new BufferedOutputStream(new FileOutputStream(file));
		byte[] x2 = new byte[1024];
		int i2;
		while ((i2 = x.read(x2)) != -1) {
			// 其次，这里的写入也需要保持字节流形式，不能直接使用字符命令
			x1.write(x2, 0, i2);
		}
		x.close();
		x1.close();

	}
}
