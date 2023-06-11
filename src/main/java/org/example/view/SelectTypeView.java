package org.example.view;

import java.util.Arrays;

public enum SelectTypeView {

    GET_LOG(1, "조회"),
    CALCULATE(2, "계산"),
    STOP(3, "중단");

    private  int num;
    private final String option;

    SelectTypeView(int num, String option) {
        this.num = num;
        this.option = option;
    }

    public static SelectTypeView findByNum(String num){
        Integer workNum = Integer.valueOf(num);
        for(SelectTypeView stv : SelectTypeView.values()){
            if(stv.num == workNum){
                return stv;
            }
        }
        return null;
    }

}
