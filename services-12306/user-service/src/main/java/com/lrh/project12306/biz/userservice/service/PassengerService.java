package com.lrh.project12306.biz.userservice.service;

import java.util.List;

import com.lrh.project12306.biz.userservice.dto.req.PassengerRemoveReqDTO;
import com.lrh.project12306.biz.userservice.dto.req.PassengerReqDTO;
import com.lrh.project12306.biz.userservice.dto.resp.PassengerActualRespDTO;
import com.lrh.project12306.biz.userservice.dto.resp.PassengerRespDTO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 乘车人接口层
 * @Date: 2024/3/7 18:06
 */

public interface PassengerService {

    /**
     * 根据用户名查询乘车人列表
     *
     * @param username 用户名
     * @return 乘车人返回列表
     */
    List<PassengerRespDTO> listPassengerQueryByUsername(String username);

    /**
     * 根据乘车人 ID 集合查询乘车人列表
     *
     * @param username 用户名
     * @param ids      乘车人 ID 集合
     * @return 乘车人返回列表
     */
    List<PassengerActualRespDTO> listPassengerQueryByIds(String username, List<Long> ids);

    /**
     * 新增乘车人
     *
     * @param requestParam 乘车人信息
     */
    void savePassenger(PassengerReqDTO requestParam);

    /**
     * 修改乘车人
     *
     * @param requestParam 乘车人信息
     */
    void updatePassenger(PassengerReqDTO requestParam);

    /**
     * 移除乘车人
     *
     * @param requestParam 移除乘车人信息
     */
    void removePassenger(PassengerRemoveReqDTO requestParam);
}
