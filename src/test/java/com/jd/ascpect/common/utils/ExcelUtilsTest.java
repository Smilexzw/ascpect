package com.jd.ascpect.common.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuzhangwang
 * @date 2019/11/12 17:59
 */
public class ExcelUtilsTest {

    ExcelUtils excelUtils = new ExcelUtils();

    @Test
    public void importXLS() {
        excelUtils.importXLS();
    }
}