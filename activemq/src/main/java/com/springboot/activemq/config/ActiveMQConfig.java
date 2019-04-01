package com.springboot.activemq.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class ActiveMQConfig {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    /*
     * 定义消息转换器
     * @author Reich
     * @date 2019/4/1
     */
    @Bean
    public MessageConverter messageConverter(){
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setTargetType(MessageType.TEXT);
        messageConverter.setTypeIdPropertyName("_type");
        return messageConverter;
    }


    /*自定义重试机制
     *
     * @author Reich
     * @date 2019/4/1
     */
    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(){

        RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy();
        //重试次数
        redeliveryPolicy.setMaximumRedeliveries(3);
        //初次重试延迟时间
        redeliveryPolicy.setInitialRedeliveryDelay(3000);
        //每次重试延迟时间
        redeliveryPolicy.setRedeliveryDelay(2000);

        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setRedeliveryPolicy(redeliveryPolicy);
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        return activeMQConnectionFactory;

    }



    @Bean
    public JmsListenerContainerFactory topicjmsListenerContainerFactory(ConnectionFactory connectionFactory,
                                                                        DefaultJmsListenerContainerFactoryConfigurer config){

        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        config.configure(factory, connectionFactory);
        //设置发布订阅模式
        factory.setPubSubDomain(true);
        //设置线程
        //factory.setConcurrency("3-10");
        return factory;
    }

}
