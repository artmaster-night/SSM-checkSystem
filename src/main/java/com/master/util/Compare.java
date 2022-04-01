package com.master.util;

import com.master.domain.CheckList;

import java.util.List;

/**
 * @author artmaster
 */
public class Compare {
    public boolean isIn(Integer id,List<CheckList> checkLists) {
        boolean result=false;
        if (checkLists!=null){
            for (CheckList checkList:checkLists){
                if (id.equals(checkList.getId())) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
