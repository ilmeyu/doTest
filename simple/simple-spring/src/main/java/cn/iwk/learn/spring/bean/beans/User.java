package cn.iwk.learn.spring.bean.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author iwk
 * @date 2020/4/6 9:40 下午
 * @since 1.0.0
 **/
@Getter
@Setter
@ToString
public class User {

    private String id;

    private String userName;

    private String email;

}