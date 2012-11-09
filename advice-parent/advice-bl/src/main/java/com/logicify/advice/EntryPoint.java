package com.logicify.advice;

import com.logicify.advice.domain.Community;
import com.logicify.advice.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * User: knorr
 * Date: 10/30/12
 * Time: 7:17 PM
 */
public class EntryPoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(EntryPoint.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MongoOperations mongoOperations = (MongoOperations) context.getBean("mongoTemplate");


        Community community = new Community("Developers", "Developers community");
        mongoOperations.insert(community);
        User user = new User("John Dou", "5f4dcc3b5aa765d61d8327deb882cf99", "trololo@com.com");
        user.setCommunity(community);
        mongoOperations.insert(user);

        User userFromDb = mongoOperations.findById(user.getId(), User.class);
        LOGGER.info(String.format("User : %s saved!", user));
    }
}
