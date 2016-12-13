package com.irelandlight.mapper;

import java.util.List;
import com.irelandlight.vo.NewsContent;
import org.springframework.stereotype.Repository;

/**
 * Created by mr.w on 2016/12/9.
 */
@Repository
public interface News {
    //查询公告的id,content,title,productorName
    List<NewsContent> selectNewsContent()throws Exception;
}
