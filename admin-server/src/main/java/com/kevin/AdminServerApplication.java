package com.kevin;

import com.kevin.dd.DingTalkStatusChangeNotifier;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: kevin
 * @create: 2020-09-09 12:35
 */

@EnableAdminServer
@SpringBootApplication
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

    @Bean
    public DingTalkStatusChangeNotifier dingDingNotifier(InstanceRepository repository) {
        return new DingTalkStatusChangeNotifier(repository);
    }

}
