package com.example.medi.stoolurine;


public class ReportItem {
    private String record_pk,date,tag,val1, val2;
    public ReportItem(String record_pk, String date, String tag, String val1, String val2){
        this.record_pk=record_pk;
        this.date=date;
        this.tag=tag;
        this.val1=val1;
        this.val2= val2;
    }

    public String getRecordPk(){return this.record_pk;}
    public String getDate(){
        return this.date;
    }

    public String getTag(){
        return this.tag;
    }

    public String getVal1(){
        return this.val1;
    }
    public String getVal2(){
        return this.val2;
    }
}
