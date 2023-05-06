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
    * 用户浏览问题记录表
    */
@ApiModel(description="用户浏览问题记录表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_user_visited_question")
public class TbUserVisitedQuestion implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 用户
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户")
    private String username;

    /**
     * 问题ID
     */
    @TableField(value = "question_id")
    @ApiModelProperty(value="问题ID")
    private String questionId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_QUESTION_ID = "question_id";

    public static final String COL_CREATE_TIME = "create_time";
}