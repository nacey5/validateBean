package com.hzh.validatebean.core.user.validate;

import com.hzh.validatebean.core.user.dto.User;
import lombok.Data;

/**
 * @author dahuanggo
 */

@Data
public class Properties {
    String call;
    @NotEmptyAccount
    User user;
}
