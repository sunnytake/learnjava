package com.msb.basic.commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

public class Test1 {

    public static void main(String[] args) {

        long size = FileUtils.sizeOf(new File("abc.yxy"));
        System.out.println(size);

        Collection<File> files = FileUtils.listFiles(new File("c:"), EmptyFileFilter.NOT_EMPTY, null);

    }

}
