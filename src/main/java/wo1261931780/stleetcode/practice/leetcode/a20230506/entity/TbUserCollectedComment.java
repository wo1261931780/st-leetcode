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
    * 用户收藏评论记录表
    */
@ApiModel(description="用户收藏评论记录表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_user_collected_comment")
public class TbUserCollectedComment implements Serializable {
    /**
     * 用户
     */
    @TableId(value = "username", type = IdType.INPUT)
    @ApiModelProperty(value="用户")
    private String username;

    /**
     * 评论ID
     */
    @TableId(value = "comment_id", type = IdType.INPUT)
    @ApiModelProperty(value="评论ID")
    private Integer commentId;

    private static final long serialVersionUID = 1L;

    public static final String COL_USERNAME = "username";

    public static final String COL_COMMENT_ID = "comment_id";
}