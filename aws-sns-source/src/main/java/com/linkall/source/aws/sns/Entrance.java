package com.linkall.source.aws.sns;

import com.linkall.vance.core.VanceApplication;

public class Entrance {
    public static void main(String[] args) {
        VanceApplication.run(SnsSource.class);
    }
}
