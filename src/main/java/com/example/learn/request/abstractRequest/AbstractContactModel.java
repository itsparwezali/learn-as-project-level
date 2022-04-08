package com.example.learn.request.abstractRequest;

import com.example.learn.baseModel.Model;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.io.Serializable;

import static com.example.learn.constant.DataTypeStander.*;

@Data
public abstract class AbstractContactModel implements Serializable {

    @NotBlank(message = "Email address cannot be blank")
    @Size(max =EMAIL_MAX , message = "Email address cannot be less than {max}")
    @Email(message = "Invalid email")
    private String emailAddress;

    @NotBlank(message = "Mobile number cannot be blank")
    @Size(min = MOBILE_NUMBER_MIN, max = MOBILE_NUMBER_MAX, message = "Mobile number should be {max} digit")
    @Pattern(regexp = MOBILE_NUMBER_REGEX)
    private String mobileNumber;
}
