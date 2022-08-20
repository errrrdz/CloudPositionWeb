package position.web.redis.listener;

import position.web.util.BaseMap;

/**
 * 自定义消息监听
 */
public interface RedisListener {

    void onMessage(BaseMap message);
}
