package wo1261931780.stleetcode.practice.leetcode.a20230506.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
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
    * 用户收藏问题记录表
    */
@ApiModel(description="用户收藏问题记录表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_user_collected_question")
public class TbUserCollectedQuestion implements Serializable {
    /**
     * 用户
     */
    @TableId(value = "username", type = IdType.INPUT)
    @ApiModelProperty(value="用户")
    private String username;

    /**
     * 问题ID
     */
    @TableId(value = "question_id", type = IdType.INPUT)
    @ApiModelProperty(value="问题ID")
    private String questionId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_USERNAME = "username";

    public static final String COL_QUESTION_ID = "question_id";

    public static final String COL_CREATE_TIME = "create_time";
}