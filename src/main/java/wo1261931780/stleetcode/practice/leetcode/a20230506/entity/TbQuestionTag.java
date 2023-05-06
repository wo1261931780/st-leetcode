package wo1261931780.stleetcode.practice.leetcode.a20230506.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*Created by Intellij IDEA.
*Project:st-leetcode
*Package:wo1261931780.stleetcode.practice.leetcode.a20230506.entity
*@author liujiajun_junw
*@Date 2023-05-20-10  星期六
*@description 
*/
/**
    * 问题标签关联表
    */
@ApiModel(description="问题标签关联表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_question_tag")
public class TbQuestionTag implements Serializable {
    /**
     * 标签ID
     */
    @TableId(value = "tag_id", type = IdType.INPUT)
    @ApiModelProperty(value="标签ID")
    private Integer tagId;

    /**
     * 问题ID
     */
    @TableId(value = "question_id", type = IdType.INPUT)
    @ApiModelProperty(value="问题ID")
    private String questionId;

    private static final long serialVersionUID = 1L;

    public static final String COL_TAG_ID = "tag_id";

    public static final String COL_QUESTION_ID = "question_id";
}