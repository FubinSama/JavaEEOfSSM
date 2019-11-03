package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource(name = "testDao") //相当于@AAutowired，@Autowired默认按照Bean类型装配
   private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
