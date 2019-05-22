package com.gdou.car.business.car.dal.dto.carLocation;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.valobj.CarLocationCity2AddressesValobj;

import java.util.List;
import java.util.Map;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 8:53
 */
public class CarLocationAssociationResponse extends AbstractResponse {
    
    private static final long serialVersionUID = 686223598602508882L;
//    private String locationInfoId;
//
//    private String province;
//
//    private String city;
//
//    private String region;
//
//    private String adress;
    /**
     * 格式
       {
           {
               "city" : "",
               "addresses" : [
                   {
                       "locationInfoId" : ""
                       "address" : ""
                   }
               ]
           },
           {
               "city" : "",
               "addresses" : [
                   {
                       "locationInfoId" : ""
                       "address" : ""
                   }
               ]
           }
       }
     */
    List<CarLocationCity2AddressesValobj> city2AddressesValobjs;
    
    public List<CarLocationCity2AddressesValobj> getCity2AddressesValobjs() {
        return city2AddressesValobjs;
    }
    
    public void setCity2AddressesValobjs(List<CarLocationCity2AddressesValobj> city2AddressesValobjs) {
        this.city2AddressesValobjs = city2AddressesValobjs;
    }
}
