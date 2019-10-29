package com.jnservice.service;

import bean.Person;
import mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonMapper personMapper;
    /**
     * 测试
     * **/
    public void queryPerson()
    {
        System.out.println(personMapper.queryPerson().size());
    }

    /**
     * 验证是否登录成功
     * param：个人或者团队登录
     * **/
    public boolean isLogin(String type,String username,String password)
    {
        // 1 首先判断个人或者团队登录
        if(type.equals("1"))
        {
            // 个人赛
            List<Person> persons=personMapper.queryPerson();
            for(Person person:persons)
            {
                if(username.equals(person.getUsername())&&password.equals(person.getPassword()))
                {
                    return true;
                }
            }
            return false;
        }
        // 2 if else 与数据库中的账号进行比对
        // 3 若成功，返回true.否则 false
        else
            {
                // 团队赛功能暂时保留
                return false;
            }

    }
}
