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
    * 评论表
    */
@ApiModel(description="评论表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_comment")
public class TbComment implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 评论，关联tb_editor_data
     */
    @TableField(value = "`comment`")
    @ApiModelProperty(value="评论，关联tb_editor_data")
    private Integer comment;

    /**
     * 评论的question
     */
    @TableField(value = "question_id")
    @ApiModelProperty(value="评论的question")
    private String questionId;

    /**
     * 回复的评论ID，为0则为问题的首评
     */
    @TableField(value = "reply_id")
    @ApiModelProperty(value="回复的评论ID，为0则为问题的首评")
    private Integer replyId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 创建用户
     */
    @TableField(value = "create_user")
    @ApiModelProperty(value="创建用户")
    private String createUser;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_COMMENT = "comment";

    public static final String COL_QUESTION_ID = "question_id";

    public static final String COL_REPLY_ID = "reply_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER = "create_user";
}