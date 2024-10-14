package com.my.school.constant;

import lombok.Getter;

@Getter
public enum Gender {
    M("남"),
    F("여");
    private final String desc;

    Gender(String desc) {
        this.desc = desc;
    }
}
