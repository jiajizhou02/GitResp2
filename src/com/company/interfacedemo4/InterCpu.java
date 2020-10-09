package com.company.interfacedemo4;

public class InterCpu implements CPU{
    private  String brand;
    private  String HZ;

    @Override
    public String getBrand() {

        return "inter";
    }

    @Override
    public String getHZ() {

        return "2000";
    }


    //criteria.andEqualTo(ConstantValue.recordId, upEntity.getRecordId());

    //criteria.andEqualTo(ConstantValue.DelSign, ConstantValue.FALSE);

    //criteria.andEqualTo(ConstantValue.lastupTxStamp, oldLastupTxStamp);

}
