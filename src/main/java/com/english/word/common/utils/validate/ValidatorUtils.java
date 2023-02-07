package com.english.word.common.utils.validate;

import com.english.word.common.exception.BusinessException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


/**
 * @author shiyi on 2021/3/4 23:34
 */
public class ValidatorUtils {

    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    /**
     * 校验对象
     * @param object d对象
     * @param groups 校验组
     * @throws BusinessException 异常
     */
    public static void validateEntity(Object object, Class<?>... groups)
            throws BusinessException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
        if (!constraintViolations.isEmpty()) {
            StringBuilder msg = new StringBuilder();
            constraintViolations.stream().findFirst().ifPresent(constraint -> msg.append(constraint.getMessage()));
            throw new BusinessException(msg.toString());
        }
    }
}
