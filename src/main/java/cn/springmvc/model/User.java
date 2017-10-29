package cn.springmvc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * @author caowencheng<845982120@qq.com>
 * @create 2017-10-27 22:58
 **/

@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    private String sex;

    private int age;

}
