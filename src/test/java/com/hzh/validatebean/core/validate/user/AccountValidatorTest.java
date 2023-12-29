package com.hzh.validatebean.core.validate.user;

import com.hzh.validatebean.core.user.dto.User;
import com.hzh.validatebean.core.user.validate.AccountValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintValidatorContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class AccountValidatorTest {

    private AccountValidator validator;
    private ConstraintValidatorContext context;

    @BeforeEach
    public void setUp() {
        validator = new AccountValidator();
        context = mock(ConstraintValidatorContext.class);
    }

    @Test
    public void testIsValid_withValidAccount() {
        User user = new User();
        user.setAccount("validAccount");

        assertTrue(validator.isValid(user, context));
    }

    @Test
    public void testIsValid_withNullAccount() {
        User user = new User();
        user.setAccount(null);

        assertFalse(validator.isValid(user, context));
    }

    @Test
    public void testIsValid_withEmptyAccount() {
        User user = new User();
        user.setAccount("");

        assertFalse(validator.isValid(user, context));
    }

    @Test
    public void testIsValid_withNullUser() {
        assertFalse(validator.isValid(null, context));
    }
}
