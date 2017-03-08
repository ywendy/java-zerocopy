package com.wendy.zerocopy;

import java.io.*;

/**
 * 传统文件copy
 *
 * @author tony.
 */
public class TraditionFileCopy implements FileCopy {



    @Override
    public void copyFile(File srcFile, File destFile) {

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            byte[] tmp = new byte[1024];
            int len;
            while ((len = fis.read(tmp)) != -1) {
                fos.write(tmp, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
