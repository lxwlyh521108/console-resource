package com.nanhaidetianzhi.rabbitmq.recevier;
import com.nanhaidetianzhi.model.OrderInfo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "order")
public class Receiver2 {

    @RabbitHandler
    public void receiver(OrderInfo orderInfo){
        System.out.println("order receiver:"+orderInfo.toString());
    }

}
