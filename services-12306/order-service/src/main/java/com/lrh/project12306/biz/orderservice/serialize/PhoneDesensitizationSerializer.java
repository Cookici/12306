package com.lrh.project12306.biz.orderservice.serialize;

import cn.hutool.core.util.DesensitizedUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.serialize
 * @ClassName: PhoneDesensitizationSerializer
 * @Author: 63283
 * @Description: 手机号脱敏反序列化
 * @Date: 2024/3/11 11:47
 */

public class PhoneDesensitizationSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String phone, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String phoneDesensitization = DesensitizedUtil.mobilePhone(phone);
        jsonGenerator.writeString(phoneDesensitization);
    }
}
