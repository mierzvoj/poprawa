package pjatk;

import javax.validation.*;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.*;
import javax.validation.*;
/*
public class ShopValidator implements ConstraintValidator<shopName, String> {
    private String validName;

    @Override
    public boolean isValid(shopName, ConstraintValidatorContext constraintValidatorContext) {
        String regex = "[a-zA-Z]";
        return shopName.matches(regex) == true && shopName.length() >= 6;
    }

    @Override
    public void initialize(shopName constraintAnnotation) {
        String validVar = constraintAnnotation.key();

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }


}
*/