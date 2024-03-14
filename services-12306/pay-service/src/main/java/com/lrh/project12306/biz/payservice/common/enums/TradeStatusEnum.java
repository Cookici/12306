package com.lrh.project12306.biz.payservice.common.enums;

import cn.hutool.core.collection.ListUtil;
import com.lrh.project12306.framework.starter.convention.exception.ServiceException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.common.enums
 * @ClassName: TradeStatusEnum
 * @Author: 63283
 * @Description: 交易状态枚举 映射不同平台状态码，最终入库的值为枚举名
 * @Date: 2024/3/11 12:22
 */

public enum TradeStatusEnum {
    /**
     * 交易创建，等待买家付款
     */
    WAIT_BUYER_PAY {
        @Override
        public Integer tradeCode() {
            return 0;
        }

        @Override
        protected List<String> tradeStatus() {
            return ListUtil.of("WAIT_BUYER_PAY");
        }
    },

    /**
     * 未付款交易超时关闭，或支付完成后全额退款/部分退款
     */
    TRADE_CLOSED {
        @Override
        public Integer tradeCode() {
            return 10;
        }

        @Override
        protected List<String> tradeStatus() {
            return ListUtil.of("TRADE_CLOSED");
        }
    },

    /**
     * 交易支付成功
     */
    TRADE_SUCCESS {
        @Override
        public Integer tradeCode() {
            return 20;
        }

        @Override
        protected List<String> tradeStatus() {
            return ListUtil.of("TRADE_SUCCESS");
        }
    },

    /**
     * 交易结束，不可退款
     */
    TRADE_FINISHED {
        @Override
        public Integer tradeCode() {
            return 30;
        }

        @Override
        protected List<String> tradeStatus() {
            return ListUtil.of("TRADE_FINISHED");
        }
    };

    /**
     * 获取交易状态码
     */
    public abstract Integer tradeCode();

    /**
     * 获取交易状态集合
     */
    protected abstract List<String> tradeStatus();

    /**
     * 查询真实的交易状态
     *
     * @param tradeStatus 三方交易状态
     * @return 真实的交易状态，入库使用
     */
    public static String queryActualTradeStatus(String tradeStatus) {
        Optional<TradeStatusEnum> tradeStatusEnum = Arrays.stream(TradeStatusEnum.values()).filter(each -> each.tradeStatus().contains(tradeStatus)).findFirst();
        return tradeStatusEnum.orElseThrow(() -> new ServiceException("未找到支付状态")).toString();
    }

    /**
     * 查询真实的交易状态
     *
     * @param tradeStatus 三方交易状态
     * @return 真实的交易状态，入库使用
     */
    public static Integer queryActualTradeStatusCode(String tradeStatus) {
        Optional<TradeStatusEnum> tradeStatusEnum = Arrays.stream(TradeStatusEnum.values()).filter(each -> each.tradeStatus().contains(tradeStatus)).findFirst();
        return tradeStatusEnum.orElseThrow(() -> new ServiceException("未找到支付状态")).tradeCode();
    }
}
