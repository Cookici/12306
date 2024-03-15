/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query;

import com.lrh.project12306.biz.ticketservice.common.enums.TicketChainMarkEnum;
import com.lrh.project12306.biz.ticketservice.dto.req.TicketPageQueryReqDTO;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query
 * @ClassName: TrainTicketQueryChainFilter
 * @Author: 63283
 * @Description: 列车车票查询过滤器
 * @Date: 2024/3/7 23:07
 */

public interface TrainTicketQueryChainFilter <T extends TicketPageQueryReqDTO> extends AbstractChainHandler<TicketPageQueryReqDTO> {
    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_QUERY_FILTER.name();
    }
}