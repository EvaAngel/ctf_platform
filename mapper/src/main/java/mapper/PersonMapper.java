package mapper;

import bean.Person;

import java.util.List;

public interface PersonMapper {
    //根据不同的权限查询不同的数据
    List<Person> queryPerson();

}
