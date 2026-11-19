package cn.iyanyu.rocketmq.core.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ConditionalOnProperty(
        prefix = "app.mq.consumer",
        name = {"mqType"},
        havingValue = "rocketmq",
        matchIfMissing = false
)
public @interface ConditionalOnRocketMQConsumer {
}
