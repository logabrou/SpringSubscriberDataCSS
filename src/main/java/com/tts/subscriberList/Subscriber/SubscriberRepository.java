package com.tts.subscriberList.Subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;


public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
	

}


