package com.nanhaidetianzhi.rabbitmq.sender;
import com.nanhaidetianzhi.model.OrderInfo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i)  {
        String context = "男孩的天职  spring boot rabbitmq project "+i;
        amqpTemplate.convertAndSend("hello",context);
    }
    public void sendDocker()  {
        OrderInfo orderInfo=new OrderInfo();
        orderInfo.setAge(500);
        orderInfo.setCreateTime(new Date());
        orderInfo.setUserName("男孩的天职");
        amqpTemplate.convertAndSend("order",orderInfo);
    }



}
