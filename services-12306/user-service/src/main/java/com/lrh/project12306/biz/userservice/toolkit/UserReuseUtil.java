package com.lrh.project12306.biz.userservice.toolkit;

import static com.lrh.project12306.biz.userservice.common.constant.Index12306Constant.USER_REGISTER_REUSE_SHARDING_COUNT;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.tooltik
 * @ClassName: UserReuseUtil
 * @Author: 63283
 * @Description: 用户名可复用工具类
 * @Date: 2024/3/7 17:58
 */

public final class UserReuseUtil {
    /**
     * 计算分片位置
     */
    public static int hashShardingIdx(String username) {
        return Math.abs(username.hashCode() % USER_REGISTER_REUSE_SHARDING_COUNT);
    }
}
