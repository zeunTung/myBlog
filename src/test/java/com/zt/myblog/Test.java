package com.zt.myblog;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) {
        String s = "4pnoS8LZjxc=sysoutW6Hk6MMv0jgsq+tq6fBy+8cVgZu1PBu9HtcEYHNzIv8+6JKhtwDcZQ==sysout7L3ido3hOmLBRSNcmso1vYjy28ZaXjiY03jNFpiFQ2ZCDFieudKSBL30GWeGzg3lsysout13TNcJThnJWgwTl0GyvvhzZdQdHvLJf2Zp1xGPGQQkyN28ZM8yrY!-1906532051!1552535258438";
        try {
            System.out.println(s.getBytes("UTF-8").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
