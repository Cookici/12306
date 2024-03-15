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

package com.lrh.project12306.framework.starter.designpattern.chain;

import org.springframework.core.Ordered;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.designpattern.chain
 * @ClassName: AbstractChainHandler
 * @Author: 63283
 * @Description: 抽象业务责任链组件
 * @Date: 2024/3/6 17:57
 */

public interface AbstractChainHandler<T> extends Ordered {
    /**
     * 执行责任链逻辑
     *
     * @param requestParam 责任链执行入参
     */
    void handler(T requestParam);

    /**
     * @return 责任链组件标识
     */
    String mark();
}
