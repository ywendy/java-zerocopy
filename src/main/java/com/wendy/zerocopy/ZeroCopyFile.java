package com.wendy.zerocopy;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @author tony.
 */
public class ZeroCopyFile implements FileCopy {


    @Override
    public  void copyFile(File srcFile, File destFile) {

        try (
                FileChannel srcChannel = new FileInputStream(srcFile).getChannel();
                FileChannel destChannel = new FileOutputStream(destFile).getChannel()
        ) {
            srcChannel.transferTo(0, srcChannel.size(), destChannel);

        } catch (Exception e) {
e.printStackTrace();
        }

    }

}
