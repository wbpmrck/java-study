package com.springaction.concert;

public interface Performance {
    void perform();//演出接口

    Performance openGate(String when);
}
