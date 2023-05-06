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
    * 问题表
    */
@ApiModel(description="问题表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_question")
public class TbQuestion implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private String id;

    /**
     * 提问标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="提问标题")
    private String title;

    /**
     * 标签，多个逗号分隔
     */
    @TableField(value = "tags")
    @ApiModelProperty(value="标签，多个逗号分隔")
    private String tags;

    /**
     * 问题(关联tb_editor_data表)
     */
    @TableField(value = "question")
    @ApiModelProperty(value="问题(关联tb_editor_data表)")
    private Integer question;

    /**
     * 答案(关联tb_editor_data表),未回答为0
     */
    @TableField(value = "answer")
    @ApiModelProperty(value="答案(关联tb_editor_data表),未回答为0")
    private Integer answer;

    /**
     * 状态：1.已上架 0已下架
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态：1.已上架 0已下架")
    private Boolean status;

    /**
     * 问题回复人
     */
    @TableField(value = "answerer")
    @ApiModelProperty(value="问题回复人")
    private String answerer;

    /**
     * 是否精品
     */
    @TableField(value = "classic")
    @ApiModelProperty(value="是否精品")
    private Boolean classic;

    /**
     * 创建者
     */
    @TableField(value = "create_user")
    @ApiModelProperty(value="创建者")
    private String createUser;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新者
     */
    @TableField(value = "update_user")
    @ApiModelProperty(value="更新者")
    private String updateUser;

    @TableField(value = "update_time")
    @ApiModelProperty(value="")
    private Date updateTime;

    /**
     * 是否删除，1为是，0为否
     */
    @TableField(value = "delete_flag")
    @ApiModelProperty(value="是否删除，1为是，0为否")
    private Boolean deleteFlag;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_TAGS = "tags";

    public static final String COL_QUESTION = "question";

    public static final String COL_ANSWER = "answer";

    public static final String COL_STATUS = "status";

    public static final String COL_ANSWERER = "answerer";

    public static final String COL_CLASSIC = "classic";

    public static final String COL_CREATE_USER = "create_user";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_USER = "update_user";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_DELETE_FLAG = "delete_flag";
}