package com.evostar.netty.attribute;

import com.evostar.netty.utils.Session;
import io.netty.util.AttributeKey;

/**
 * 用于缓存到 channel 中的属性的键
 */
public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
