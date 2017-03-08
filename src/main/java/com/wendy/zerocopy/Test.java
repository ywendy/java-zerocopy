package com.wendy.zerocopy;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

/**
 * @author tony.
 * @since 1.7
 */
public class Test {

    public static void main(String[] args) throws IOException {

        String destFileDir = "F:\\destDir\\";
        File srcFileDir = new File("F:\\srcDir");
        File[] files = srcFileDir.listFiles();
        FileCopy traditionFileCopy = new TraditionFileCopy();
        FileCopy zeroCopyFile = new ZeroCopyFile();
        for (File f: files) {
            String fileName = f.getName();
            String suffix = fileName.substring(fileName.lastIndexOf("."));
            String prefix = fileName.substring(0,fileName.length()-suffix.length());
            print(f, new File(destFileDir+prefix+"1"+suffix), traditionFileCopy);
            print(f, new File(destFileDir+prefix+"2"+suffix), zeroCopyFile);
            System.out.println("------------------------------------");

        }




    }

    private static void print(File srcFile, File destFile, FileCopy fileCopy) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }else{
            destFile.delete();
        }
        long begin = System.currentTimeMillis();
        fileCopy.copyFile(srcFile, destFile);

        System.out.println(fileCopy.getClass().getSimpleName()+",Copy："+(srcFile.length()/1024/1024)+"M 文件,耗时："+(System.currentTimeMillis() - begin) + "ms");
    }
}
