package cn.iyanyu.rocketmq.core.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Optional;

@ConfigurationProperties(
    prefix = "app.mq.producer"
)
public class RocketMQProducerProperties {
    private RocketConfig rocketmq;

    public RocketMQProducerProperties() {
    }

    public RocketConfig getRocketmq() {
        return (RocketConfig) Optional.ofNullable(this.rocketmq).orElse(new RocketConfig());
    }

    public void setRocketmq(RocketConfig rocketmq) {
        this.rocketmq = rocketmq;
    }

    public static class RocketConfig {
        private int sendMsgTimeout = 10000;
        private int requestMsgTimeout = 10000;
        private int compressMsgBodyOverHowmuch = 4096;
        private int retryTimesWhenSendFailed = 2;
        private int retryTimesWhenSendAsyncFailed = 2;
        private int maxMessageSize = 4194304;
        private int topicQueueNums = 16;
        private boolean enableMsgTrace = true;
        private String customizedTraceTopic;
        private String accessKey;
        private String secretKey;

        public RocketConfig() {
        }

        public int getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public void setSendMsgTimeout(int sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
        }

        public int getRequestMsgTimeout() {
            return this.requestMsgTimeout;
        }

        public void setRequestMsgTimeout(int requestMsgTimeout) {
            this.requestMsgTimeout = requestMsgTimeout;
        }

        public int getCompressMsgBodyOverHowmuch() {
            return this.compressMsgBodyOverHowmuch;
        }

        public void setCompressMsgBodyOverHowmuch(int compressMsgBodyOverHowmuch) {
            this.compressMsgBodyOverHowmuch = compressMsgBodyOverHowmuch;
        }

        public int getRetryTimesWhenSendFailed() {
            return this.retryTimesWhenSendFailed;
        }

        public void setRetryTimesWhenSendFailed(int retryTimesWhenSendFailed) {
            this.retryTimesWhenSendFailed = retryTimesWhenSendFailed;
        }

        public int getRetryTimesWhenSendAsyncFailed() {
            return this.retryTimesWhenSendAsyncFailed;
        }

        public void setRetryTimesWhenSendAsyncFailed(int retryTimesWhenSendAsyncFailed) {
            this.retryTimesWhenSendAsyncFailed = retryTimesWhenSendAsyncFailed;
        }

        public int getMaxMessageSize() {
            return this.maxMessageSize;
        }

        public void setMaxMessageSize(int maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
        }

        public int getTopicQueueNums() {
            return this.topicQueueNums;
        }

        public void setTopicQueueNums(int topicQueueNums) {
            this.topicQueueNums = topicQueueNums;
        }

        public boolean isEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public void setEnableMsgTrace(boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
        }

        public String getCustomizedTraceTopic() {
            return this.customizedTraceTopic;
        }

        public void setCustomizedTraceTopic(String customizedTraceTopic) {
            this.customizedTraceTopic = customizedTraceTopic;
        }

        public String getAccessKey() {
            return this.accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return this.secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }
}