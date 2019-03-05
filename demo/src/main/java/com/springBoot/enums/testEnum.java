package com.springBoot.enums;

public enum  testEnum {
    枚举1("1"),枚举2("2"),枚举3("3"),枚举4("4") ;
    private String code;

    private testEnum(String code) {
        this.code = code;
    }

    public static String testEnum(String code){
        switch (code){
            case "1" : return testEnum.枚举1.name();
            case "2" : return testEnum.枚举2.name();
            case "3" : return testEnum.枚举3.name();
            case "4" : return testEnum.枚举4.name();
            default : return testEnum.枚举1.name();
        }
    }


    public String getCode() {
        return code;
    }
}
