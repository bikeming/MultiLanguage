package com.bikeming.multilanguage;

/**
 * @ClassName: com.bikeming.multilanguage
 * @Description:
 * @author: fjm
 * @date: 2019/8/21 15:49
 * @Version:1.0
 */
public class LanguageBean {
    private String realName;
    private String localeName;

    public LanguageBean(String realName, String localeName) {
        this.realName = realName;
        this.localeName = localeName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }
}
