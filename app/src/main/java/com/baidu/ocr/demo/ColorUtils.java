package com.baidu.ocr.demo;

public class ColorUtils {

    public static String getColor(String color) {
        if(color.equalsIgnoreCase("blue")){
            return "蓝牌";
        }else if(color.equalsIgnoreCase("yellow")){
            return "黄牌";
        }else if(color.equalsIgnoreCase("black")){
            return "黑牌";
        }else if(color.equalsIgnoreCase("white")){
            return "白牌";
        }else {
            return "蓝牌";
        }
    }
}
