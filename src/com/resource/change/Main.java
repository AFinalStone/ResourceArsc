package com.resource.change;

public class Main {
    public static void main(String[] args) {
        String name = "测试";
//        FileUtil.readFile()
//        convertStringToHex(name);
    }


    private static void convertStringToHex(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            String charToHex = Integer.toHexString(c);
            stringBuilder.append(charToHex);
        }

        System.out.println("Converted Hex from String: " + stringBuilder.toString());
    }
}
