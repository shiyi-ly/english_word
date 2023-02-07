package com.english.word.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class VocabularyEveryDayTest {

    @Autowired
    private VocabularyEveryDay vocabularyEveryDay;

    @Test
    public void init() {
        System.out.println("开始测试-----------------");
        vocabularyEveryDay.vocabularyTask();
    }

}