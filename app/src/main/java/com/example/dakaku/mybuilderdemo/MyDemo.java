package com.example.dakaku.mybuilderdemo;

import android.content.pm.PackageManager;

public final class MyDemo {
    private final int phone;
    private final String name;

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private int phone;
        private String name;


        public Builder phone(int phone) {
            this.phone = phone;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MyDemo build() {

            return new MyDemo(this);
        }
    }

    private MyDemo(Builder builder) {
        this.phone = builder.phone;
        this.name = builder.name;
    }
}
