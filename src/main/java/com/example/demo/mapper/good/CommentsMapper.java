package com.example.demo.mapper.good;

import com.example.demo.entity.good.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentsMapper {

    // 添加一条评论
    int addComment(Comments comment);

    // 修改一条评论
    int updateComment(@Param("id") int id, @Param("text") String text, @Param("score") int score);

    // 删除一条评论
    int delComment(@Param("id") int id);
}
