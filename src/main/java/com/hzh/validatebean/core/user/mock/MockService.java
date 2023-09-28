package com.hzh.validatebean.core.user.mock;

import com.hzh.validatebean.core.user.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName MockService
 * @Description TODO
 * @Author DaHuangGo
 * @Date 2023/9/26 18:04
 * @Version 0.0.1
 **/

@Service
@Slf4j
public class MockService {

    public Boolean add(User user) {
        log.info(user.getAccount());
        return true;
    }
}
