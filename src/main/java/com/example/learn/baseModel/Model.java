package com.example.learn.baseModel;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.util.Reflection;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
public class Model implements Serializable {

    @Override
    public String toString() {
        return Reflection.MAIN_PARM_TYPES.toString();
    }
}
