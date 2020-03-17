package com.imooc.luckymoney;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    private BigDecimal MinMoney;
    private BigDecimal MaxMoney;

    public BigDecimal getMinMoney() {
        return MinMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        MinMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return MaxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        MaxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

}
