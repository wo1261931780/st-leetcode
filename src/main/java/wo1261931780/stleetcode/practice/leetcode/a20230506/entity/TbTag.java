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
    * 标签表
    */
@ApiModel(description="标签表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "interview.tb_tag")
public class TbTag implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 标签值
     */
    @TableField(value = "`label`")
    @ApiModelProperty(value="标签值")
    private String label;

    /**
     * 点击次数
     */
    @TableField(value = "`count`")
    @ApiModelProperty(value="点击次数")
    private Integer count;

    /**
     * 分类
     */
    @TableField(value = "category")
    @ApiModelProperty(value="分类")
    private String category;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_LABEL = "label";

    public static final String COL_COUNT = "count";

    public static final String COL_CATEGORY = "category";
}