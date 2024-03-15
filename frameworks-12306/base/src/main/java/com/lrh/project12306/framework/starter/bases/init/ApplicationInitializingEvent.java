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

package com.lrh.project12306.framework.starter.bases.init;

import org.springframework.context.ApplicationEvent;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.bases.init
 * @ClassName: ApplicationInitializingEvent
 * @Author: 63283
 * @Description: 应用初始化事件
 * 规约事件，通过此事件可以查看业务系统所有初始化行为
 * @Date: 2024/3/6 0:06
 */

public class ApplicationInitializingEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     * @param source source – the object on which the event initially occurred or with which the event is associated (never null)
     */
    public ApplicationInitializingEvent(Object source) {
        super(source);
    }
}
