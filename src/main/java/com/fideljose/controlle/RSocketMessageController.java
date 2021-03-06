package com.fideljose.controlle;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.fideljose.model.Message;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class RSocketMessageController {

	@MessageMapping("request-response")
	public Mono<Message> consumeSocketMethod(final Message message){
		log.info("message in {}", message);
		return Mono.just(new Message("data is -> " + message.getMessage()));
	}
	
}
