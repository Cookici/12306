package com.lrh.project12306.biz.userservice.common.constant;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.common.constant
 * @ClassName: RedisKeyConstant
 * @Author: 63283
 * @Description: Redis Key 定义常量类
 * @Date: 2024/3/7 17:45
 */

public class RedisKeyConstant {
    /**
     * 用户注册锁，Key Prefix + 用户名
     */
    public static final String LOCK_USER_REGISTER = "index12306-user-service:lock:user-register:";

    /**
     * 用户注销锁，Key Prefix + 用户名
     */
    public static final String USER_DELETION = "index12306-user-service:user-deletion:";

    /**
     * 用户注册可复用用户名分片，Key Prefix + Idx
     */
    public static final String USER_REGISTER_REUSE_SHARDING = "index12306-user-service:user-reuse:";

    /**
     * 用户乘车人列表，Key Prefix + 用户名
     */
    public static final String USER_PASSENGER_LIST = "index12306-user-service:user-passenger-list:";
}
