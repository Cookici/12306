package com.lrh.project12306.biz.userservice.serialize;

import cn.hutool.core.util.DesensitizedUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.serialize
 * @ClassName: IdCardDesensitizationSerializer
 * @Author: 63283
 * @Description: 身份证号脱敏反序列化
 * @Date: 2024/3/7 17:57
 */

public class IdCardDesensitizationSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String idCard, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String idCardDesensitization = DesensitizedUtil.idCardNum(idCard, 4, 4);
        jsonGenerator.writeString(idCardDesensitization);
    }
}
