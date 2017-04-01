package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum ECareer {
    Career1("政府機關"),
    Career2("國營/國辦民營"),
    Career3("軍人"),
    Career4("警察"),
    Career5("教育/研究"),
    Career6("經商"),
    Career7("建築/營造"),
    Career8("金融/保險"),
    Career9("製造供應商"),
    Career10("房地產"),
    Career11("資訊科技"),
    Career12("服務"),
    Career13("農漁牧"),
    Career14("醫療/保健"),
    Career15("法律"),
    Career16("零售流通"),
    Career17("交通/運輸"),
    Career18("旅遊"),
    Career19("傳媒娛樂"),
    Career20("出版"),
    Career21("藝術"),
    Career22("行銷企劃"),
    Career23("學生"),
    Career24("待業"),

    Career99("其他"),
    ;

    private String name;
    ECareer(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
